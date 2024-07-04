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
        <section id="carousel">
            <div id="carouselExampleRide" class="carousel slide" data-bs-ride="true">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="grid-container1">
                            <img class="carousel-imagen" src="img/1.jpeg" alt="">
                            <img class="carousel-imagen" src="img/2.jpeg" alt="">
                            <img class="carousel-imagen" src="img/3.jpeg" alt="">
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="grid-container2">
                            <img class="carousel-imagen" src="img/4.jpeg" alt="">
                            <img class="carousel-imagen" src="img/5.png" alt="">
                            <img class="carousel-imagen" src="img/6.jpeg" alt="">
                            <img class="carousel-imagen" src="img/7.png" alt="">
                            <img class="carousel-imagen" src="img/8.jpeg" alt="">
                            <img class="carousel-imagen" src="img/9.jpeg" alt="">
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="grid-container3">
                            <img class="carousel-imagen" src="img/10.jpeg" alt="">
                            <img class="carousel-imagen" src="img/11.jpeg" alt="">
                            <img class="carousel-imagen-central" src="img/15.jpeg" alt="">
                            <img class="carousel-imagen" src="img/13.jpeg" alt="">
                            <img class="carousel-imagen" src="img/14.jpeg" alt="">
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleRide" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleRide" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </section>
    </main>

    <footer>
        <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.</p>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
