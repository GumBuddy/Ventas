<%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 28/10/2019
  Time: 08:29 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro</title>
</head>
<body>
<h1>Registro de Cliente</h1>
<form method="post" action="${pageContext.request.contextPath}/Cliente">
    Nombre: <input type="text" name="Name" ><br>
    Ciudad: <input type="text" name="Country" ><br>

    <button type='submit' class='btn btn-success'>Registrar</button>
</form>
<button type='submit' class='btn btn-success' onclick="location.href='index.jsp';">Regresar</button>
</body>
</html>
