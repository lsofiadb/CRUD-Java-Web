/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.controllers;

import co.edu.udistrital.dasp.model.DTOs.AbstractFactory;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Laura
 */
public class ConcreteFactoryController extends AbstractFactory{

    @Override
    public HttpServlet getObject(String name) {
        HttpServlet servlet = null;
        
        switch (name) {
            case "PersonController": {
                servlet = new PersonController();
                break;
            }

            case "CardController": {
                servlet = new CardController();
                break;
            }
        }
        return servlet;
    }
    
}
