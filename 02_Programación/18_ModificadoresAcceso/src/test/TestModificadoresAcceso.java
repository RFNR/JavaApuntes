
package test;

import paquete1.Clase1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        Clase3 clase2 = new Clase3();
        
        /* Los modificadores default y private verlos en el pdf. Es facil por eso no hago ejemplos. 
            https://drive.google.com/file/d/1V3R4FqRgpaImmbPn7Oz6XBiJLToDojRU/view?usp=sharing
        */
    }
}
