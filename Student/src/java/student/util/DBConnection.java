/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nabha
 */
public class DBConnection {
    
    private static Connection con;
    private static String url="jdbc:mysql://localhost:3306/java";
    private static String user="root";
    private static String password;
    
    
    public static Connection getCon() throws ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        try {
            con=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    return con;
    }
    
    
}
