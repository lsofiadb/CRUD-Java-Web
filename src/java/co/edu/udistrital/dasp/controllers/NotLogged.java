/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.controllers;

import co.edu.udistrital.dasp.model.DTOs.PersonDTO;

/**
 *
 * @author Laura
 */
public class NotLogged implements State{

    @Override
    public void showData(PersonDTO personDTO) {
        System.out.println("Username or password invalid...");
    }
    
}
