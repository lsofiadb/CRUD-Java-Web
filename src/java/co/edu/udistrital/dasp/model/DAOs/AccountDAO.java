/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.AccountDTO;
import co.edu.udistrital.dasp.model.DTOs.BankDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
import co.edu.udistrital.dasp.model.DTOs.PersonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class AccountDAO implements DAO,Iterator {

    
    private Vector data = new Vector();
    private Enumeration ec;
    private AccountDTO nextAccount;
    
    public AccountDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) { //TO-DO according to Iterator implementation 
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Account");
            while (rs.next()) {
                AccountDTO user = new AccountDTO();
                PersonDTO pTemp = new PersonDTO();
                BankDTO bTemp = new BankDTO();
                user.setId(rs.getLong("id"));
                user.setNumber(rs.getLong("accountNumber"));
                user.setPassword(rs.getString("password"));
                pTemp.setId(rs.getLong("owner_id"));
                user.setOwner(pTemp);
                bTemp.setId(rs.getLong("bank_id"));
                user.setBank(bTemp);
                this.data.add(user);
            }
            connecction.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.data;
    }
    
    public Long getAccountNumberByOwner(Connection connecction, Long cc){
        
        try {
            String sql = "select * from Account where owner_id =?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setLong(1, cc);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                return rs.getLong("accountNumber");
            }
            
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        
        return null;
    }
    
    public Long getAccountIdByOwner(Connection connecction, Long cc){
        
        try {
            String sql = "select * from Account where owner_id =?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setLong(1, cc);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                return rs.getLong("id");
            }
            
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        
        return null;
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
        AccountDTO account = new AccountDTO();
        account.setId(1L);
        account.setNumber(456L); //make method to generate random number
        account.setPassword("letmein");
        PersonDTO owner = new PersonDTO(100L, "Laurita", "Dueñas", "calle 40", "laurita@gmail.com", "letmein");
        account.setOwner(owner);
        BankDTO bank = new BankDTO(1L, "ScotiaBank");
        account.setBank(bank);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        AccountDTO account = (AccountDTO) entity;
        
        
        try {

            String sql = "insert into account (id, accountNumber, password, owner_id, bank_id) VALUES (?, ?, ?, ?, ?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, account.getId());
            statement.setLong(2, account.getNumber());
            statement.setString(3, account.getPassword());
            statement.setLong(4, account.getOwner().getId());
            statement.setLong(5, account.getBank().getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return account;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        AccountDTO account = new AccountDTO();
        account.setId(1L);
        account.setNumber(456L); 

        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        AccountDTO account = (AccountDTO) entity;;
        
        try {

            String sql = "update account a "
                    + " set a.password = ?  "
                    + " where  a.id =  ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, account.getPassword());
            statement.setLong(2, account.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
        return account;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
        try {

            String sql = "delete from account a where a.id = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
    }

    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextAccount = null;
        
        while(this.ec.hasMoreElements()){
            AccountDTO temp = (AccountDTO) ec.nextElement();
            nextAccount = temp;
            break;
        }
        return (nextAccount != null);
    }

    @Override
    public Object next() {
        if (nextAccount == null){
            return false;
        }else{
            return this.nextAccount;
        }
    }

}
