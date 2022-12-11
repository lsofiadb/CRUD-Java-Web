/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.AccountDTO;
import co.edu.udistrital.dasp.model.DTOs.CardDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
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
public class CardDAO implements DAO,Iterator{

    private Vector data = new Vector();
    private Enumeration ec;
    private CardDTO nextCard;
    
    
    public CardDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from card");
            while (rs.next()) {
                CardDTO user = new CardDTO();
                AccountDTO aTemp = new AccountDTO();
                user.setId(rs.getLong("id"));
                user.setCvc(rs.getLong("cvc"));
                user.setNumber(rs.getLong("cardNumber"));
                user.setExpiration_date(rs.getDate("expiration_date"));
                aTemp.setId(rs.getLong("account_id"));
                user.setAccount(aTemp);
                this.data.add(user);
            }
            connecction.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.data;
    }
    
    public Vector getRecordByAcoount(Connection connecction, long id){
        Vector res = new Vector();
        
        try {

            String sql = "select * from card where account_id = ?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setLong(1, id);                  
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                CardDTO user = new CardDTO();
                AccountDTO aTemp = new AccountDTO();
                user.setId(rs.getLong("id"));
                user.setCvc(rs.getLong("cvc"));
                user.setNumber(rs.getLong("cardNumber"));
                user.setExpiration_date(rs.getDate("expiration_date"));
                aTemp.setId(rs.getLong("account_id"));
                user.setAccount(aTemp);
                res.add(user);
            }
            connecction.close();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return res;
    }
    
        public Vector getRecordByOwnerId(Connection connecction, long id){
        Vector res = new Vector();
        
        try {

            String sql = "select c.id, c.cvc,c.cardNumber,c.expiration_date,c.account_id from card c, account ac, person p where c.account_id=ac.id and ac.owner_id=p.CC and p.CC=?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setLong(1, id);                  
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                CardDTO user = new CardDTO();
                AccountDTO aTemp = new AccountDTO();
                user.setId(rs.getLong("id"));
                user.setCvc(rs.getLong("cvc"));
                user.setNumber(rs.getLong("cardNumber"));
                user.setExpiration_date(rs.getDate("expiration_date"));
                aTemp.setId(rs.getLong("account_id"));
                user.setAccount(aTemp);
                res.add(user);
            }
            this.ec = res.elements();
            connecction.close();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return res;
    }
        
    public Vector getRecordByOwnerName(Connection connecction, String FirstName, String LastName){
        Vector res = new Vector();
        
        try {

            String sql = "select c.id, c.cvc,c.cardNumber,c.expiration_date,c.account_id from card c, account ac, person p where c.account_id=ac.id and ac.owner_id=p.CC and p.personName=? and p.lastName=?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setString(1, FirstName);
            statement.setString(2, LastName);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                CardDTO user = new CardDTO();
                AccountDTO aTemp = new AccountDTO();
                user.setId(rs.getLong("id"));
                user.setCvc(rs.getLong("cvc"));
                user.setNumber(rs.getLong("cardNumber"));
                user.setExpiration_date(rs.getDate("expiration_date"));
                aTemp.setId(rs.getLong("account_id"));
                user.setAccount(aTemp);
                res.add(user);
            }
            this.ec = res.elements();
            connecction.close();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return res;
    }
    
    public Object getCardIdbyNumber(Connection connecction, long number){
  
        try {

            String sql = "select * from card where cardNumber = ?;";
            PreparedStatement statement = connecction.prepareStatement(sql);
            statement.setLong(1, number);                  
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               return rs.getLong("id");
            }
            connecction.close();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return null;
    }


    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
//        CardDTO card = new CardDTO();
//        card.setId(1L);
//        card.setCvc(30L);
//        card.setNumber(123124L);
//        String fecha = "25/09/2025";
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD/MM/YYYY");
//        LocalDate date = LocalDate.of(25, Month.SEPTEMBER, 2025);
//        card.setExpiration_date(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
//        AccountDTO aTemp = new AccountDTO();
//        aTemp.setId(20L);
//        card.setAccount(aTemp);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
        CardDTO card = (CardDTO) entity;
        try {

            String sql = "INSERT INTO Card VALUES (?,?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, card.getId());
            statement.setLong(2, card.getCvc());
            statement.setLong(3, card.getNumber());
            statement.setDate(4, new java.sql.Date(card.getExpiration_date().getTime()));
            statement.setLong(5, card.getAccount().getId());  
            statement.execute();

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return card;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        
        CardDTO card = new CardDTO();
        card.setId(1L);
        card.setCvc(30L);
        card.setNumber(123124L);
        String fecha = "25/09/2025";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate date = LocalDate.of(25, Month.SEPTEMBER, 2025);
        card.setExpiration_date(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        AccountDTO aTemp = new AccountDTO();
        aTemp.setId(20L);
        card.setAccount(aTemp);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        CardDTO card = (CardDTO) entity;
        try {

            String sql = "UPDATE card c SET c.cvc = ? WHERE c.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, card.getCvc());  
            statement.setLong(2, card.getId());                  

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return card;

    }
    
    

    @Override
    public void deleteRecord(Connection connection, long id) {
        try {
            String sql = "DELETE FROM card WHERE id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1,id);
            statement.execute();

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
    }

    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextCard = null;
        
        while(this.ec.hasMoreElements()){
            CardDTO temp = (CardDTO) ec.nextElement();
            nextCard = temp;
            break;
        }
        return (nextCard != null);
    }

    @Override
    public Object next() {
        if (nextCard == null){
            return false;
        }else{
            return this.nextCard;
        }
    }

   
    
    

    
    
}
