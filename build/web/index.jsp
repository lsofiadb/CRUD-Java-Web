<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style>
    html,
    body {
        height: 100%;
    }

    body {
        display: flex;
        align-items: center;
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

    .main{
        border-style: solid;
        border-radius:10px;
        padding: 10px;
        border-color: graytext;
        background: rgb(211, 255, 252);
    }

</style>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Login</title>

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
        <main class="form-signin">
            <div class="main">
                <img class="mb-4"
                     alt=""
                     src="https://blog.internexa.com/hubfs/Blog/Portada/Dise%C3%B1o%20sin%20t%C3%ADtulo%20(14)-1.png"
                     />
                <h1 class="h3 mb-3 fw-normal">Login</h1>
                <form action="CardController" metod="POST">
                    <div class="form-floating user">
                        <input

                            class="form-control"
                            id="UsuarioLogin"
                            name="UsuarioLogin"
                            placeholder="Usuario"
                            />

                    </div>
                    <div class="form-floating Password">
                        <input
                            type="Password"
                            class="form-control"
                            id="PasswordLogin"
                            name="PasswordLogin"
                            placeholder="Contraseña"
                            />

                    </div>
                    <input
                        class="w-100 btn btn-lg btn-primary"
                        id="IngresarLogin"
                        type="submit"
                        value="Ingresar"
                        />
                        <input type="hidden" name="service" value="login"/>
                </form>
                <form action="PersonController" method="POST">
                    <input class="w-100 btn btn-lg btn-secundary"
                        id="RigistraseLogin"
                        type="submit" value="Registrarse"/>
                    <input type="hidden" name="service" value="go-reg"/>
                </form>
                <p class="mt-5 mb-3 text-muted">&copy;&nbsp;2022</p>
            </div>
        </main>
    </body>
</html>