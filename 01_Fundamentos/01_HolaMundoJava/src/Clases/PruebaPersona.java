// Para poder usar la clase Persona definida en Persona.java hacemos esto:

package Clases;

public class PruebaPersona {
    
    public static void main(String[] args) { 
        
        Persona persona_1 = new Persona();
        
        persona_1.nombre = "Ronald";
        persona_1.apellido = "Nogales";
        persona_1.desplegarInformacion();
        
        Persona persona_2 = new Persona();
        System.out.println(persona_2); // Clases.Persona@7ef20235 -> Referencia de memoria -> 7ef20235
        
        persona_2.desplegarInformacion(); // Nombre: null , Apellido = null -> valores por default
        persona_2.nombre = "Karla";
        persona_2.apellido = "Perez";
        persona_2.desplegarInformacion(); // Nombre: Karla , Apellido = Perez
    }
    
}
