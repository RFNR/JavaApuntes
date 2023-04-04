
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>Editar empleado</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("logueado") == null || sesion.getAttribute("logueado").equals("0")) {
                response.sendRedirect("login.jsp");
            }

            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("nombre");
            String adress = request.getParameter("direccion");
            String phone = request.getParameter("telefono");
        %>
        <div class="container mt-5">
            <div class="row">
                <h1>Edita un empleado</h1>
                <div class="col-sm">

                    <form action="editar.jsp" method="post">
                        <div class="form-group mb-3">
                            <label for="nombre">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" value="<%=name%>" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="direccion">Direccion</label>
                            <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Direccion" value="<%=adress%>" required>
                        </div>
                        <div class="form-group mb-3">
                            <label for="telefono">Telefono</label>
                            <input type="text" class="form-control" id="telefono" name="telefono" placeholder="Telefono" value="<%=phone%>" required>
                        </div>
                        <button type="submit" name="enviar" class="btn btn-success">
                            Guardarㅤ<i class="fa fa-floppy-o" aria-hidden="true"></i>
                        </button>
                        ㅤ
                        <a href="index.jsp" class="btn btn-danger">Cancelarㅤ<i class="fa fa-ban" aria-hidden="true"></i></a>
                        ㅤ
                        <a href="index.jsp" class="btn btn-primary">Volver a inicioㅤ<i class="fa fa-ban" aria-hidden="true"></i></a>
                        <input type="hidden" name="id" value="<%=id%>" > <!-- No borrar esta linea porque sino no funciona. -->
                    </form>

                </div>
            </div>
        </div>
        <%

            if (request.getParameter("enviar") != null) {

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
                    st = conn.prepareStatement("UPDATE empleados SET nombre = ?, direccion = ?, telefono = ? WHERE id = ?");
                    st.setString(1, name);
                    st.setString(2, adress);
                    st.setString(3, phone);
                    st.setInt(4, id);
                    st.executeUpdate();

                } catch (Exception e) {
                    out.print(e);
                }
                conn.close();
            }
        %>
        <script src="https://use.fontawesome.com/97d5743a7f.js"></script> 
    </body>
</html>
