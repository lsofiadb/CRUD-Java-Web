<%-- 
    Document   : producto_crear
    Created on : 24/10/2022, 2:38:07 p. m.
    Author     : nixod
--%>

<%@page import="co.edu.udistrital.dasp.DTOs.PersonDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>:: LISTA USUARIOS::</h1>
        <% 
           String nombre = (String) request.getAttribute("student");
           ArrayList<PersonDTO> lista = (ArrayList<PersonDTO>) request.getAttribute("listaP");
        %>
        <table>
            <tr>
                <td>Nombre: <%=nombre%></td>
            </tr>
            <tr>
                <td>Tamaño Lista: <%=lista.size()%></td>
            </tr>
        </table>  
        <table>
            <tr>
                <td>ID</td>
                <td>NOMBRE</td>
                <td>LASTNAME</td>
                <td>E-MAIL</td>
                <td>PASSWORD</td>
                <td>ADDRESS</td>
            </tr>
            <tr>
                <td><%=lista.get(0).getId()%></td>
                <td><%=lista.get(0).getName()%></td>
                <td><%=lista.get(0).getLastname()%></td>
                <td><%=lista.get(0).getEmail()%></td>
                <td><%=lista.get(0).getPassword()%></td>
                <td><%=lista.get(0).getAddress()%></td>
            </tr>
        </table>   
    </body>
</html>
