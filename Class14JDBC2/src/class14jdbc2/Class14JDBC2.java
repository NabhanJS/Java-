package class14jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC2 {
    
    static Connection con=null;
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name ");
        String name=sc.nextLine();
         System.out.println("enter ur email ");
         String email=sc.nextLine();
        
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student3(name,email) values(?,?)";
        try {
            PreparedStatement abc=getCon().prepareStatement(sql);
            abc.setString(1, name);
            abc.setString(2, email);
            abc.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1="select * from student3";
        try {
            PreparedStatement abc2=getCon().prepareStatement(sql1);
            ResultSet result;
            result=abc2.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
       
    
    }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }
    
}
