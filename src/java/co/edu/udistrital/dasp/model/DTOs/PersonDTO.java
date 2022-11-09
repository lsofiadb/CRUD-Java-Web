/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.model.DTOs;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Laura
 */
public class PersonDTO implements DTO{
    private Long id;
    private String name;
    private String lastname;
    private String address;
    private String email;
    private String password;

    public PersonDTO(Long id, String name, String lastname, String address, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public PersonDTO() {
    }
    
    
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    } 

    @Override
    public String getData() {
           return "PersonDTO{" + "id=" + id + ", name=" + name + ", lastname=" + lastname + ", address=" + address + ", email=" + email + ", password=" + password + '}';
    }    
}
