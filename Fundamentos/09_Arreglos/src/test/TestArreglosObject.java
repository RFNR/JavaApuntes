
package test;

import dominio.Persona;

public class TestArreglosObject {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        /* El valor por defecto en cada posicion de un arreglo de tipo Object es null. */
        
        for(var i = 0 ; personas.length > i; i++){
            System.out.println("personas["+i+"] = " + personas[i]);
        }
        
        personas[0] = new Persona("Ronald");
        personas[1] = new Persona("Fernando");
        
        for(var i = 0 ; personas.length > i; i++){
            System.out.println("personas["+i+"] = " + personas[i]);
        }
        
    }
    
}
