/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parquedacidade;

/**
 *
 * @author bernardo
 */
public class Employee extends User{
    private String codigo;

    Employee(String name, String email, String password){
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    private void manageRequests() {
        aceptRequest();
        declineRequest();
    }
    
    private void aceptRequest() {}
    private void declineRequest() {}

}
