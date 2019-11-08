<%--
  Created by IntelliJ IDEA.
  User: KAORD
  Date: 28/10/2019
  Time: 08:30 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RP</title>
</head>
<body>
<h1>Productos Nuevos</h1>
<form method="post" action="${pageContext.request.contextPath}/productos">
    Producto: <input type="text" name="Producto" id="Producto"><br>
    Precio: <input type="text" name="Precio" id="Precio"><br>
    Stock: <input type="text" name="Stock" id="Stock"><br>

    <button type='submit' class='btn btn-success'>Registrar</button>
</form>
<button type='submit' class='btn btn-success' onclick="location.href='index.jsp';">Regresar</button>
</body>
</html>
