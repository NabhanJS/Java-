package class14jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC5 {
    public static String url="jdbc:mysql://localhost:3306/java";
    public static String user="root";
    public static String password="";
    public static String driver="com.mysql.jdbc.Driver";
    public static Connection con;
   
    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name");
        String name=sc.nextLine();
         System.out.println("enter ur email");
        String email=sc.nextLine();
        
        Class.forName(driver);
        String sql="insert into student(name,email) values(?,?)";
        try {
            PreparedStatement pst=getCon().prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1="select*from student";
        try {
            PreparedStatement pst1=getCon().prepareStatement(sql1);
           
            ResultSet rs;
            rs=pst1.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC5.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC5.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    
    }
    
    
    
}
