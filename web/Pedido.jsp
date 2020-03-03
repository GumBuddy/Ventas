<%@ page import="Modelo.DTO.Cliente_Bean" %>
<%@ page import="Modelo.DAO.Cliente" %>
<%@ page import="Modelo.DTO.Orden_Bean" %>
<%@ page import="Modelo.DAO.Orden" %><%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 6/12/2019
  Time: 02:34
  To change this template use File | Settings | File Templates.
--%>
<script src="https://use.fontawesome.com/7f876f2796.js"></script>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <title>Registro</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="css/util.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <!--===============================================================================================-->
</head>
<%

%>
<body>

<div class="limiter">
    <div class="container-login100" style="background-image: url('images/cover_bg.svg');">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <form class="login100-form validate-form" method="post" action="${pageContext.request.contextPath}/Detalles">
					<span class="login100-form-title p-b-49">
						Buscar Orden
					</span>

                <div class="wrap-input100 validate-input m-b-23" data-validate = "Ingresa el Folio :">
                    <span class="label-input100">Folio del Producto</span>
                    <input class="input100" type="number" name="ID" placeholder="FOLIO">
                    <span class="focus-input100" data-symbol="&#xf13a;"></span>
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button class="login100-form-btn">
                            Buscar
                        </button>
                    </div>
                </div>



                <div class="flex-col-c p-t-155">

                    <a href="index.jsp" class="txt2">
                        Regresar
                    </a>
                </div>
            </form>
        </div>
    </div>
</div>



<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/bootstrap/js/popper.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/daterangepicker/moment.min.js"></script>
<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="js/main.js"></script>

</body>
</html>
