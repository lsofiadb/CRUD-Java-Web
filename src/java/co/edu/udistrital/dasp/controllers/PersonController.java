/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.controllers;

import co.edu.udistrital.dasp.utils.ConexionBDs;
import co.edu.udistrital.dasp.model.DAOs.PersonDAO;
import co.edu.udistrital.dasp.model.DTOs.PersonDTO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nixod
 */
public class PersonController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public State state;
    
    protected  void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
            System.out.println("LLegamos a la servlet...");
            PersonDAO pDAO = new PersonDAO();
            ConexionBDs conexion = ConexionBDs.getInstanceConexion();
            ArrayList<PersonDTO> listaPersonas = pDAO.getPersonsList(conexion.getConnection());
            
            System.out.println("Lista Personas: " + listaPersonas.size());
            System.out.println("PERSONAAAAAAAAAAAAAAAAAAAAAAAAAS"+listaPersonas);
            for(int i=0; i<listaPersonas.size(); i++){
                System.out.println(listaPersonas.get(i).getName());
                System.out.println(listaPersonas.get(i).getLastname());
            }
            
            request.setAttribute("student", "Laura");
            request.setAttribute("listaP", listaPersonas);
            request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);

            //response.sendRedirect("./JSPs/producto_crear.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    public void changeState(){
        //query to database... TO-DO
        //verify username and password TO-DO
        //if it's ok then Logged
        boolean decision = false; //change this according to query result status
        
        PersonDTO personDTO = new PersonDTO();
        if(decision){
            state = new Logged();
            state.showData(personDTO);
        }else{ // if it's not then notlogged
            state = new NotLogged();
            state.showData(null);
        }
    }
}
