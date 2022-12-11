/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.dasp.controllers;

import co.edu.udistrital.dasp.model.DAOs.AccountDAO;
import co.edu.udistrital.dasp.model.DAOs.BankDAO;
import co.edu.udistrital.dasp.model.DAOs.CardDAO;
import co.edu.udistrital.dasp.model.DAOs.CategoryDAO;
import co.edu.udistrital.dasp.model.DAOs.CreditDAO;
import co.edu.udistrital.dasp.model.DAOs.DebitDAO;
import co.edu.udistrital.dasp.utils.ConexionBDs;
import co.edu.udistrital.dasp.model.DAOs.PersonDAO;
import co.edu.udistrital.dasp.model.DAOs.TransactionDAO;
import co.edu.udistrital.dasp.model.DTOs.AccountDTO;
import co.edu.udistrital.dasp.model.DTOs.BankDTO;
import co.edu.udistrital.dasp.model.DTOs.CardDTO;
import co.edu.udistrital.dasp.model.DTOs.CategoryDTO;
import co.edu.udistrital.dasp.model.DTOs.CreditDTO;
import co.edu.udistrital.dasp.model.DTOs.DebitDTO;
import co.edu.udistrital.dasp.model.DTOs.PersonDTO;
import co.edu.udistrital.dasp.model.DTOs.TransactionDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
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
        
            switch (request.getParameter("service")) {
            case "get-persons": {
                System.out.println("LLegamos a la servlet...");
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<PersonDTO> listaPersonas = pDAO.getRecords(conexion.getConnection());

                System.out.println("Lista Personas: " + listaPersonas.size());
                System.out.println("PERSONAAAAAAAAAAAAAAAAAAAAAAAAAS"+listaPersonas);
                while(pDAO.hasNext()){
                   PersonDTO temp = (PersonDTO) pDAO.next();
                   System.out.println(temp.getName());
                   System.out.println(temp.getLastname());
                }

                request.setAttribute("student", "Laura");
                request.setAttribute("listaP", listaPersonas);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "get-personsId": {
                System.out.println("LLegamos a la servlet...");
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Long objId = Long.parseLong(request.getParameter("id"));
                PersonDTO busquedaP = (PersonDTO) pDAO.getPersonByID(conexion.getConnection(),objId);
                System.out.println(busquedaP.getName());

                request.setAttribute("student", "Laura");
                request.setAttribute("persona", busquedaP);
                response.getWriter().write(String.valueOf(busquedaP.getId()) + "\n");
                response.getWriter().write(busquedaP.getName() + "\n");
                response.getWriter().write(busquedaP.getLastname() + "\n");
                response.getWriter().write(busquedaP.getEmail() + "\n");
                response.getWriter().write(busquedaP.getAddress() + "\n");
                response.getWriter().write(busquedaP.getPassword() + "\n");
                
                break;
            }
            case "get-personsNA": {
                System.out.println("LLegamos a la servlet...");
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                String name = request.getParameter("nombre");
                String ape = request.getParameter("apellido");
                PersonDTO busquedaP = (PersonDTO) pDAO.getPersonByName(conexion.getConnection(), name, ape);
                System.out.println(busquedaP.getName());

                request.setAttribute("student", "Laura");
                request.setAttribute("persona", busquedaP);
                response.getWriter().write(String.valueOf(busquedaP.getId()) + "\n");
                response.getWriter().write(busquedaP.getName() + "\n");
                response.getWriter().write(busquedaP.getLastname() + "\n");
                response.getWriter().write(busquedaP.getEmail() + "\n");
                response.getWriter().write(busquedaP.getAddress() + "\n");
                response.getWriter().write(busquedaP.getPassword() + "\n");
                
                break;
            }
            
            case "put-persona": {
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                PersonDTO dummy = new PersonDTO();
                dummy.setId(Long.parseLong(request.getParameter("cedula")));
                dummy.setName(request.getParameter("NombreRegistro"));
                dummy.setEmail(request.getParameter("emailRegistro"));
                dummy.setLastname(request.getParameter("ApellidoRegistro"));
                dummy.setAddress(request.getParameter("DireccionRegistro"));
                dummy.setPassword(request.getParameter("PasswordRegistro"));
                System.out.println(dummy.getId());
                System.out.println(request.getParameter("cedula"));
                pDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                response.getWriter().write("Registro agregado");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }


            case "get-cards": {
                CardDAO cDAO = new CardDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<CardDTO> listaCards = cDAO.getRecords(conexion.getConnection());
                while(cDAO.hasNext()){
                   CardDTO temp = (CardDTO) cDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaC", listaCards);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-cardsId": {
                CardDAO cDAO = new CardDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Long id = Long.parseLong(request.getParameter("id"));
                Vector<CardDTO> listaCards = cDAO.getRecordByOwnerId(conexion.getConnection(),id);
                System.out.println(listaCards);
                request.setAttribute("listaC", listaCards);
                while(cDAO.hasNext()){
                   CardDTO temp = (CardDTO) cDAO.next();
                   response.getWriter().write(String.valueOf(temp.getId()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getNumber()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getExpiration_date()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getAccount()) + "\n");
                   response.getWriter().write("----------------------------------------" + "\n");
                }
                break;
            }
            case "get-cardsNA": {
                CardDAO cDAO = new CardDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                String name = request.getParameter("nombre");
                String ape = request.getParameter("apellido");
                Vector<CardDTO> listaCards = cDAO.getRecordByOwnerName(conexion.getConnection(),name,ape);
                System.out.println(listaCards);
                request.setAttribute("listaC", listaCards);
                while(cDAO.hasNext()){
                   CardDTO temp = (CardDTO) cDAO.next();
                   response.getWriter().write(String.valueOf(temp.getId()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getNumber()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getExpiration_date()) + "\n");
                   response.getWriter().write(String.valueOf(temp.getAccount()) + "\n");
                   response.getWriter().write("----------------------------------------" + "\n");
                }
                break;
            }
            case "get-accounts": {
                AccountDAO aDAO = new AccountDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<AccountDTO> listaAccounts = aDAO.getRecords(conexion.getConnection());
                while(aDAO.hasNext()){
                   AccountDTO temp = (AccountDTO) aDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaA", listaAccounts);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-banks": {
                BankDAO bDAO = new BankDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<BankDTO> listaBancos = bDAO.getRecords(conexion.getConnection());
                while(bDAO.hasNext()){
                   BankDTO temp = (BankDTO) bDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaB", listaBancos);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-credits": {
                CreditDAO cDAO = new CreditDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<CreditDTO> listaCredit = cDAO.getRecords(conexion.getConnection());
                while(cDAO.hasNext()){
                   CreditDTO temp = (CreditDTO) cDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaC", listaCredit);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-categories": {
                CategoryDAO cDAO = new CategoryDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<CategoryDTO> listaCates = cDAO.getRecords(conexion.getConnection());
                while(cDAO.hasNext()){
                   CategoryDTO temp = (CategoryDTO) cDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaC", listaCates);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-debits": {
                DebitDAO dDAO = new DebitDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<DebitDTO> listaDebit = dDAO.getRecords(conexion.getConnection());
                while(dDAO.hasNext()){
                   DebitDTO temp = (DebitDTO) dDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaD", listaDebit);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "get-transactions": {
                TransactionDAO tDAO = new TransactionDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Vector<TransactionDTO> listaTrans = tDAO.getRecords(conexion.getConnection());
                while(tDAO.hasNext()){
                   TransactionDTO temp = (TransactionDTO) tDAO.next();
                }
                
                request.setAttribute("student", "Laura");
                request.setAttribute("listaT", listaTrans);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "go-reg": {
                request.getRequestDispatcher("./JSPs/registrarse.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "go-editarpersona": {
                
                request.setAttribute("nombre", request.getParameter("nombre"));
                request.setAttribute("apellido", request.getParameter("apellido"));
                request.setAttribute("dir", request.getParameter("dir"));
                request.setAttribute("pass", request.getParameter("pass"));
                request.setAttribute("cedula", request.getParameter("cedula"));
                request.setAttribute("email", request.getParameter("email"));
                request.getRequestDispatcher("./JSPs/actualizar_datos.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "go-crearCard": {
                
                request.setAttribute("nombre", request.getParameter("nombre"));
                request.setAttribute("apellido", request.getParameter("apellido"));
                request.setAttribute("dir", request.getParameter("dir"));
                request.setAttribute("pass", request.getParameter("pass"));
                request.setAttribute("cedula", request.getParameter("cedula"));
                request.setAttribute("email", request.getParameter("email"));
                request.getRequestDispatcher("./JSPs/crear_tarjeta.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
            case "go-deleteCard": {
                
                request.setAttribute("nombre", request.getParameter("nombre"));
                request.setAttribute("apellido", request.getParameter("apellido"));
                request.setAttribute("dir", request.getParameter("dir"));
                request.setAttribute("pass", request.getParameter("pass"));
                request.setAttribute("cedula", request.getParameter("cedula"));
                request.setAttribute("email", request.getParameter("email"));
                request.getRequestDispatcher("./JSPs/borrar_tarjeta.jsp").forward(request, response); //Cambiar cuando este el front
                break;
            }
        }
        
        
          

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
