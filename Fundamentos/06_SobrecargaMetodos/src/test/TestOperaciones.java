
package test;
import metodos.Operaciones;

public class TestOperaciones {
    
    public static void main(String[] args) {
        
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        /*
        No se puede poner esto -> resultado = Operaciones.sumar(5.0, 3);
        Estamos tratado de reasignar el valor de resultado para que acepte variables de tipo double cuando 
        en su definicion se declaro que acepta variables de tipo int. Por eso creamos otra variable.
        */
        
        var resultado2 = Operaciones.sumar(3.0, 5);
        System.out.println("resultado = " + resultado2);
    }
}
