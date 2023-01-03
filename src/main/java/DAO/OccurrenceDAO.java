/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.OccurrenceDTO;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author gel
 */
public class OccurrenceDAO {
    private Connection con;
    private PreparedStatement pstm;
    private ResultSet rs;
    private final ArrayList occurrences = new ArrayList<>();
    
    public void registerOccurrence(OccurrenceDTO occurrenceDTO) {
        con = ConnectionDAO.getConnection();
        
        try {
            String sql = "INSERT INTO Occurrences (title, description, localization, occurrenceDate, status) VALUES (?, ?, ?, ?, ?)";
            
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
    
    public ArrayList<OccurrenceDTO>  listActiveOccurrences() {
        con = ConnectionDAO.getConnection();
        
        try {
            String sql = "SELECT * FROM Occurrences WHERE status=true";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String localization = rs.getString("localization");
                Date date = rs.getDate("occurrenceDate");
                boolean status = rs.getBoolean("status");
                   
                OccurrenceDTO occurrenceDTO = new OccurrenceDTO(id, title, description, localization, date, status);
                occurrences.add(occurrenceDTO);
            }
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
        
        return occurrences;
    }
    
        
    public ArrayList<OccurrenceDTO>  listInactiveOccurrences() {
        con = ConnectionDAO.getConnection();
        
        try {
            String sql = "SELECT * FROM Occurrences WHERE status=false";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String localization = rs.getString("localization");
                Date date = rs.getDate("occurrenceDate");
                boolean status = rs.getBoolean("status");
                   
                OccurrenceDTO occurrenceDTO = new OccurrenceDTO(id, title, description, localization, date, status);
                occurrences.add(occurrenceDTO);
            }
        } catch(SQLException error) {
            System.out.println("Error: " + error);
        }
        
        return occurrences;
    }
}
