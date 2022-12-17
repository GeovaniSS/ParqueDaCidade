/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedacidade;

/**
 *
 * @author gel
 */
public abstract class User {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
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
    
    public void mostrarDados() {
        System.out.println("Nome: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.password);
        System.out.println("");
    }
    
    public void register() {}
    public void login() {}
    public void logout() {}
}
