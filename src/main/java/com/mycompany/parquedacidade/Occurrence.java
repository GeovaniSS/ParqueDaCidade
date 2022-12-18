/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedacidade;

import java.util.Date;

/**
 *
 * @author bernardo
 */
public class Occurrence {
    private String title;
    private String description;
    private String localization;
    private Date date;
    private boolean status = true;
    
    Occurrence(String title, String description, String localization, Date date) {
        setTitle(title);
        setDescription(description);
        setLocalization(localization);
        setDate(date);
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
      
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDescription(String description){
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
    
    // Exemplo para teste
    public void mostrarDados() {
        System.out.println("Título: " + getTitle());
        System.out.println("Descrição: " + getDescription());
        System.out.println("Localização: " + getLocalization());
        System.out.println("Data: "  + getDate());
        System.out.println("Status: " + getStatus());
    }
 }
