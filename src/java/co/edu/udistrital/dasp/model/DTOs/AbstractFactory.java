/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;

import co.edu.udistrital.dasp.controllers.ConcreteFactoryController;

/**
 *
 * @author Laura
 */
public abstract class AbstractFactory <T>{
    public abstract T getObject(String name);
    
    public AbstractFactory getFactory(String name){
        
        AbstractFactory factory = null;
        
        switch(name){
            case "ConcreteFactoryController": {
                factory = new ConcreteFactoryController();
                break;
            }
            
            case "ConcreteFactoryDTO":{
                factory = new ConcreteFactoryDTO();
                break;
            }
            
            default:
                break;
        }
        return factory;
    }
}
