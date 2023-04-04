<%-- 
    Document   : logout
    Created on : 1 abr. 2023, 15:27:54
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            sesion.invalidate();
            response.sendRedirect("login.jsp");
        %>
    </body>
</html>
