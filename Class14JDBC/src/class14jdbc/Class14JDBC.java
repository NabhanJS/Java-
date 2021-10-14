package class14jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC {
    static Connection con=null;
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";

    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter ur name ");
        String name=sc.nextLine();
        System.out.println("please enter ur email ");
        String email=sc.nextLine();
         
          
          
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student3(name,email) values(?,?)";
        try {
            PreparedStatement pst=getCon().prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.executeUpdate();
            System.out.println("Data save hoice");
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1="select*from student3";
        try {
            PreparedStatement pst1=getCon().prepareStatement(sql1);
            ResultSet result;
            result=pst1.executeQuery();
            while(result.next()){
                System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    
    }
    
}
