package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    
    public static void main(String[] args) {
        
        /*
        https://drive.google.com/file/d/1AInoWBoGVnHzNuF7BS-BKDbYAaAynwIZ/view?usp=sharing
        https://drive.google.com/file/d/1OKECd4WuCL9rl3beCkD-c1udteV0_N3u/view?usp=sharing
        https://www.youtube.com/watch?v=jTnpOT5ve4Q
        https://www.youtube.com/watch?v=v4Nf3xiCZKA
        https://www.youtube.com/watch?v=hFMfJP9wVHo
        https://www.youtube.com/watch?v=_jRV15BExOs
        https://www.youtube.com/watch?v=Kxr-rZJ4WBk
        https://www.youtube.com/watch?v=I_VXPQkQJ_k
        */
        
        /*
        int resultado = 0;
        
        try{
            resultado = 10/0; // Lanza la excepcion
        }catch(Exception e){ // Exception se usa para excepciones generales, igual que Error en Javascipt.
            System.out.println("Ocurrió un error: ");
            e.printStackTrace(System.out); // Una excepcion puede generar otras excepciones por lo que se formaria una pila de excepciones. 
//          En ese caso imprimimos toda la pila de excepciones con el metodo de la excepcion printStackTrace(System.out). El argumento de
//          el metodo es opcional pero se deja como buena practica. Ademas, el IDE nos recomienda usarlo.
        }
        
        System.out.println("resultado = " + resultado);
        */
        // Imprime: 
        
//        Ocurrió un error: 
//        java.lang.ArithmeticException: / by zero -> El tipo de la exception es ArithmeticException
//            at test.TestExcepciones.main(TestExcepciones.java:15) -> Linea donde ocurrio el problema
//        resultado = 0 -> Este cero no quiere decir que 10/0 = 0 si no que como hubo un error, el resultado 
//        de  10/0 no se asigno a la variable resultado. El valor 0 es el que se asigno al inicio.
        
        
                
        int resultado = 0;
        
        try{
            resultado = division(10, 0); // Lanza la excepcion
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrió un error de tipo Exception: ");
            System.out.println(e.getMessage());
        }    
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
