/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gel
 */
public class ConnectionDAO {
    public static Connection con = null;
    
    public static Connection getConnection() {
        System.out.println("Conectando ao banco...");
        
        try {
            String url = "jdbc:mysql://localhost:3306/ParqueDaCidade?user=root&password=12345678";
            con =  DriverManager.getConnection(url);
            System.out.println("Conectado.");
        }  catch(SQLException e) {
            System.out.println(e);
             throw new RuntimeException(e);
        }
        
        return con;
    }
}
