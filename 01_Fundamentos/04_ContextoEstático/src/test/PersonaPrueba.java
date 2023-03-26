
package test;

import dominio.Persona;

public class PersonaPrueba {
    
    private int contador;
       
    public static void main(String[] args) { // https://es.quora.com/Qu%C3%A9-significa-cada-t%C3%A9rmino-de-public-static-void-main-String-args#:~:text=Es%20una%20funci%C3%B3n%20principal%20en,como%20una%20aplicaci%C3%B3n%20de%20consola.
    
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1); // persona1 = Persona{idPersona=1, nombre=Juan}
        Persona persona2 = new Persona("Karla"); 
        System.out.println("persona2 = " + persona2); // persona2 = Persona{idPersona=2, nombre=Karla}
        
        imprimir(persona1); // Solo se pueden llamar metodos y variables estaticos dentro de un metodo estatico. -> 
        // persona = Persona{idPersona = 1, nombre = Juan}
        imprimir(persona2); // persona = Persona{idPersona = 2, nombre = Karla}
        // Dentro de metodo estatico no se puede usar this.
        // this.contador = 10; -> error
        // this.contador -> No se puede llamar desde  aqui porque no es un metodo estatico.
    }
    
    public static void imprimir(Persona persona){ 
        System.out.println("persona = " + persona);
    }
    
    //  Este metodo es a modo de ejemplo. No podemos hacer nada con el dentro de esta aplicacion por lo menos por ahora.
    public int getContador() { // Este es un metodo dinamico por lo que puede llamar metodos u variables estaticos o no, sin ninguna restriccion.
        imprimir(new Persona("Ronald"));
        return this.contador;
    }
    
}
