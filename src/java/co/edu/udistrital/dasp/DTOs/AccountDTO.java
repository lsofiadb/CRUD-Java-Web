/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.DTOs;

/**
 *
 * @author Laura
 */
public class AccountDTO {
    
    private Long id;
    private Long number;
    private String password;
    private PersonDTO owner;

    public AccountDTO() {
    }

    public AccountDTO(Long id, Long number, String password, PersonDTO owner) {
        this.id = id;
        this.number = number;
        this.password = password;
        this.owner = owner;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonDTO getOwner() {
        return owner;
    }

    public void setOwner(PersonDTO owner) {
        this.owner = owner;
    }
    
}
