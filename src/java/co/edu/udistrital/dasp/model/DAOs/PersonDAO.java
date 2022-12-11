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
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public class PersonDAO implements DAO, Iterator {

    private Vector data = new Vector();
    private Enumeration ec;
    private PersonDTO nextPerson;

    @Override
    public Vector getRecords(Connection connecction) { //TO-DO according to Iterator implementation 
        System.out.println("Entre aqui");
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from person");
            while (rs.next()) {
                PersonDTO user = new PersonDTO();
                user.setId(rs.getLong("CC"));
                user.setName(rs.getString("personName"));
                user.setLastname(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
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

//        PersonDTO person = new PersonDTO();
//        person.setId(20L);
//        person.setName("Luna Maria");
//        person.setLastname("Jimenez");
//        person.setAddress("calle 40");
//        person.setEmail("luna@gmail.com");
//        person.setPassword("letmein");
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
        PersonDTO person = (PersonDTO) entity;
        System.out.println(person.getId());

        try {

            String sql = "insert into person (CC, personName, lastName, address, email, password) VALUES (?, ?, ?, ?, ?, ?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, person.getId());
            statement.setString(2, person.getName());
            statement.setString(3, person.getLastname());
            statement.setString(4, person.getAddress());
            statement.setString(5, person.getEmail());
            statement.setString(6, person.getPassword());
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return person;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {

//        PersonDTO person = new PersonDTO();
//        person.setId(20L);
//        person.setName("Lunita Maria");
//        person.setLastname("Jimeneza");
//        person.setAddress("calle 40");
//        person.setEmail("luna2@gmail.com");
//        person.setPassword("letmein2");

        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
        PersonDTO person = (PersonDTO) entity;
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
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
        return person;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {

        try {

            String sql = "delete from person p where p.CC = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("ERROR " + ex);
        }
    }
    
    public Object login(Connection connection, DTO entity){
        PersonDTO person = (PersonDTO) entity;
        
        try {
            String sql = "select * from person where email=? and password = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, person.getEmail());
            statement.setString(2, person.getPassword());
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                PersonDTO user = new PersonDTO();
                user.setId(rs.getLong("CC"));
                user.setName(rs.getString("personName"));
                user.setLastname(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setEmail(person.getEmail());
                user.setPassword(rs.getString("password"));
                return user;
            }
            
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return null;
    }
    
    public DTO getPersonByID(Connection connection, long id){
        try {
            String sql = "select * from person where CC = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PersonDTO user = new PersonDTO();
                user.setId(rs.getLong("CC"));
                user.setName(rs.getString("personName"));
                user.setLastname(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                return user;
            }
            connection.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    
        public DTO getPersonByName(Connection connection, String FirstName, String LastName){
        try {
            String sql = "select * from person where personName = ? and lastName = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, FirstName);
            statement.setString(2, LastName);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                PersonDTO user = new PersonDTO();
                user.setId(rs.getLong("CC"));
                user.setName(rs.getString("personName"));
                user.setLastname(rs.getString("lastName"));
                user.setAddress(rs.getString("address"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                return user;
            }
            connection.close();
            this.ec = this.data.elements();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextPerson = null;
        
        while(this.ec.hasMoreElements()){
            PersonDTO temp = (PersonDTO) ec.nextElement();
            nextPerson = temp;
            break;
        }
        return (nextPerson != null);
    }

    @Override
    public Object next() {
        if (nextPerson == null){
            return false;
        }else{
            return this.nextPerson;
        }
    }


}
