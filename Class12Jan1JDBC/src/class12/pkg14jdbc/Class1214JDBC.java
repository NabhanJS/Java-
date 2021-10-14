package class12.pkg14jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class1214JDBC {
    
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";
    static Connection con= null;
    

    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter ur name");
        String name=sc.nextLine();
        System.out.println("Please enter ur email");
        String email=sc.nextLine();
        System.out.println("Please enter ur country");
        String country=sc.nextLine();
        
        
        
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student4 (name,email,country) values(?,?,?)";
        try {
            PreparedStatement pst=getCon().prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, country);
            pst.executeUpdate();
            System.out.println("Good job");
        } catch (SQLException ex) {
            Logger.getLogger(Class1214JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1="select*from student4";
        try {
            PreparedStatement pst=getCon().prepareStatement(sql1);
            ResultSet result;
            result=pst.executeQuery();
            while(result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Class1214JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public static Connection getCon(){
        try {
            con= DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class1214JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }
    
}
