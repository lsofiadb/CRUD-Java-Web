/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.DTOs;

/**
 *
 * @author Laura
 */
public class DebitDTO {
    private Long id;
    private double balance;
    private CardDTO card;

    public DebitDTO() {
    }

    public DebitDTO(Long id, double balance, CardDTO card) {
        this.id = id;
        this.balance = balance;
        this.card = card;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CardDTO getCard() {
        return card;
    }

    public void setCard(CardDTO card) {
        this.card = card;
    }
    
    
    
}
