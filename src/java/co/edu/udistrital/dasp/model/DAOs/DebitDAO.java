/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.CardDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
import co.edu.udistrital.dasp.model.DTOs.DebitDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class DebitDAO implements DAO,Iterator{

    private Vector data = new Vector();
    Enumeration ec;
    DebitDTO nextDebit;
    
    
    public DebitDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from debit");
            while (rs.next()) {
                DebitDTO user = new DebitDTO();
                user.setId(rs.getLong("id"));
                user.setBalance(rs.getLong("balance"));
                CardDTO cTemp = new CardDTO();
                cTemp.setId(rs.getLong("card_id"));
                user.setCard(cTemp);
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
//       DebitDTO debit = new DebitDTO();
//       debit.setId(1L);
//       debit.setBalance(150000D);
//       CardDTO cTemp = new CardDTO();
//       cTemp.setId(1L);
//       debit.setCard(cTemp);
       //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
        DebitDTO debit = (DebitDTO) entity;
       try {

            String sql = "insert into debit VALUES (?,?,?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, debit.getId());
            statement.setDouble(2, debit.getBalance());
            statement.setDouble(3, debit.getCard().getId());
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return debit;
       
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        DebitDTO debit = new DebitDTO();
       debit.setId(1L);
       debit.setBalance(150000D);
       CardDTO cTemp = new CardDTO();
       cTemp.setId(1L);
       debit.setCard(cTemp);
       
       //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        DebitDTO debit = (DebitDTO) entity;
       try {

            String sql = "UPDATE debit d SET d.balance = ? WHERE d.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, debit.getBalance());
            statement.setLong(2, debit.getId());
            

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return debit;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
        
        try {

            String sql = "DELETE FROM  debit WHERE card_id = ?;";
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
        this.nextDebit = null;
        
        while(this.ec.hasMoreElements()){
            DebitDTO temp = (DebitDTO) ec.nextElement();
            nextDebit = temp;
            break;
        }
        return (nextDebit != null);
    }

    @Override
    public Object next() {
        if (nextDebit == null){
            return false;
        }else{
            return this.nextDebit;
        }
    }

   

   
}
