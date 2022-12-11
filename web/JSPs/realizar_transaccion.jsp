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


</style>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Transacción</title>

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
                     src="http://www.illeslex.com/imagenes/paginas/abogados-mallorcabfh.jpg"
                     />
                <h1 class="h3 mb-3 fw-normal">Editar Datos</h1>
                <div class="form-floating">
                    <label><b>Cuenta Origen</b></label><br>
                    <input
                        type="Number"
                        class="form-control"
                        id="CuentaOrigen"
                        placeholder="Número de cuenta"
                        />

                </div>
                <div class="form-floating">
                    <label><b>Cuenta Destino</b></label><br>
                    <input
                        type="Number"
                        class="form-control"
                        id="CuentaDestino"
                        placeholder="Número de cuenta"
                        />
                </div>
                <div class="form-floating">
                    <label><b>Monto</b></label><br>
                    <input
                        type="Number"
                        class="form-control"
                        id="Monto"
                        placeholder="Monto"
                        />
                </div>
                <div class="form-floating">
                    <label><b>Banco</b></label><br>
                    <input
                        type="Text"
                        class="form-control"
                        id="Banco"
                        placeholder="Nombre del Banco"
                        />
                </div>

                <div class="form-floating Password">
                    <label><b>Categoria</b></label><br>
                    <input
                        type="Text"
                        class="form-control"
                        id="Categoria"
                        placeholder="Préstamo, etc"
                        />
                </div>
                <button
                    class="w-100 btn btn-lg btn-primary"
                    id="RealizarTransaccion"
                    type="button"
                    >
                    Realizar Transacción
                </button>
                <p class="mt-5 mb-3 text-muted">&copy;&nbsp;2022</p>
            </div>
        </main>
    </body>
</html>
