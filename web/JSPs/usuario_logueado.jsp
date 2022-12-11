<%@page import="java.util.Vector"%>
<%@page import="co.edu.udistrital.dasp.model.DTOs.CardDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
    html,
    body {
        height: 100%;
    }

    body {
        display: flex;
        flex-direction: row;
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
    }

    .form-signin {
        width: 100%;
        max-width: 330px;
        padding: 15px;
        margin: auto;

    }

    .form-signin .checkbox {
        font-weight: 400;
    }

    .form-signin .form-floating:focus-within {
        z-index: 2;
    }

    .form-signin input[type="password"] {
        margin-bottom: 10px;
        border-top-left-radius: 0;
        border-top-right-radius: 0;
    }
    .mb-4{
        border-radius:10px;
        width:250px;
        height:250px;
    }
    .form-floating{
        text-align: start;
        padding: 5px;
    }
    .main{
        border-style: solid;
        border-radius:10px;
        padding: 10px;
        border-color: graytext;
        background: rgb(211, 255, 252);
    }
    .btnProducto{
        margin: 5px;
    }


</style>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Usuario Logueado</title>

        <!-- Bootstrap -->
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
            />
        <link rel="stylesheet" href="../assets/css/login.css" />

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

        <script src="../assets/js/login.js"></script>
    </head>
    <body class="text-center">
        <% 
           Long cedula = (Long) request.getAttribute("idSession");
           Long cuenta = (Long) request.getAttribute("cuenta");
           String banco = (String) request.getAttribute("banco");
           String nombre = (String) request.getAttribute("nombre");
           String apellido = (String) request.getAttribute("apellido");
           String dir = (String) request.getAttribute("dir");
           String email = (String) request.getAttribute("email");
           String pass = (String) request.getAttribute("pass");
           Vector<CardDTO> listaC = (Vector<CardDTO>) request.getAttribute("listaTarjetas");
        %>
        <main class="form-signin">
            <div class="main">
                <h1 class="h3 mb-3 fw-normal">Informacion del Usuario</h1>
                <div class="form-floating">
                    <label><b>Nombre: <%=nombre%> </b></label><br>
                </div>
                <div class="form-floating">
                    <label><b>Apellido: <%=apellido%></b></label><br>
                </div>
                <div class="form-floating">
                    <label><b>Direccion: <%=dir%></b></label><br>
                </div>
                <div class="form-floating">
                    <label><b>Correo: <%=email%></b></label><br>
                </div>
                <div class="form-floating">
                    <label><b>Numero de Cuenta: <%=cuenta%></b></label><br>
                </div>
                <div class="form-floating">
                    <label><b>Banco: <%=banco%></b></label><br>
                </div>
                <form action="PersonController" method="POST">
                    <input
                        class="w-100 btn btn-lg btn-primary"
                        id="EditarInfo"
                        type="submit"
                        value="Editar Información"
                        />
                    <input type="hidden" name="service" value="go-editarpersona"/>
                    <input type="hidden" name="nombre" value="<%=nombre%>"/>
                    <input type="hidden" name="apellido" value="<%=apellido%>"/>
                    <input type="hidden" name="dir" value="<%=dir%>"/>
                    <input type="hidden" name="email" value="<%=email%>"/>
                    <input type="hidden" name="pass" value="<%=pass%>"/>
                    <input type="hidden" name="cedula" value="<%=cedula%>"/>
                </form>
                <p class="mt-5 mb-3 text-muted">&copy;&nbsp;2022</p>
            </div>
        </main>
                <main class="form-signin">
            <div class="main">
                <h1 class="h3 mb-3 fw-normal">Información de los productos del usuario</h1>
                <div class="form-floating">
                    <table >
                        <%
                        for ( int i = 0; i < listaC.size() ; i++)
                            { 
                                System.out.println(listaC.get(i).getNumber());
                            %>
                            <tr>
                                <td><%=listaC.get(i).getNumber()%></td>
                                <td><%=listaC.get(i).getCvc()%></td>
                            </tr>
                            <%       
                            }
                        %>

                    </table>
                </div>
                <form action="PersonController" method="POST">
                        <input
                            class="w-100 btn btn-lg btn-primary btnProducto"
                            id="CrearProducto"
                            type="submit"
                            value="Crear nuevo producto"
                            />
                         <input type="hidden" name="service" value="go-crearCard"/>
                        <input type="hidden" name="nombre" value="<%=nombre%>"/>
                        <input type="hidden" name="apellido" value="<%=apellido%>"/>
                        <input type="hidden" name="dir" value="<%=dir%>"/>
                        <input type="hidden" name="email" value="<%=email%>"/>
                        <input type="hidden" name="pass" value="<%=pass%>"/>
                        <input type="hidden" name="cedula" value="<%=cedula%>"/>
                    </form>
                    <form action="PersonController" method="POST">
                            <input
                            class="w-100 btn btn-lg btn-primary btnProducto"
                            id="BorrarProducto"
                            type="submit"
                            value="Borrar un producto"
                            />
                            <input type="hidden" name="service" value="go-deleteCard"/>
                        <input type="hidden" name="nombre" value="<%=nombre%>"/>
                        <input type="hidden" name="apellido" value="<%=apellido%>"/>
                        <input type="hidden" name="dir" value="<%=dir%>"/>
                        <input type="hidden" name="email" value="<%=email%>"/>
                        <input type="hidden" name="pass" value="<%=pass%>"/>
                        <input type="hidden" name="cedula" value="<%=cedula%>"/>
                    </form>
                <p class="mt-5 mb-3 text-muted">&copy;&nbsp;2022</p>
            </div>
        </main>
    </body>
</html>