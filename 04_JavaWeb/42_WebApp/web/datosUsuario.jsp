
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" %>
<%@page import="Utils.Encriptar"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>Datos de usuario</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("logueado") == null || sesion.getAttribute("logueado").equals("0")) {
                response.sendRedirect("login.jsp");
            }

            Encriptar encriptar = new Encriptar();

            Integer idDB2 = Integer.parseInt((String) sesion.getAttribute("idDB"));
            int idDB = idDB2;

            String bd = "administracion";
            String user = "root";
            String pass = "40404268";
            String ip = "localhost";
            String puerto = "3306";

            String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

            Connection conn = null;
            PreparedStatement st = null;
        %>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <h1>Edita tu usuario</h1>
                    <form action="datosUsuario.jsp" method="post">
                        <div class="form-group mt-3">
                            <label >Nuevo usuario</label>
                            <input type="text" class="form-control" name="user1" placeholder="Usuario">
                        </div>
                        <div class="form-group mt-3">
                            <label >Nueva contraseña</label>
                            <input type="password" class="form-control" name="password1" placeholder="Contraseña">
                        </div>
                        <div class="form-group mt-3">
                            <label >Repita su contraseña</label>
                            <input type="password" class="form-control" name="password2" placeholder="Contraseña">
                        </div>
                        <button type="submit" name="guardar" class="btn btn-primary mt-3">Guardar</button>ㅤ
                        <a href="index.jsp" class="btn btn-danger mt-3">Cancelar</a>
                    </form>

                </div>
            </div>
        </div>

        <%
            if (request.getParameter("guardar") != null) {

                String password1 = request.getParameter("password1");
                String password2 = request.getParameter("password2");

                if (password1.equals(password2)) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection(cadena, user, pass);
                        st = conn.prepareStatement("UPDATE users SET user = ?, password = ? WHERE id = ?");
                        st.setString(1, request.getParameter("user1"));
                        st.setString(2, encriptar.getMD5(request.getParameter("password1")));
                        st.setInt(3, idDB);
                        st.executeUpdate();
                        sesion.setAttribute("usuario", request.getParameter("user1"));
                        response.sendRedirect("index.jsp");
                        conn.close();
                    } catch (Exception e) {
                        out.print(e);
                    }
                } else {
        %>        
        <div class="alert alert-danger text-center container mt-3" role="alert">
            Las contraseñas no son iguales.
        </div>

        <%        }

            }
        %>
        <script src="https://use.fontawesome.com/97d5743a7f.js"></script>
    </body>
</html>
