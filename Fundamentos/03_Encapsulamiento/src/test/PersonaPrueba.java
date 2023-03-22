
package test;

import dominio.*; // Lee todas las clases de dominio pero solo carga las que vamos a usar por lo tanto, no hace mal uso de la memoria. 
                  // Si pusieramos dominio.Persona solo carga esa clase. 

public class PersonaPrueba {
    
    public static void main(String[] args) {
        
        // Usando get y set
        Persona persona1 = new Persona("Juan", 5000, false);
        System.out.println(persona1.getNombre()); // Juan
        persona1.setNombre("Juan Carlos");
        System.out.println(persona1.getNombre()); // Juan Carlos
        System.out.println(persona1.toString()); // Persona { nombre: Juan Carlos, sueldo: 5000.0, eliminado: false }
        System.out.println(persona1); // Si el metodo toString esta definido en la clase, solo colocando el nombre de la variable 
        // se llama a ese metodo automaticamente, entonces si toString esta definido 
        // System.out.println(personal.toString()); === System.out.println(personal);                                             
    }
    
}
