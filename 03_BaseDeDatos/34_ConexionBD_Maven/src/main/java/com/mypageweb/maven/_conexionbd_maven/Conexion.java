
package com.mypageweb.maven._conexionbd_maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    String bd = "administracion";
    String user = "root";
    String pass = "40404268";
    String ip = "localhost";
    String puerto = "3306";
    String driver = "com.mysql.cj.jdbc.Driver"; // Driver de conexion entre JDBC Y SGBD
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection miConexion() {

        try {
//          Cargando la clase correspondiente al driver. La carga del driver se debería hacer 
//          siempre antes de conectar con la BD.
//                Class.forName(driver); -> Esta linea antes era requerida pero ya no. Se la puede omitir. En 
//                apps locales no deberia haber problema si se omite, pero en app webs puede que sea requerida.
                
                
//          La conexión a la BD está encapsulada en un objeto Connection. Para su creación
//          debemos proporcionar la url de la BD y, si la BD está protegida con contraseña, el login y
//          password para acceder a ella. El formato de la url variará según el driver que utilicemos.
//          Todas las url tendrán la siguiente forma general:
//          jdbc:<subprotocolo>:<nombre>, con subprotocolo indicando el tipo de SGBD y con
//          nombre indicando el nombre de la BD y aportando información adicional para la conexión.
            conn = DriverManager.getConnection(cadena, user, pass);

//          Una vez obtenida la conexión a la BD, podemos utilizarla para realizar consultas,
//          inserción y/o borrado de datos de dicha BD. Todas estas operaciones se realizarán
//          mediante lenguaje SQL. La clase Statement es la que permite realizar todas estas operaciones.  
//          La instanciación de esta clase se realiza haciendo uso del siguiente método
//          que proporciona el objeto Connection:
            st = conn.createStatement();
            
//          Podemos dividir las sentencias SQL en dos grupos: las que actualizan la BD y las que
//          únicamente la consultan.

//          Para obtener datos almacenados en la BD podemos realizar una consulta SQL (query).
//          Podemos ejecutar la consulta utilizando el objeto Statement, pero ahora haciendo uso del
//          método executeQuery al que le pasaremos una cadena con la consulta SQL. Los datos
//          resultantes nos los devolverá como un objeto ResultSet.
            rs = st.executeQuery("SELECT * FROM carreras");
            
//          La consulta SQL nos devolverá una tabla, que tendrá una serie de campos y un conjunto
//          de registros, cada uno de los cuales consistirá en una tupla de valores correspondientes a
//          los campos de la tabla.
//          Los campos que tenga la tabla resultante dependerán de la consulta que hagamos, de los
//          datos que solicitemos que nos devuelva.
            
//          El objeto ResultSet dispone de un cursor que estará situado en el registro que podemos
//          consultar en cada momento. Este cursor en un principio estará situado en una posición
//          anterior al primer registro de la tabla. Podemos mover el cursor al siguiente registro con
//          el método next del ResultSet. La llamada a este método nos devolverá true mientras
//          pueda pasar al siguiente registro, y false en el caso de que ya estuviéramos en el último
//          registro de la tabla. Para la consulta de todos los registros obtenidos utilizaremos
//          normalmente un bucle como el siguiente:
            while (rs.next()) {
                
//                Ahora necesitamos obtener los datos del registro que marca el cursor, para lo cual
//                podremos acceder a los campos(columnas) de dicho registro. Esto lo haremos utilizando los métodos
//                getXXXX(campo) donde XXXX será el tipo de datos de Java en el que queremos que nos
//                devuelva el valor del campo. Hemos de tener en cuenta que el tipo del campo en la tabla
//                debe ser convertible al tipo de datos Java solicitado. Para especificar el campo que
//                queremos leer podremos utilizar bien su nombre en forma de cadena, o bien su índice que
//                dependerá de la ordenación de los campos que devuelve la consulta. También debemos
//                tener en cuenta que no podemos acceder al mismo campo dos veces seguidas en el mismo
//                registro. Si lo hacemos nos dará una excepción.
                int idCarrera = rs.getInt("id");
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
