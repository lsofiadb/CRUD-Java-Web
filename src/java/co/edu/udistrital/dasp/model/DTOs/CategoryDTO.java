/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;

/**
 *
 * @author Laura
 */
public class CategoryDTO implements DTO{
    private Long id;
    private String name;
    private String description;

    public CategoryDTO() {
    }
    
    public CategoryDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getData() {
        return "CategoryDTO{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
    
}
