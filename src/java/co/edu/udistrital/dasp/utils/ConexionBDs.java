/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.utils;

import java.sql.Connection;

/**
 *
 * @author nixod
 */
public class ConexionBDs {
    private static ConexionBDs conexion;
    private ConexionBDs(){
        
    }
    
    public static ConexionBDs getInstanceConexion(){
        if(conexion == null){
            conexion = new ConexionBDs();
        }
        return conexion;
    }
    
    public Connection getConnection(){
        Connection connection = null;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");   
            //connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/user","root","root");
            // Setting up the DataSource object
            com.mysql.cj.jdbc.MysqlDataSource ds 
              = new com.mysql.cj.jdbc.MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPortNumber(3306);
            ds.setDatabaseName("financialproducts");
            ds.setUser("root");
            ds.setPassword("0000");
            ds.setUseSSL(false);
            ds.setAllowPublicKeyRetrieval(true);

      // Getting a connection object
            connection = ds.getConnection();
        }catch(Exception e){
            System.out.println(e);
        }
        return connection;
    }
}
