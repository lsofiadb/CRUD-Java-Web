/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.udistrital.dasp.controllers;

import co.edu.udistrital.dasp.model.DAOs.AccountDAO;
import co.edu.udistrital.dasp.model.DAOs.BankDAO;
import co.edu.udistrital.dasp.model.DAOs.CardDAO;
import co.edu.udistrital.dasp.model.DAOs.CategoryDAO;
import co.edu.udistrital.dasp.model.DAOs.CreditDAO;
import co.edu.udistrital.dasp.model.DAOs.DebitDAO;
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
import co.edu.udistrital.dasp.utils.ConexionBDs;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Laura
 */
@WebServlet(name = "CardController", urlPatterns = {"/CardController"})
public class CardController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected  void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
            System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            switch (request.getParameter("service")) {
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
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
            }
            case "login": {
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                PersonDTO dummy = new PersonDTO();
                dummy.setEmail(request.getParameter("UsuarioLogin"));
                dummy.setPassword(request.getParameter("PasswordLogin"));
                System.out.println(dummy.getEmail());
                request.setAttribute("student", "Laura");
                PersonDTO usu = (PersonDTO)  pDAO.login(conexion.getConnection(), dummy);
                AccountDAO aDAO = new AccountDAO();
                BankDAO bDAO = new BankDAO();
                Long cuenta = aDAO.getAccountNumberByOwner(conexion.getConnection(), usu.getId());
                String banco = bDAO.getAccountBank(conexion.getConnection(), cuenta);
                
                
                
                if(!usu.getId().equals(null)){
                    CardDAO cDAO = new CardDAO();
                    Vector<CardDTO> listaTarjetas = cDAO.getRecordByAcoount(conexion.getConnection(), aDAO.getAccountIdByOwner(conexion.getConnection(), usu.getId()));
                
                     request.setAttribute("listaTarjetas", listaTarjetas);
                    request.setAttribute("res", true);
                    request.setAttribute("idSession",usu.getId());
                    request.setAttribute("nombre",usu.getName());
                    request.setAttribute("apellido",usu.getLastname());
                    request.setAttribute("dir",usu.getAddress());
                    request.setAttribute("email",dummy.getEmail());
                    request.setAttribute("cuenta", cuenta);
                    request.setAttribute("banco", banco);
                    request.setAttribute("pass", usu.getPassword());
                    request.getRequestDispatcher("./JSPs/usuario_logueado.jsp").forward(request, response);
                }else{
                    request.setAttribute("res", false);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                
                break;
            }
            case "edit-person": {
                PersonDAO pDAO = new PersonDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                PersonDTO dummy = new PersonDTO();
                dummy.setId(Long.parseLong(request.getParameter("cedula")));
                dummy.setName(request.getParameter("NombreRegistro"));
                dummy.setEmail(request.getParameter("emailRegistro"));
                dummy.setLastname(request.getParameter("ApellidoRegistro"));
                dummy.setAddress(request.getParameter("DireccionRegistro"));
                dummy.setPassword(request.getParameter("PasswordRegistro"));
                pDAO.updateRecord(conexion.getConnection(), dummy);

                AccountDAO aDAO = new AccountDAO();
                BankDAO bDAO = new BankDAO();
                Long cuenta = aDAO.getAccountNumberByOwner(conexion.getConnection(), dummy.getId());
                String banco = bDAO.getAccountBank(conexion.getConnection(), cuenta);
                
                
                CardDAO cDAO = new CardDAO();
                Vector<CardDTO> listaTarjetas = cDAO.getRecordByAcoount(conexion.getConnection(), aDAO.getAccountIdByOwner(conexion.getConnection(), dummy.getId()));
                request.setAttribute("listaTarjetas", listaTarjetas);
                request.setAttribute("idSession",dummy.getId());
                request.setAttribute("nombre",dummy.getName());
                request.setAttribute("apellido",dummy.getLastname());
                request.setAttribute("dir",dummy.getAddress());
                request.setAttribute("email",dummy.getEmail());
                request.setAttribute("cuenta", cuenta);
                request.setAttribute("banco", banco);
                request.setAttribute("pass", dummy.getPassword());
                request.getRequestDispatcher("./JSPs/usuario_logueado.jsp").forward(request, response);
                break;
            }
            case "put-account": {
                AccountDAO aDAO = new AccountDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                AccountDTO dummy = new AccountDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                dummy.setNumber(Long.getLong(request.getParameter("number")));
                dummy.setPassword(request.getParameter("pass"));
                PersonDTO tmp = new PersonDTO();
                tmp.setId(Long.getLong(request.getParameter("idDueño")));
                dummy.setOwner(tmp);
                BankDTO btmp = new BankDTO();
                btmp.setId(Long.getLong(request.getParameter("idBanco")));
                dummy.setBank(btmp);
                aDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "put-bank": {
                BankDAO bDAO = new BankDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                BankDTO dummy = new BankDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                dummy.setName(request.getParameter("nombre"));
                bDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "put-card": {
                CardDAO cDAO = new CardDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                CardDTO dummy = new CardDTO();
                dummy.setId(ThreadLocalRandom.current().nextLong(0,100000));
                dummy.setCvc(ThreadLocalRandom.current().nextLong(100,1000));
                dummy.setNumber(ThreadLocalRandom.current().nextLong(1000000, 10000000));
                dummy.setExpiration_date(new Date());
                AccountDAO aDAO = new AccountDAO();
                Long cuenta = aDAO.getAccountIdByOwner(conexion.getConnection(), Long.parseLong(request.getParameter("cedula")));
                AccountDTO temp = new AccountDTO();
                temp.setId(cuenta);
                dummy.setAccount(temp);
                cDAO.insertRecord(conexion.getConnection(), dummy);
                PersonDAO pDAO = new PersonDAO();
                PersonDTO usu = (PersonDTO) pDAO.getPersonByID(conexion.getConnection(), Long.parseLong(request.getParameter("cedula")));
                BankDAO bDAO = new BankDAO();
                String banco = bDAO.getAccountBank(conexion.getConnection(), cuenta);
                
                String opcion = request.getParameter("TipoTarjeta");
                if(opcion == "Debito" || opcion == "debito"){
                    DebitDAO dDAO = new DebitDAO();
                    DebitDTO dummyD = new DebitDTO();
                    dummyD.setCard(dummy);
                    dummyD.setBalance(ThreadLocalRandom.current().nextDouble(10000,100000000));
                    dummyD.setId(ThreadLocalRandom.current().nextLong(1000000));
                    dDAO.insertRecord(conexion.getConnection(), dummyD);
                }else{
                    CreditDAO caDAO = new CreditDAO();
                    CreditDTO dummyC = new CreditDTO();
                    dummyC.setCard(dummy);
                    dummyC.setId(ThreadLocalRandom.current().nextLong(1000000));
                    dummyC.setQuota(ThreadLocalRandom.current().nextDouble(10000,5000001));
                    dummyC.setDebt(ThreadLocalRandom.current().nextDouble(10000,5000001));
                    caDAO.insertRecord(conexion.getConnection(), dummyC);
                    
                }
                
                
                Vector<CardDTO> listaTarjetas = cDAO.getRecordByAcoount(conexion.getConnection(), cuenta);
                
                request.setAttribute("listaTarjetas", listaTarjetas);
                request.setAttribute("res", true);
                request.setAttribute("idSession",usu.getId());
                request.setAttribute("nombre",usu.getName());
                request.setAttribute("apellido",usu.getLastname());
                request.setAttribute("dir",usu.getAddress());
                request.setAttribute("email",usu.getEmail());
                request.setAttribute("cuenta", cuenta);
                request.setAttribute("banco", banco);
                request.setAttribute("pass", usu.getPassword());
                response.getWriter().write("Registro agregado");
                request.getRequestDispatcher("./JSPs/usuario_logueado.jsp").forward(request, response);
                break;
            }
            
            case "delete-card": {
                CardDAO cDAO = new CardDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                Long cardNumber  = Long.parseLong(request.getParameter("NumTarjeta"));
                Long cardId = (Long) cDAO.getCardIdbyNumber(conexion.getConnection(), cardNumber);
                DebitDAO dDAO = new DebitDAO();
                CreditDAO crDAO = new CreditDAO();
                System.out.println("El id es" + cardId);
                dDAO.deleteRecord(conexion.getConnection(), cardId);
                crDAO.deleteRecord(conexion.getConnection(), cardId);
                cDAO.deleteRecord(conexion.getConnection(), cardId);
                
                AccountDAO aDAO = new AccountDAO();
                Long cuenta = aDAO.getAccountNumberByOwner(conexion.getConnection(), Long.parseLong(request.getParameter("cedula")));
                AccountDTO temp = new AccountDTO();
                temp.setId(cuenta);
                PersonDAO pDAO = new PersonDAO();
                PersonDTO usu = (PersonDTO) pDAO.getPersonByID(conexion.getConnection(), Long.parseLong(request.getParameter("cedula")));
                BankDAO bDAO = new BankDAO();
                String banco = bDAO.getAccountBank(conexion.getConnection(), cuenta);
                
                Vector<CardDTO> listaTarjetas = cDAO.getRecordByAcoount(conexion.getConnection(), cuenta);
                
                request.setAttribute("listaTarjetas", listaTarjetas);
                request.setAttribute("res", true);
                request.setAttribute("idSession",usu.getId());
                request.setAttribute("nombre",usu.getName());
                request.setAttribute("apellido",usu.getLastname());
                request.setAttribute("dir",usu.getAddress());
                request.setAttribute("email",usu.getEmail());
                request.setAttribute("cuenta", cuenta);
                request.setAttribute("banco", banco);
                request.setAttribute("pass", usu.getPassword());
                request.getRequestDispatcher("./JSPs/usuario_logueado.jsp").forward(request, response);
                break;
            }
            
            case "put-category": {
                CategoryDAO cDAO = new CategoryDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                CategoryDTO dummy = new CategoryDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                dummy.setName(request.getParameter("name"));
                dummy.setDescription(request.getParameter("desc"));
                cDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "put-credit": {
                CreditDAO cDAO = new CreditDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                CreditDTO dummy = new CreditDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                dummy.setQuota(Double.valueOf(request.getParameter("quota")));
                dummy.setDebt(Double.valueOf(request.getParameter("debt")));
                CardDTO tmp = new CardDTO();
                tmp.setId(Long.getLong(request.getParameter("cardId")));
                dummy.setCard(tmp);
                cDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "put-debit": {
                DebitDAO dDAO = new DebitDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                DebitDTO dummy = new DebitDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                dummy.setBalance(Double.valueOf(request.getParameter("balance")));
                CardDTO tmp = new CardDTO();
                tmp.setId(Long.getLong(request.getParameter("cardId")));
                dummy.setCard(tmp);
                dDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
                break;
            }
            case "put-transaction": {
                TransactionDAO tDAO = new TransactionDAO();
                ConexionBDs conexion = ConexionBDs.getInstanceConexion();
                TransactionDTO dummy = new TransactionDTO();
                dummy.setId(Long.getLong(request.getParameter("id")));
                String fecha = request.getParameter("date");
                LocalDate date = LocalDate.parse(fecha);
                dummy.setDate(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
                dummy.setAmount(Double.valueOf(request.getParameter("amount")));
                AccountDTO tmp = new AccountDTO();
                tmp.setId(Long.getLong(request.getParameter("rootId")));
                AccountDTO tmp2 = new AccountDTO();
                tmp.setId(Long.getLong(request.getParameter("desId")));
                dummy.setRoot_account(tmp);
                dummy.setDestination_account(tmp2);
                tDAO.insertRecord(conexion.getConnection(), dummy);

                request.setAttribute("student", "Laura");
                request.setAttribute("res", true);
                request.getRequestDispatcher("./JSPs/GetPersonList.jsp").forward(request, response);
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

}
