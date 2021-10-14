package testswing4.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCconnection {
    
    private Connection con;
    private String url="jdbc:mysql://localhost:3306/java";
    private String user="root";
    private String password="";
    private String driver="com.mysql.jdbc.Driver";
    
    public Connection getCon() throws ClassNotFoundException{
        Class.forName(driver);
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    
    }
    
}
