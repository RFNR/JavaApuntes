
package test;

import dominio.Persona;

public class TestForEach {
    
    public static void main(String[] args) {
        
        int edades[] = {5, 9, 5, 7};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Ronald"), new Persona("Fernando"), new Persona("Felipe")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}
