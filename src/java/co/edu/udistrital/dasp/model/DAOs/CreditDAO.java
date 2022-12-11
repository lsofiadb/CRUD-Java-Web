/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.CardDTO;
import co.edu.udistrital.dasp.model.DTOs.CreditDTO;
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
public class CreditDAO implements DAO,Iterator{

    private Vector data = new Vector();
    private Enumeration ec;
    private CreditDTO nextCredit;
    
    
    public CreditDAO() {
    }

    @Override
    public Vector getRecords(Connection connecction) {
        try {
            Statement stmt = connecction.createStatement();
            ResultSet rs = stmt.executeQuery("select * from credit");
            while (rs.next()) {
                CreditDTO user = new CreditDTO();
                user.setId(rs.getLong("uniqueID"));
                user.setQuota(rs.getDouble("quota"));
                user.setDebt(rs.getDouble("debt"));
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
//        CreditDTO credit = new CreditDTO();
//        credit.setId(1L);
//        credit.setQuota(25555D);
//        credit.setDebt(400000D);
//        CardDTO cTemp = new CardDTO();
//        cTemp.setId(1L);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
        CreditDTO credit = (CreditDTO) entity;
        try {

            String sql = "insert into credit VALUES (?,?,?,?) ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, credit.getId());
            statement.setDouble(2, credit.getQuota());
            statement.setDouble(3, credit.getDebt());
            statement.setLong(4, credit.getCard().getId());
            statement.execute();
        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return credit;
    }

    @Override
    public DTO updateRecord(Connection connection, DTO entity) {
        CreditDTO credit = new CreditDTO();
        credit.setId(1L);
        credit.setQuota(25555D);
        credit.setDebt(400000D);
        CardDTO cTemp = new CardDTO();
        cTemp.setId(1L);
        
        //Para quitar la plantilla comentar el codigo de arriba y desconmentar este
        
//        CreditDTO credit = (CreditDTO) entity;
        try {

            String sql = "UPDATE credit c set c.quota = ? WHERE c.uniqueID = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, credit.getQuota());
            statement.setLong(2, credit.getId());

        } catch (SQLException ex) {
            System.out.println("ERROR" + ex);
        }
        return credit;
    }

    @Override
    public void deleteRecord(Connection connection, long id) {
        try {

            String sql = "DELETE FROM credit WHERE card_id = ? ;";
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
        this.nextCredit = null;
        
        while(this.ec.hasMoreElements()){
            CreditDTO temp = (CreditDTO) ec.nextElement();
            nextCredit = temp;
            break;
        }
        return (nextCredit != null);
    }

    @Override
    public Object next() {
        if (nextCredit == null){
            return false;
        }else{
            return this.nextCredit;
        }
    }

    

    
    
}
