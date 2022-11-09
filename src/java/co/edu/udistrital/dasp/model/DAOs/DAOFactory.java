/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

/**
 *
 * @author Laura
 */
public class DAOFactory {

    DAO dao = null;

    public DAO getDAO(String name) {
        switch (name) {
            case "AccountDAO": {
                dao = new AccountDAO();
                break;
            }

            case "BankDAO": {
                dao = new BankDAO();
                break;
            }

            case "CardDAO": {
                dao = new CardDAO();
                break;
            }
            
            case "CategoryDAO":{
                dao = new CategoryDAO();
                break;
            }
            
            case "CreditDAO":{
                dao = new CreditDAO();
                break;
            }
            
            case "DebitDAO":{
                dao = new DebitDAO();
                break;
            }
            
            case "PersonDAO":{
                dao = new PersonDAO();
                break;
            }
            
            case "TransactionDAO": {
                dao = new TransactionDAO();
                break;
            }
            
            default:
                break;
        }
        return dao;
    }
}
