
package test;

import dominio.*; // Importo todas las clases.

public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable = 10; // Con final no se puede modificar el valor de la variable una vez creada. 
        System.out.println("miVariable = " + miVariable);
        // miVariable = 8; -> Da error. 
        
        System.out.println("MI_CONSTANTE = " + Prueba.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        // persona1 = new Persona(); -> No se puede hacer porque persona1 es final.
        System.out.println("persona1 = " + persona1.getNombre()); // persona1 = null
        persona1.setNombre("Ronald");
        System.out.println("persona1 = " + persona1.getNombre()); // persona1 = Ronald
        persona1.setNombre("Fernando");
        System.out.println("persona1 = " + persona1.getNombre()); // persona1 = Fernando
        /*
        Lo que esto demuestra es que al crear persona1 con final, lo que no se puede cambiar es la referencia
        de la posicion de memoria hacia donde apunta la variable. Pero si podemos cambiar el contenido de esa 
        posicion de memoria. 
        El contenido de la posicion de memoria paso de null -> Ronald -> Fernando.
        */
        
        
    }
    
}
