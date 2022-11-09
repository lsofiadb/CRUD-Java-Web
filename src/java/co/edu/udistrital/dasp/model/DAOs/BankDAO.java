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
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class BankDAO implements DAO, Iterator{

    public BankDAO() {
    }

    @Override
    public Vector<DTO> getRecords(Connection connecction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
        BankDTO bank = new BankDTO();
        bank.setId(1L);
        bank.setName("Scotiabank");
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteRecord(Connection connection, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
