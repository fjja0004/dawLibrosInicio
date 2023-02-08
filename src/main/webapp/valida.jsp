<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <title>Catálogo de libros</title>
</head>
<body>
    <h1>Datos del libro (JSP)</h1>
    <ul>
        <% if (request.getParameter("titulo").length()==0) { %>
            <li>Error: no se ha enviado el título del libro</li>
        <% } %>
    </ul>
    <div>Nombre: <%=request.getParameter("titulo")%></div>
    <div>ISBN:  <%=request.getParameter("isbn")%></div>
</body>
</html>