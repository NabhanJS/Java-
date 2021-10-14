
package testswing9.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JdbcConnection {
    
    private String url="jdbc:mysql://localhost:3306/java";
    private String user="root";
    private String password="";
    private String driver="com.mysql.jdbc.Driver";
    private Connection con;
    
    public Connection getCon() throws SQLException{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        con=DriverManager.getConnection(url, user, password);
        
           
    return con;
    }
    
}
