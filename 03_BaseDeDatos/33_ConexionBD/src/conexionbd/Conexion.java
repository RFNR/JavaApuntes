package conexionbd;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conn = null;
    String bd = "administracion";
    String user = "root";
    String pass = "40404268";
    String ip = "localhost";
    String puerto = "3306";
    String driver = "com.mysql.cj.jdbc.Driver";
    Statement st = null;
    ResultSet rs = null;

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection miConexion() {

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(cadena, user, pass);
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM carreras");
            while (rs.next()) {
                int idCarrera = rs.getInt(1);
                String nombreCarrera = rs.getString(2);
                System.out.println("Id de la carrera: " + idCarrera);
                System.out.println("Nombre de la carrera: " + nombreCarrera);
            }
            JOptionPane.showMessageDialog(null, "Conexion realizada con exito.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ocurrio un error al conectarse a la base de datos. " + e.toString());

        }
        return conn;
    }
}
