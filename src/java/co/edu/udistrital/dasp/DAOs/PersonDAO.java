/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.DAOs;

import co.edu.udistrital.dasp.DTOs.PersonDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Laura 
 */
public class PersonDAO {
    public ArrayList<PersonDTO> getPersonsList(Connection connection){
        ArrayList<PersonDTO> personsList = new ArrayList();
        try{
            Statement stmt=connection.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from person");  
            while(rs.next()){
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
        }catch(Exception e){
            System.out.println(e);
        }
        return personsList;
    }
}
