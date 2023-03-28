
package test;

import logica.Comandos;
import usuario.Usuario;

public class Test {

    public static void main(String[] args) {
        
        Comandos comando = new Comandos();
        
        Usuario user = new Usuario("Tomiko", "111");
        comando.insertar(user);
        Usuario user2 = new Usuario("Nezuko", "222");
        comando.insertar(user2);
        Usuario user3 = new Usuario("Marin", "333");
        comando.insertar(user3);
        Usuario user4 = new Usuario("Hinata", "444");
        comando.insertar(user4);
        comando.verListaLocal();
        
        System.out.println("---------");
        
        comando.seleccionar();
        comando.eliminarUsuario(3);
        comando.seleccionar();
        comando.verListaLocal();
        
        System.out.println("---------");
       
        Usuario user5 = new Usuario("Rafthalia", "555");
        comando.insertar(user5);
        comando.seleccionar();

        comando.verListaLocal();
        
        comando.actualizarNameUser(4, "Sakura");
        comando.verListaLocal();
        comando.seleccionar();
        comando.actualizarPassword(5, "555555555555555555555");
        comando.verListaLocal();
        comando.seleccionar();
        comando.actualizarNameAndPassword(1, "Toga", "1111111111111111111111111111");
        comando.verListaLocal();
        comando.seleccionar();
        
//        comando.resetearDatos();
    }
}

