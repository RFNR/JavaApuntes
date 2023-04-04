
package logica;

import datos.Conexion;
import static datos.Conexion.close;
import java.sql.*;
import java.util.*;
import usuario.Usuario;

public class Comandos {
    
    List<Usuario> userList = new ArrayList();
    
    // https://alldifferences.net/difference-between-executequery-executeupdate-and-execute/
    
    public void seleccionar(){
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario user;
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("SELECT * FROM usuarios");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idUser = rs.getInt("id_usuario");
                String nombre = rs.getString("usuario");
                String pass = rs.getString("password");
                
                user = new Usuario(idUser, nombre, pass);
                
                System.out.println("User["+ idUser +"] = " + user);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
    
    public void insertar(Usuario usuario){
        
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("INSERT INTO usuarios (usuario, password) VALUES(?, ?)");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.executeUpdate();
//            userList = null;
            if(userList.size() == 0){
                usuario.setIdUsuario(userList.size() + 1);
            }
            else if(userList.size() != userList.get(userList.size() - 1).getIdUsuario()){
                usuario.setIdUsuario(userList.get(userList.size() - 1).getIdUsuario() + 1);
            } 
            else{
                usuario.setIdUsuario(userList.size() + 1);
            }
            
            userList.add(usuario);
            System.out.println("Se inserto con exito el usuario = " + userList.get(userList.size() - 1));
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
    
    public void eliminarUsuario(int id){
    
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id_usuario = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
            for (int i = 0; i < userList.size(); i++) {
                if(userList.get(i).getIdUsuario() == id){
                    userList.remove(i);
                    System.out.println("El usuario se ha eliminado correctamente.");
                }
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public void actualizarNameUser(int id, String usuario){
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("UPDATE usuarios SET usuario = ? WHERE id_usuario = ?");
            stmt.setString(1, usuario);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            
            for (int i = 0; i < userList.size(); i++) {
                if(userList.get(i).getIdUsuario() == id){
                    userList.get(i).setUsuario(usuario);
                }
            }
            
            System.out.println("El nombre de usuario se ha cambiado correctamente.");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    public void actualizarPassword(int id, String password){
        
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("UPDATE usuarios SET password = ? WHERE id_usuario = ?");
            stmt.setString(1, password);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            
            for (int i = 0; i < userList.size(); i++) {
                if(userList.get(i).getIdUsuario() == id){
                    userList.get(i).setPassword(password);
                }
            }
            
            System.out.println("La contraseña se cambio correctamente.");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    public void actualizarNameAndPassword(int id, String usuario, String password){
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("UPDATE usuarios SET usuario = ?, password = ? WHERE id_usuario = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, password);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            
            for (int i = 0; i < userList.size(); i++) {
                if(userList.get(i).getIdUsuario() == id){
                    userList.get(i).setUsuario(usuario);
                    userList.get(i).setPassword(password);
                }
            }
            
            System.out.println("Todos los datos del registro " + id + " se han modificados.");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
    public void verListaLocal(){
        
        if(userList.size() == 0){
            System.out.println("La lista local esta vacia.");
        }
        
        for(Usuario user: userList){
            System.out.println(user.toString());
        }
        
    }
    
    public void resetearDatos(){
        Connection conn = null;
        PreparedStatement stmt = null; 
        
        try {
            conn = Conexion.obtenerConexion();
            stmt = conn.prepareStatement("TRUNCATE TABLE usuarios");
            stmt.execute();
            System.out.println("Los datos han sido reseteados.");
            
            userList = new ArrayList();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        
    }
}

