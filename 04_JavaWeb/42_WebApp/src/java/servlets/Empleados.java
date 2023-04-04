package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Ronald
 */
@WebServlet(name = "Empleados", urlPatterns = {"/Empleados"})

public class Empleados extends HttpServlet {

    String bd = "administracion";
    String user = "root";
    String pass = "40404268";
    String ip = "localhost";
    String puerto = "3306";

    // https://stackoverflow.com/questions/51586401/glassfish-keystore-error-after-adding-mysql-connector
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";

    Connection conn = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    String query = "SELECT * FROM empleados";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            try {

                conn = DriverManager.getConnection(cadena, user, pass);
                String nameSearch = request.getParameter("nombre");

                if (nameSearch != null) {
                    query += " WHERE nombre = \"" + nameSearch + "\"";
                }

                st = conn.prepareStatement(query);
                rs = st.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("nombre");
                    String adress = rs.getString("direccion");
                    String phone = rs.getString("telefono");
                    out.print("<tr>"
                            + "<th scope=\"row\">" + id + "</th>"
                            + "<td>" + name + "</td>"
                            + "<td>" + adress + "</td>"
                            + "<td>" + phone + "</td>"
                            + "<td>"
                            + "<a href=\"editar.jsp?id=" + id + "&nombre=" + name + "&direccion=" + adress + "&telefono=" + phone + "\"><i class=\"fa fa-pencil text-primary\" aria-hidden=\"true\"></i></a>ㅤㅤ"
                            + "<a href=\"borrar.jsp?id=" + id + "\"><i class=\"fa fa-trash text-danger\" aria-hidden=\"true\"></i></a>"
                            + "</td>"
                            + "</tr>");
                }
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            } 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
