
package test;

// import ar.com.namepageweb.*; -> Se importan todas las clases de la carpeta ar/com/namepageweb. Metodo 1.
// Esta sintaxis no hace mas lento nustro programa.
// import ar.com.namepageweb.Utileria; // Se importa solo la clase Utileria. Metodo 2. 
// static ar.com.namepageweb.Utileria.imprimir; // Podemos usar el metodo imprimir sin llamar a la clase. Metodo 3.

public class TestUtileria {
    
    public static void main(String[] args) {
        
        // Utileria.imprimir("Saludos!"); // Metodo 1 o 2.
        // imprimir("Chau"); // Metodo 3.
        ar.com.namepageweb.Utileria.imprimir("Buenas tardes!"); // Metodo sin importar nada. 
        
    }
}
