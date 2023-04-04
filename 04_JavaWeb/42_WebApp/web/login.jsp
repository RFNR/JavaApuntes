
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="Utils.Encriptar"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="login.jsp" method="post">
                        <div class="form-group mb-3">
                            <label>Usuario</label>
                            <input type="text" class="form-control" name="usuario" placeholder="Humano pon tu usuario">
                        </div>
                        <div class="form-group mb-3">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Humano pon tu password">
                        </div>
                        <button type="submit" class="btn btn-primary" name="login" >Login</button>
                    </form>
                </div>
            </div>
        </div>
        <script src="https://use.fontawesome.com/97d5743a7f.js"></script>
    </body>

    

    <%
        Encriptar encriptar = new Encriptar();
        if (request.getParameter("login") != null) {

            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            HttpSession sesion = request.getSession();

            String bd = "administracion";
            String user = "root";
            String pass = "40404268";
            String ip = "localhost";
            String puerto = "3306";

            String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

            Connection conn = null;
            PreparedStatement st = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(cadena, user, pass);
                st = conn.prepareStatement("SELECT * FROM users");
                rs = st.executeQuery();

                while (rs.next()) {

                    if (usuario.equals(rs.getString("user")) && encriptar.getMD5(password).equals(rs.getString("password"))) {
                        String idDB = "" + rs.getInt("id");
                        sesion.setAttribute("logueado", "1");
                        sesion.setAttribute("usuario", usuario);
                        sesion.setAttribute("idDB", idDB);
                        response.sendRedirect("index.jsp");
                    }
                }
    %>

    <div class="alert alert-danger text-center container mt-3" role="alert">
        <% out.print("Humano te quivocaste, usuario o contraseña invalidos.");%>
    </div> 

    <%
            } catch (Exception e) {
                out.print(e);
            }
            conn.close();
        }
    %>

</html>
