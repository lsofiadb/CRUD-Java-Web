/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udistrital.dasp.model.DAOs;

import co.edu.udistrital.dasp.model.DTOs.DTO;
import java.sql.Connection;
import java.util.Vector;

/**
 *
 * @author Laura
 */
public interface DAO {
    public Vector<DTO> getRecords(Connection connecction);
    public DTO insertRecord(Connection connection, DTO entity);
    public DTO updateRecord(Connection connection, DTO entity);
    public void deleteRecord(Connection connection, int id);
}
