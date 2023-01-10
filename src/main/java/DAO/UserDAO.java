/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.OccurrenceDTO;
import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class UserDAO {
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public void registerUser(UserDTO userDTO) {
        con = ConnectionDAO.getConnection();
        
         try {
            String sql = "INSERT INTO Users (name, email, passwd) VALUES (?, ?, ?)";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, userDTO.getName());
            pstm.setString(2, userDTO.getEmail());
            pstm.setString(3, userDTO.getPassword());
            
            pstm.execute();
            pstm.close();
            
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
    }

    public void login(UserDTO userDTO) {
        con = ConnectionDAO.getConnection();
        
        try {
            String sql = "SELECT * FROM Users WHERE email=? AND passwd=?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, userDTO.getEmail());
            pstm.setString(2, userDTO.getPassword());
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String passwd = rs.getString("passwd");
                
                userDTO.setId(id);
                userDTO.setName(name);
                userDTO.setLoginStatus(true);
            }
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
    }
    
    public boolean checkUserExistance(UserDTO userDTO) {
        con = ConnectionDAO.getConnection();
        boolean userExists = false;
        
         try {
            String sql = "SELECT * FROM Users WHERE email=?";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, userDTO.getEmail());
            
            rs = pstm.executeQuery();
            
            if (rs.next()) {
                userExists = true;
            }
           
            pstm.execute();
            pstm.close();
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
        
        return userExists;
    }
}
