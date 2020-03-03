<%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 9/12/2019
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/main.css">


</head>
<body style="background-color:#32253e">
<div class="container-login100" style="display:inline-grid">
    <form  method="post" action="${pageContext.request.contextPath}/ADIOS">
        <button type='submit' class=" btn btn-success">Confirmar</button><br>
    </form>
    <button type='submit' class='btn btn-success' onclick="location.href='index.jsp';">Regresar</button>

</div>

</body>
</html>
