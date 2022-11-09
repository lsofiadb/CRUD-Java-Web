/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

/**
 *
 * @author Laura
 */
public interface Iterator <E>{
    
    public boolean hasNext();
    public E next();
    public void remove();
    
}
