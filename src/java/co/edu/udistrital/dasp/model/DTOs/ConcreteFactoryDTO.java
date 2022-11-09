/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;


/**
 *
 * @author Laura
 */
public class ConcreteFactoryDTO extends AbstractFactory{

    @Override
    public DTO getObject(String name) {
        DTO dto = null;
        switch (name) {
            case "AccountDTO": {
                dto = new AccountDTO();
                break;
            }

            case "BankDTO": {
                dto = new BankDTO();
                break;
            }

            case "CardDTO": {
                dto = new CardDTO();
                break;
            }
            
            case "CategoryDTO":{
                dto = new CategoryDTO();
                break;
            }
            
            case "CreditDTO":{
                dto = new CreditDTO();
                break;
            }
            
            case "DebitDTO":{
                dto = new DebitDTO();
                break;
            }
            
            case "PersonDTO":{
                dto = new PersonDTO();
                break;
            }
            
            case "TransactionDTO": {
                dto = new TransactionDTO();
                break;
            }
            
            default:
                break;
        }
        return dto;
    }
    
}
