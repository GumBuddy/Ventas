<%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 28/10/2019
  Time: 03:45 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html lang="en">
<head>
    <title>Ventas</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark probootstrap-navabr-dark">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">EL PADRINO</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#probootstrap-nav" aria-controls="probootstrap-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="probootstrap-nav">

            <ul class="navbar-nav ml-auto">

               <li class="nav-item"><a href="Registro.jsp" class="nav-link">Registrar Cliente</a></li>
                <li class="nav-item probootstrap-cta probootstrap-seperator"></li>
                <li class="nav-item probootstrap-cta"><a href="Login.jsp" class="nav-link">Iniciar Sesion</a></li>
            </ul>

        </div>
    </div>
</nav>


<section class="probootstrap-cover">
    <div class="container">
        <div class="row probootstrap-vh-100 align-items-center text-center">
            <div class="col-sm">
                <div class="probootstrap-text">
                    <h1 class="probootstrap-heading text-white mb-4">Bienvenido.</h1>
                    <div class="probootstrap-subheading mb-5">
                        <p class="h4 font-weight-normal">Crear Nuevo pedido?</p>
                    </div>
                    <p><a href="Pedido.jsp" class="btn btn-primary btn-outline-white mb-2">Solicitar</a></p>
                    <div class="probootstrap-subheading mb-5">
                        <p class="h4 font-weight-normal">Ver las actuales ordenes?</p>
                    </div>
                    <p><form method="post" action="${pageContext.request.contextPath}/Ordenes"><button  class="btn btn-primary btn-outline-white mb-2">Ordenes</button></form></p>
                </div>
            </div>
        </div>
    </div>
</section>


<script src="js/jquery-3.2.1.slim.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>