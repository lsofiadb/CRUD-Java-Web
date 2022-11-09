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
            case "AccountDAO": {
                dto = new AccountDTO();
                break;
            }

            case "BankDAO": {
                dto = new BankDTO();
                break;
            }

            case "CardDAO": {
                dto = new CardDTO();
                break;
            }
            
            case "CategoryDAO":{
                dto = new CategoryDTO();
                break;
            }
            
            case "CreditDAO":{
                dto = new CreditDTO();
                break;
            }
            
            case "DebitDAO":{
                dto = new DebitDTO();
                break;
            }
            
            case "PersonDAO":{
                dto = new PersonDTO();
                break;
            }
            
            case "TransactionDAO": {
                dto = new TransactionDTO();
                break;
            }
            
            default:
                break;
        }
        return dto;
    }
    
}
