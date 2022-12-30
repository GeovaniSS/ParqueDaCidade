/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gel
 */
public class VisitorDTO extends UserDTO {
    VisitorDTO(String name, String email, String password) {
        super.setName(name);
        super.setEmail(email);
        super.setPassword(password);
    }
}
