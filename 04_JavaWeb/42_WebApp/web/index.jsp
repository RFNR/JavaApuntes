
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>Pagina JSP</title>
    </head>
    <body>
        <script src="https://use.fontawesome.com/97d5743a7f.js"></script>  
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("logueado") == null || sesion.getAttribute("logueado").equals("0")) {
        %>
        <script>
            location.href = "login.jsp";
        </script>
        <%
            }
        %>
        <div class="container">
            <div class="row">
                <nav class="navbar bg-body-tertiary">
                    <div class="container-fluid">
                        <a class="navbar-brand">Programador Novato</a>
                        <form class="d-flex justify-content-center align-items-center" role="search" action="logout.jsp">
                            <a class="px-3 text-decoration-none text-dark" href="datosUsuario.jsp"><i class="fa fa-user-circle" aria-hidden="true"></i> <%=sesion.getAttribute("usuario")%></a>
                            <button class="btn btn-outline-danger" type="submit">Log out</button>
                        </form>
                    </div>
                </nav>
            </div>


            <div class="row mt-3">
                <div class="col-sm">
                    <form action="index.jsp" method="post">
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Escribe tu nombre</label>
                            <input type="text" class="form-control" name="nombreIngresado" placeholder="Nombre">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Escribe tu edad</label>
                            <input type="text" class="form-control" name="edadIngresada" placeholder="Edad">
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-sm">
                    <div class="alert" role="alert" style="background-color: buttonface">
                        <%
                            String nombre = request.getParameter("nombreIngresado");
                            String edad = request.getParameter("edadIngresada");
                            String mensajeEdad = "";

                            if (nombre != null && edad != null) {

                                if (nombre.equals("") && edad.equals("")) {
                                    out.print("Ingrese nombres y edad");
                                } else {
                                    if (nombre.equals("")) {
                                        out.print("Ingrese nombres");
                                    } else {
                                        if (edad.equals("")) {
                                            out.print("Ingrese edad");
                                        } else {
                                            int edadNumero = Integer.parseInt(edad);
                                            if (edadNumero >= 1 && edadNumero <= 18) {
                                                mensajeEdad = "Eres un humano inexperto";
                                            }
                                            if (edadNumero > 18 && edadNumero <= 30) {
                                                mensajeEdad = "Eres un humano joven e inexperto";
                                            }
                                            if (edadNumero > 30) {
                                                mensajeEdad = "Eres un humano viejo";
                                            }
                                            String saludarAlHumano = "Hola " + nombre + " a tus " + edad + " años " + mensajeEdad;
                                            out.print(saludarAlHumano);
                                        }
                                    }
                                }

                            } else {
                                out.print("Humano estupido, te pedi que colocaras tu nombre y tu edad");
                            }

                        %>
                    </div>
                </div>
            </div>
        </div>

        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="index.jsp" method="get">
                        <table class="table table-striped">
                            <thead>
                                <tr class="text-center">
                                    <th scope="col"></th>
                                    <th scope="col">
                                        <input type="text" name="nombre" class="form-control" placeholder="Buscar por nombre..."/>
                                    </th>
                                    <th scope="col">
                                        <input type="submit" value="Buscar" name="buscar" class="form-control btn btn-primary" />
                                    </th>
                                    <th scope="col">
                                        <a href="crear.jsp">
                                            <i class="fa fa-user-plus text-success" aria-hidden="true"></i>
                                        </a>
                                    </th>
                                </tr>
                                <tr>
                                    <th scope="col">Id</th>
                                    <th scope="col">Nombre</th>
                                    <th scope="col">Direccion</th>
                                    <th scope="col">Telefono</th>
                                    <th scope="col">Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <jsp:include page="/Empleados"></jsp:include>
                            </tbody>
                        </table>
                    </form>


                </div>
            </div>
        </div>
    </body>
</html>

