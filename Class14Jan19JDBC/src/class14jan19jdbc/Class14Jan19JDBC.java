package class14jan19jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class14Jan19JDBC {
    
    static Connection con=null;
    static String url="jdbc:mysql://localhost:3306/java";
    static String user="root";
    static String password="";
    

    public static void main(String[] args) throws ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        String sql="insert into student1(name,email) values(?,?)";
        try {
            PreparedStatement pst=getCon().prepareStatement(sql);
            pst.setString(1, "Asif");
            pst.setString(2, "Asif@yahoo.com");
            pst.executeUpdate();
            System.out.println("good");
            
        } catch (SQLException ex) {
            Logger.getLogger(Class14Jan19JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql1="select*from student1";
        try {
            PreparedStatement pst1=getCon().prepareStatement(sql1);
            pst1.execute();
            ResultSet rs;
            rs=pst1.executeQuery();
            while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        
        }
                
        } catch (SQLException ex) {
            Logger.getLogger(Class14Jan19JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
              
    }
    
    public static Connection getCon(){
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(Class14Jan19JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }
    
}
