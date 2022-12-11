/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.CategoryDTO;
import co.edu.udistrital.dasp.model.DTOs.DTO;
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
public class CategoryDAO implements DAO, Iterator{

    private Vector data = new Vector();
    private Enumeration ec;
    private CategoryDTO nextCategory;
    
    public CategoryDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from category");
            while (rs.next()) {
                CategoryDTO user = new CategoryDTO();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("categoryName"));
                user.setDescription(rs.getString("description"));
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
        CategoryDTO cate = new CategoryDTO();
        cate.setId(1L);
        cate.setName("Default");
        cate.setDescription("Soy una prueba :c");
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        CategoryDTO cate = (CategoryDTO) entity;
         try {

            String sql = "insert into category VALUES (?,?,?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, cate.getId());
            statement.setString(2, cate.getName());
            statement.setString(3, cate.getDescription());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return cate;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        CategoryDTO cate = new CategoryDTO();
        cate.setId(1L);
        cate.setName("Default");
        cate.setDescription("Soy una prueba :c");
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        CategoryDTO cate = (CategoryDTO) entity;
         try {

            String sql = "UPDATE category c SET c.categoryName = ? WHERE c.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cate.getName());
            statement.setLong(2, cate.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return cate;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
       try {

            String sql = "DELETE FROM category WHERE c.id = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1,id);
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
    }

    @Override
    public boolean hasNext() {
        boolean matchFound = false;
        this.nextCategory = null;
        
        while(this.ec.hasMoreElements()){
            CategoryDTO temp = (CategoryDTO) ec.nextElement();
            nextCategory = temp;
            break;
        }
        return (nextCategory != null);
    }

    @Override
    public Object next() {
        if (nextCategory == null){
            return false;
        }else{
            return this.nextCategory;
        }
    }
  
}
