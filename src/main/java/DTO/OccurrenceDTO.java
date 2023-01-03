/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author gel
 */
public class OccurrenceDTO {
    private int id;
    private String title;
    private String description; 
    private String localization;
    private Date date;
    private boolean status;
    
    public OccurrenceDTO(String title, String description, String localization, Date date) {
        setTitle(title);
        setDescription(description);
        setLocalization(localization);
        setDate(date);
        setStatus(true);
    }
    
    public OccurrenceDTO(int id, String title, String description, String localization, Date date, boolean status) {
        setId(id);
        setTitle(title);
        setDescription(description);
        setLocalization(localization);
        setDate(date);
        setStatus(status);
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getTitle() {
        return this.title; 
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public String getLocalization() {
        return this.localization;
    }
    
    public Date getDate() {
        return this.date; 
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public void setLocalization(String localization) {
        this.localization = localization;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
}
