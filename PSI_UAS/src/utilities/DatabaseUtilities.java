/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author firgia
 */
public class DatabaseUtilities {
        public static Connection getConnection(){
        return getConnection("jdbc:mysql://localhost:3306/universitas", "root", "");
    }

    private static Connection getConnection(String url, String user, String pass){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException e){
            System.err.println(e.getMessage());
        }
        
        return conn;
    }
}
