
package test;

import datos.Conexion;
import logica.Comandos;
import usuario.Usuario;
import java.sql.*;
public class Test {

    public static void main(String[] args) {
        
//        comando.resetearDatos();
        Connection conexion = null;
        
        try { 
            conexion = Conexion.obtenerConexion();
            
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            
            Comandos comando = new Comandos(conexion);
            
            comando.actualizarNameUser(2, "Mimosa");
            
//            Usuario user = new Usuario("Juan Roman", "Riquelme");
            
            Usuario user = new Usuario("Nombre con mas de 30 caracteres -> 48 caracteres", "Riquelme"); // Produce un error
            comando.insertar(user);
            
            conexion.commit();
            
        } catch (SQLException ex) {
            
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
            }
            
        }


    }
}


