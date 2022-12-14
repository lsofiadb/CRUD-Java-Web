/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DTOs;

/**
 *
 * @author Laura
 */
public class AccountDTO implements DTO{
    
    private Long id;
    private Long number;
    private String password;
    private PersonDTO owner;
    private BankDTO bank;

    public AccountDTO() {
    }

    public AccountDTO(Long id, Long number, String password, PersonDTO owner, BankDTO bank) {
        this.id = id;
        this.number = number;
        this.password = password;
        this.owner = owner;
        this.bank = bank;
    }
    
    /* GETTERS AND SETTERS*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PersonDTO getOwner() {
        return owner;
    }

    public void setOwner(PersonDTO owner) {
        this.owner = owner;
    }

    public BankDTO getBank() {
        return bank;
    }

    public void setBank(BankDTO bank) {
        this.bank = bank;
    }
    
    @Override
    public String getData() {
        return "AccountDTO{" + "id=" + id + ", number=" + number + ", password=" + password + ", owner=" + owner + ", bank=" + bank + '}';
    }
  
}
