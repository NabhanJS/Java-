package class14jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC1 {
    
    static Connection con=null;
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";

  
    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter ur name");
        String name=sc.nextLine();
        System.out.println("Please enter ur email");
         String email=sc.nextLine(); 
         
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student3(name,email) values(?,?)";
        try {
            PreparedStatement abc=getCon().prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC1.class.getName()).log(Level.SEVERE, null, ex);
        }
      
           
        
    }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    
    }
    
}
