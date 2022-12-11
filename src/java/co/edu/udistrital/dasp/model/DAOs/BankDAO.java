/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.BankDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
import co.edu.udistrital.dasp.model.DTOs.PersonDTO;
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
public class BankDAO implements DAO,Iterator{

    
    private Vector data = new Vector();
    private Enumeration ec;
    private BankDTO nextBank;
    
    
    public BankDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bank");
            while (rs.next()) {
                BankDTO user = new BankDTO();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("bankName"));
                this.data.add(user);
            }
            connecction.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        return this.data;
    }
    
    public String getAccountBank(Connection connection, Long id){
        try {
            String sql = "select bankName from Bank b,Account a WHERE a.bank_id = b.id and a.accountNumber = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                return rs.getString("bankName");
            }
            
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        
        return null;
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
        BankDTO bank = new BankDTO();
        bank.setId(1L);
        bank.setName("Scotiabank");
        
                //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        BankDTO bank = (BankDTO) entity;
        try {

            String sql = "insert into bank (id, bankName) VALUES (?, ?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, bank.getId());
            statement.setString(2, bank.getName());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return bank;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        BankDTO bank = new BankDTO();
        bank.setId(1L);
        bank.setName("Scotiabank");
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        BankDTO bank = (BankDTO) entity;
        
        try {

             String sql = "update bank b "
                    + " set b.bankName = ? "
                    + " where  b.id =  ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, bank.getName());
            statement.setLong(2, bank.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return bank;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
        try {

            String sql = "delete from bank b where b.id = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
    }

    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextBank = null;
        
        while(this.ec.hasMoreElements()){
            BankDTO temp = (BankDTO) ec.nextElement();
            nextBank = temp;
            break;
        }
        return (nextBank != null);
    }

    @Override
    public Object next() {
         if (nextBank == null){
            return false;
        }else{
            return this.nextBank;
        }
    }

   
    
}
