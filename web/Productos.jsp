<%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 28/10/2019
  Time: 03:45 p. m.
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

<body>

<div class="limiter">
    <div class="container-login100" style="background-image: url('images/cover_bg.svg');">
        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">
            <form class="login100-form validate-form" method="post" action="${pageContext.request.contextPath}/productos">
					<span class="login100-form-title p-b-49">
						Nuevos Productos
					</span>

                <div class="wrap-input100 validate-input m-b-23" data-validate = "Ingresa el Nombre del Producto:">
                    <span class="label-input100">Producto:</span>
                    <input class="input100" type="text" name="Producto" placeholder="Ingresa un Producto">
                    <span class="focus-input100" data-symbol="&#xf27d;"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="Ingresa el Precio:">
                    <span class="label-input100">Precio:</span>
                    <input class="input100" type="text" name="Precio" placeholder="Ingresa Precio">
                    <span class="focus-input100" data-symbol="&#xf19a;"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="Ingresa el Stock">
                    <span class="label-input100">Stock:</span>
                    <input class="input100" type="text" name="Stock" placeholder="Stock Disponible">
                    <span class="focus-input100" data-symbol="&#xf315;"></span>
                </div>

                <div class="container-login100-form-btn">
                    <div class="wrap-login100-form-btn">
                        <div class="login100-form-bgbtn"></div>
                        <button class="login100-form-btn">
                            Finalizar
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