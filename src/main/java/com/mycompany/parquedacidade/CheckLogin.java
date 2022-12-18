/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedacidade;

import java.util.regex.Pattern;

/**
 *
 * @author bernardo
 */
public class CheckLogin {
    public void validateData(String email, String password){
        // Email Validation
        if(email.length() < 1) {
            System.out.println("Email field cannot be empty");
        } else {
            if(isValidEmailAdress(email)) {
                System.out.println("Valid email");
            } else {
                System.out.println("Invalid email");
            }
        }
        // Password Validation 
        if(password.length() < 1) {
             System.out.println("Password field cannot be empty");
        } else {
            if(password.length() < 6) {
                System.out.println("Password is too short");
            } else {
                 System.out.println("Your password is valid");
            }
        }
    }
    
    public static boolean isValidEmailAdress(String email) {
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        return Pattern.compile(regexPattern)
            .matcher(email)
            .matches();
    }
}
