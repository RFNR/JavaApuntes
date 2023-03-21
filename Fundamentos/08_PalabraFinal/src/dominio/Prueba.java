
package dominio;

public class Prueba {
    
    public final static int MI_CONSTANTE = 999; 
    /*
    La combinacion "public final static" se la conoce como constante, se escribe el nombre de la variable en
    mayusculas y podra ser accedida desde cualquier parte pero no podra ser modificada.
    */
    
    public final void imprimir(){
        System.out.println("Metodo imprimir desde clase hija.");
    /* 
        El final aplicado a metodos nos dice que las clases hijas no podran
        modificar el metodo. Fijate que pasa con la clase Empleado.java
    */
    }
    
    public void copiar(){
        System.out.println("Se copio 1 hoja.");
    }
}
