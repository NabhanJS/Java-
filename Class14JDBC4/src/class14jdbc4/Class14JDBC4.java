package class14jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC4 {
    static Connection con=null;
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";

    
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name");
        String name=sc.nextLine();
        System.out.println("enter ur email");
       String email=sc.nextLine();
       System.out.println("enter ur password");
       String password=sc.nextLine();
        
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student5 (name,email,password) values(?,?,?)";
        try {
            PreparedStatement ps=getCon().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.executeUpdate();
                      
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String abc="select*from student5";
        try {
            PreparedStatement ps1=getCon().prepareStatement(abc);
            ResultSet result;
            result=ps1.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC4.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
         }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC4.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }
    
}
