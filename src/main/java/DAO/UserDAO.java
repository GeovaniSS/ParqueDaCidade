/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class UserDAO {
    private Connection con;
    private PreparedStatement pstm;
    
    public void register(UserDTO userDTO) {
        con = ConnectionDAO.getConnection();
        
         try {
            String sql = "INSERT INTO Occurrences (title, description, localization, occurrenceDate, status) VALUES (?, ?, ?, ?, ?)";
            
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

    public void login() {
    }

    public void logout() {
    }
}
