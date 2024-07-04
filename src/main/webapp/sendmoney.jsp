<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ALKE WALLET</title>
    <link rel="stylesheet" href="css/styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<body>
    <header>
        <div class="container text-center">
          <div class="row">
            <div class="col">
                <div class="buscador">
                      <input class="buscarinput" type="search" name="q" placeholder="Buscar...">
                       <a class="lupa" href=""><img src="img/icon_buscar.png" alt=""></a>
                  </div>
              <img class="imagennav" src="img/nav_menu_icon.png" alt="icono navegador">
              <nav class="nav-lista">
                <ul class="nav flex-column">
                  <li class="nav-item">
                      <a class="nav-link" href="menu.jsp">Menu</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="deposit.jsp">Deposit</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="sendmoney.jsp">Send Money</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="transactions.jsp">Transactions</a>
                    </li>
                </ul>
            </nav>
            </div>
            <div class="col-6">
              <h1>---ALKE WALLET---</h1>

            </div>
            <div class="col">
              <a href="login.jsp"><input id="login2" type="submit" value="Iniciar Sesión"></a>
            </div>
          </div>
        </div>

      </header>

<main class="container-fluid">
    <section class="loginelegante">
        <form action="" method="POST">
            <h2>Agregar nuevo contacto</h2>
            <label class="User" for="User">Nombre</label>
            <br>
            <input  type="text" id="User" name="User" required><br>

            <label class="User" for="Rut">Rut</label>
            <br>
            <input  type="text" id="Rut" name="Rut" required><br>

            <label class="User" for="Email">Correo electrónico</label>
            <br>
            <input  type="email" id="Email" name="Email" required><br>

            <label class="User" for="Bank">Escoja banco</label>
            <br>
            <input  type="text" id="Bank" name="Bank" required><br>

            <label class="User" for="AccountType">Tipo de cuenta</label>
            <br>
            <input  type="text" id="AccountType" name="AccountType" required><br>

            <label class="User" for="Alias">Alias</label>
            <br>
            <input  type="text" id="Alias" name="Alias" required><br>

            <label class="User" for="AccountNumber">Numero de cuenta</label>
            <br>
            <input  type="text" id="AccountNumber" name="AccountNumber" required><br>
            <br>
            <div>
                <button id="listo" type="submit">Listo</button>
                <div class="alert alert-primary" role="alert" id="miAlerta" style="display: none;">
                    Cuenta agregada exitosamente!
                </div>
            </div>
            <a href="forgot_password.jsp">Olvidé mi contraseña</a>
        </form>
      </section>
</main>
<footer>
   <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
