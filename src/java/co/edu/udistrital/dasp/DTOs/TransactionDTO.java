/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.DTOs;

import java.util.Date;



/**
 *
 * @author Laura
 */
public class TransactionDTO {
    private Long id;
    private Date date;
    private double amount;
    private AccountDTO root_account;
    private AccountDTO destination_account;
    private CategoryDTO category;

    public TransactionDTO() {
    }

    public TransactionDTO(Long id, Date date, double amount, AccountDTO root_account, AccountDTO destination_account, CategoryDTO category) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.root_account = root_account;
        this.destination_account = destination_account;
        this.category = category;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AccountDTO getRoot_account() {
        return root_account;
    }

    public void setRoot_account(AccountDTO root_account) {
        this.root_account = root_account;
    }

    public AccountDTO getDestination_account() {
        return destination_account;
    }

    public void setDestination_account(AccountDTO destination_account) {
        this.destination_account = destination_account;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }
    
}
