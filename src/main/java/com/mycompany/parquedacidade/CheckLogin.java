/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedacidade;

/**
 *
 * @author bernardo
 */
public class CheckLogin {
    public void validateDataLogin(String email, String password){
        // Email Validation
        if(email.length() < 1) {
            System.out.println("Email field cannot be empty");
        }
        
        // Password Validation 
        if(password.length() < 1) {
             System.out.println("Password field cannot be empty");
        }
    }
}
