/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.AccountDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
import co.edu.udistrital.dasp.model.DTOs.TransactionDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class TransactionDAO implements DAO,Iterator{

    private Vector data = new Vector();
    private Enumeration ec;
    private TransactionDTO nextTransaction;
    
    
    public TransactionDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Transaction");
            while (rs.next()) {
                TransactionDTO user = new TransactionDTO();
                user.setId(rs.getLong("id"));
                user.setDate(rs.getDate("transactionDate"));
                user.setAmount(rs.getDouble("amount"));
                AccountDTO rcTemp = new AccountDTO();
                rcTemp.setId(1L);
                AccountDTO dcTemp = new AccountDTO();
                dcTemp.setId(1L);
                user.setRoot_account(rcTemp);
                user.setDestination_account(dcTemp);
                this.data.add(user);
            }
            connecction.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.data;
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
        TransactionDTO trans = new TransactionDTO();
        trans.setId(1L);
        String fecha = "25/09/2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate date = LocalDate.of(25, Month.SEPTEMBER, 2020);
        trans.setDate(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        trans.setAmount(2500D);
        AccountDTO rcTemp = new AccountDTO();
        rcTemp.setId(1L);
        AccountDTO dcTemp = new AccountDTO();
        dcTemp.setId(1L);
        trans.setRoot_account(rcTemp);
        trans.setDestination_account(dcTemp);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        TransactionDTO trans = (TransactionDTO) entity;
        try {

            String sql = "insert into Transaction VALUES (?,?,?,?,?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, trans.getId());
            statement.setDate(2, new java.sql.Date(trans.getDate().getTime()));
            statement.setDouble(3, trans.getAmount());
            statement.setLong(4, trans.getRoot_account().getId());
            statement.setLong(5, trans.getDestination_account().getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return trans;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        TransactionDTO trans = new TransactionDTO();
        trans.setId(1L);
        String fecha = "25/09/2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate date = LocalDate.of(25, Month.SEPTEMBER, 2020);
        trans.setDate(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        trans.setAmount(2500D);
        AccountDTO rcTemp = new AccountDTO();
        rcTemp.setId(1L);
        AccountDTO dcTemp = new AccountDTO();
        dcTemp.setId(1L);
        trans.setRoot_account(rcTemp);
        trans.setDestination_account(dcTemp);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        TransactionDTO trans = (TransactionDTO) entity;
        try {

            String sql = "UPDATE Transaction t SET t.amount = ? WHERE t.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, trans.getAmount());
            statement.setLong(2, trans.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return trans;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
        try {

            String sql = "DELETE FROM Transaction WHERE t.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1,id);

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
    }

    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextTransaction = null;
        
        while(this.ec.hasMoreElements()){
            TransactionDTO temp = (TransactionDTO) ec.nextElement();
            nextTransaction = temp;
            break;
        }
        return (nextTransaction != null);
    }

    @Override
    public Object next() {
        if (nextTransaction == null){
            return false;
        }else{
            return this.nextTransaction;
        }
    }

   

}
