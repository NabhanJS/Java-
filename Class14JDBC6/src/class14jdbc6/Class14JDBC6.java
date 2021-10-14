package class14jdbc6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14JDBC6 {
    
    public static Connection con;
    public static String url="jdbc:mysql://localhost:3306/java";
    public static String user="root";
    public static String password="";
    public static String driver="com.mysql.jdbc.Driver";

    
    public static void main(String[] args) throws ClassNotFoundException {
      
        Class.forName(driver);
        String sql="select*from student";
        try {
            PreparedStatement pst=getcon().prepareStatement(sql);           
            ResultSet rst;
            rst=pst.executeQuery();
            while(rst.next()){
                System.out.println(rst.getString(1)+" "+rst.getString(2)+" "+rst.getString(3));
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getcon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14JDBC6.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return con;
    
    }
    
}
