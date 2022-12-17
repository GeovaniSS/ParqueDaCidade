/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parquedacidade;

/**
 *
 * @author gel
 */
public class ParqueDaCidade {

    public static void main(String[] args) {
        Visitor geovani = new Visitor("Geovani", "geosilvasousa@gmail.com", "123456"); 
        Admin admin = new Admin("Admin", "parquedacidade@admin.com", "parquedacidade");
        
        
        geovani.mostrarDados();
        admin.mostrarDados();
    }
}
