/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.AccountDTO;
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
public class AccountDAO implements DAO {

    public AccountDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) { //TO-DO according to Iterator implementation 
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {
        AccountDTO account = new AccountDTO();
        account.setId(1L);
        account.setNumber(456L); //make method to generate random number
        account.setPassword("letmein");
        PersonDTO owner = new PersonDTO(100L, "Laurita", "Dueñas", "calle 40", "laurita@gmail.com", "letmein");
        account.setOwner(owner);

        try {

            String sql = "insert into account (id, accountNumber, password, owner_id) VALUES (?, ?, ?, ?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, account.getId());
            statement.setLong(2, account.getNumber());
            statement.setString(3, account.getPassword());
            statement.setLong(4, account.getOwner().getId());

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
    public void deleteRecord(Connection connection, int id) {
        try {

            String sql = "delete from account a where a.id = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
    }

}
