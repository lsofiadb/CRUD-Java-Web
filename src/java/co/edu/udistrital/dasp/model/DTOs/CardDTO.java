/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;

import java.util.Date;

/**
 *
 * @author Laura
 */
public class CardDTO implements DTO{
    private Long id;
    private Long cvc;
    private Long number;
    private Date expiration_date;
    private AccountDTO account;

    public CardDTO() {
    }

    public CardDTO(Long id, Long cvc, Long number, Date expiration_date, AccountDTO account) {
        this.id = id;
        this.cvc = cvc;
        this.number = number;
        this.expiration_date = expiration_date;
        this.account = account;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCvc() {
        return cvc;
    }

    public void setCvc(Long cvc) {
        this.cvc = cvc;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
