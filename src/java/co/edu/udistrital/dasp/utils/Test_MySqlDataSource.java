package co.edu.udistrital.dasp.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import javax.sql.*;
public class Test_MySqlDataSource {
    
  public static void main(String [] args) {
    Connection con = null;
    try {

// Setting up the DataSource object
      com.mysql.cj.jdbc.MysqlDataSource ds 
        = new com.mysql.cj.jdbc.MysqlDataSource();
      ds.setServerName("localhost");
      ds.setPortNumber(3306);
      ds.setDatabaseName("user");
      ds.setUser("root");
      ds.setPassword("root");

// Getting a connection object
      con = ds.getConnection();
      
// Getting database info
      DatabaseMetaData meta = con.getMetaData();
      System.out.println("Server name: " 
        + meta.getDatabaseProductName());
      System.out.println("Server version: "
        + meta.getDatabaseProductVersion());

// Closing the connection
      con.close();
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
  }
}

