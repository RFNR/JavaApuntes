package test;

import dominio.Persona;

public class TestJavaBeans {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona); // persona = Persona{nombre=Juan, apellido=Perez}
        
        System.out.println("Persona nombre: " + persona.getNombre()); // Persona nombre: Juan
        System.out.println("Persona apellido: " + persona.getApellido()); // Persona apellido: Perez
    }
}
