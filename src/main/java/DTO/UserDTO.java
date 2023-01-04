/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gel
 */
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String password;
    private boolean isLogged;
    
    public UserDTO(String name, String email, String password) {
        this.setName(name);
        this.setEmail(email);
        this.setPassword(password);
    }

    public int getId(){
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
    
    public boolean getLoginStatus() {
        return this.isLogged;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setLoginStatus(boolean isLogged) {
        this.isLogged = isLogged;
    }
    
    public void logout() {
        this.isLogged = false;
    }
}
