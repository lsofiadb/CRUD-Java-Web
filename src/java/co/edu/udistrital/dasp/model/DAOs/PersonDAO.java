/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.DTO;
import co.edu.udistrital.dasp.model.DTOs.PersonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class PersonDAO implements DAO, Iterator {

    public ArrayList<PersonDTO> getPersonsList(Connection connection) {
        ArrayList<PersonDTO> personsList = new ArrayList();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from person");
            while (rs.next()) {
                PersonDTO user = new PersonDTO();
                user.setId(rs.getLong("CC"));
                user.setName(rs.getString("personName"));
                user.setLastname(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                personsList.add(user);
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return personsList;
    }

    @Override
    public Vector getRecords(Connection connecction) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DTO insertRecord(Connection connection, DTO entity) {

        PersonDTO person = new PersonDTO();
        person.setId(20L);
        person.setName("Luna Maria");
        person.setLastname("Jimenez");
        person.setAddress("calle 40");
        person.setEmail("luna@gmail.com");
        person.setPassword("letmein");

        try {

            String sql = "insert into person (CC, personName, lastName, address, email, password) VALUES (?, ?, ?, ?, ?, ?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, person.getId());
            statement.setString(2, person.getName());
            statement.setString(3, person.getLastname());
            statement.setString(4, person.getAddress());
            statement.setString(5, person.getEmail());
            statement.setString(6, person.getPassword());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return person;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {

        PersonDTO person = new PersonDTO();
        person.setId(20L);
        person.setName("Lunita Maria");
        person.setLastname("Jimeneza");
        person.setAddress("calle 40");
        person.setEmail("luna2@gmail.com");
        person.setPassword("letmein2");

        try {

            String sql = "update person p "
                    + " set p.personName = ?, p.lastName = ?, p.address = ?, p.email = ?, p.password = ? "
                    + " where  p.CC =  ?";

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, person.getName());
            statement.setString(2, person.getLastname());
            statement.setString(3, person.getAddress());
            statement.setString(4, person.getEmail());
            statement.setString(5, person.getPassword());
            statement.setLong(6, person.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
        return person;
    }

    @Override
    public void deleteRecord(Connection connection, int id) {

        try {

            String sql = "delete from person p where p.CC = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
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
