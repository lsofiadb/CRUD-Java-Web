/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.DTOs;

/**
 *
 * @author Laura
 */
public class CreditDTO {
    private Long id;
    private double quota;
    private double debt;
    private CardDTO card;

    public CreditDTO() {
    }

    public CreditDTO(Long id, double quota, double debt, CardDTO card) {
        this.id = id;
        this.quota = quota;
        this.debt = debt;
        this.card = card;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuota() {
        return quota;
    }

    public void setQuota(double quota) {
        this.quota = quota;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public CardDTO getCard() {
        return card;
    }

    public void setCard(CardDTO card) {
        this.card = card;
    }
    
}
