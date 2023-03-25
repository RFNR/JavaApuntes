package test;

import dominio.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
        
        /*
        https://www.youtube.com/watch?v=VLkYwfpCWm0
        
        Los metodos equals y hascode que trae la clase Object se pueden reescribir segun los criterios del IDE insertando codigo automatico.
        Se recomienda que ambos metodos sean insertados siguiendo las sugerencias del IDE. 
        Usando los metodos de la clase object: https://foro.elhacker.net/java/aporte_clase_object_del_paquete_javalang-t372378.0.html
        */
        
        Empleado empleado1 = new Empleado("RONALD", 5000);
        Empleado empleado2 = new Empleado("RONALD", 5000);  
        comprobacion(empleado1, empleado2);

        Empleado empleado3 = new Empleado("RONALD", 5000);
        Empleado empleado4 = empleado3;
        comprobacion(empleado3, empleado4);
        
        Empleado empleado5 = new Empleado("RONALD", 5000);
        Empleado empleado6 = new Empleado("ronald", 5000);  
        comprobacion(empleado5, empleado6);
        
        /*
        El valor de hascode se realiza a traves de un calculo matematico particular en cada IDE que toma en cuenta las variables, metodos,
        etc. Existe la posibilidad que un objeto creado con la misma clase u otro objeto creado con otra clase, tambien tengan el mismo 
        valor de hashcode, por lo tanto, tener este dato en cuenta aunque la posibilidad sea muy poca.
        */
        
        /* COMPORTAMIENTO EN OBJETOS PRIMITIVOS */
        
        String cadena_1= "Clase Object";
        String cadena_2= "Clase Object";

        if(cadena_1 == cadena_2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
           System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(cadena_1.equals(cadena_2)){
           System.out.println("El contenido es el mismo");
        }else{
           System.out.println("El contenido no es el mismo");
        }
        
        if(cadena_1 == cadena_2){
           System.out.println("El valor hashcode es igual");
        }else{
           System.out.println("El valor hashcode es distinto");
        }
               
        
    }
    
    
    public static void comprobacion(Empleado empleado1, Empleado empleado2){
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if( empleado1.equals(empleado2) ){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        }
        else{
            System.out.println("El valor hashcode es distinto");
        }
        System.out.println("--------------------------------------------------------------");
    }
}
