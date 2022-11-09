/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;

/**
 *
 * @author Laura
 */
public class BankDTO implements DTO {
    private Long id;
    private String name;

    public BankDTO() {
    }

    public BankDTO(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getData() {
        return "BankDTO{" + "id=" + id + ", name=" + name + '}';
    }
    
}
