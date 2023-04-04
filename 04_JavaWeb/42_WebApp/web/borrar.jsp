
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Borrar empleado</title>
    </head>
    <body>
        <%  HttpSession sesion = request.getSession();
            if (sesion.getAttribute("logueado") == null || sesion.getAttribute("logueado").equals("0")) {
                response.sendRedirect("login.jsp");
            }

            int id = Integer.parseInt(request.getParameter("id"));

            String bd = "administracion";
            String user = "root";
            String pass = "40404268";
            String ip = "localhost";
            String puerto = "3306";

            String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

            Connection conn = null;
            PreparedStatement st = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(cadena, user, pass);
                st = conn.prepareStatement("DELETE FROM empleados WHERE id = ?");
                st.setInt(1, id);
                st.executeUpdate();
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } catch (Exception e) {
                out.print(e);
            }
            conn.close();
        %>
    </body>
</html>
