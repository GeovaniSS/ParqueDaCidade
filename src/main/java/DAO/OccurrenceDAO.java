/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.OccurrenceDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gel
 */
public class OccurrenceDAO {
    Connection con;
    PreparedStatement pstm;
    
    public void registerOccurrence(OccurrenceDTO occurrenceDTO) {
        con = ConnectionDAO.getConnection();
        
        try {
            String sql = "INSERT INTO Occurrences (title, description, localization, occurenceDate, status) VALUES (?, ?, ?, ?, ?)";
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, occurrenceDTO.getTitle());
            pstm.setString(2, occurrenceDTO.getDescription());
            pstm.setString(3, occurrenceDTO.getLocalization());
            pstm.setDate(4, new java.sql.Date(occurrenceDTO.getDate().getTime()));
            pstm.setBoolean(5, occurrenceDTO.getStatus());
            
            pstm.execute();
            pstm.close();
            
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
