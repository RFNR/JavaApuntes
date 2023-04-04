<%-- 
    Document   : index
    Created on : 30 mar. 2023, 21:21:35
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
        <title>Pagina JSP</title>
    </head>
    <body>

        <div class="container mt-5">
            <div class="row">
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
                                            String mensajeEdad = "";
                                            if (edadNumero >= 1 && edadNumero <= 18) {
                                                mensajeEdad = "eres un humano inexperto";
                                            }
                                            if (edadNumero > 18 && edadNumero <= 30) {
                                                mensajeEdad = "eres un humano joven e inexperto";
                                            }
                                            if (edadNumero > 30) {
                                                mensajeEdad = "eres un humano viejo";
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

        <% 
            String bd = "administracion";
            String user = "root";
            String pass = "40404268";
            String ip = "localhost";
            String puerto = "3306";
            
            String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
            
            Connection conn = null;
            PreparedStatement st = null;
            ResultSet rs = null;
        %>

        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">

                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Nombre</th>
                                <th scope="col">Direccion</th>
                                <th scope="col">Telefono</th>
                            </tr>
                        </thead>
                        <tbody>
                                <% 
                                    try{
                                        conn = DriverManager.getConnection(cadena, user, pass);
                                        stmt = conn.prepareStatement("SELECT * FROM empleados");
                                        rs = stmt.executeQuery();

                                        while (rs.next()) {
                                            int id = rs.getInt("id");
                                            String nombre = rs.getString("nombre");
                                            String direccion = rs.getString("direccion");
                                            String telefono = rs.getString("telefono");
                                %>
                             <tr>                               
                                <th scope="row"><% out.print(id) %></th>
                                <td><% out.print(nombre) %></td>
                                <td><% out.print(direccion) %></td>
                                <td><% out.print(telefono) %></td>
                            </tr>    
                                <%
                                        }
                                    } catch (SQLException ex) {
                                        ex.printStackTrace(System.out);
                                    }
                                %>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>

    </body>
</html>
