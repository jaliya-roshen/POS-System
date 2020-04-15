/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.possystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jaliya Roshen
 */
public class DBConnection {
    
    public static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        
        if (connection == null){
            
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", "newrootpassword");
        }
        return connection;
    }
    
}
