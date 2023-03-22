
package dominio;

public class Persona {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas; // https://www.youtube.com/watch?v=xH_649W9nU0 https://www.techiedelight.com/es/difference-between-static-and-non-static-variables-java/   
    
    public Persona(String nombre){
        
        this.nombre = nombre;
        Persona.contadorPersonas++; // Asi se recomienda acceder a los atributos estaticos de nuestra clase. Tambien se puede 
        // con this.contadorPersonas pero no se recomienda.
        this.idPersona = Persona.contadorPersonas;
            
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override // Indica que sobreescribirmos el metodo toString. -> https://spa.myservername.com/java-override-method-overriding#:~:text=La%20anotaci%C3%B3n%20%40override%20se%20usa,m%C3%A9todo%20anotado%20no%20se%20anula.
    // El @Override se agrega aca porque la clase Persona extiende de la clase Object que tiene ese metodo ya escrito.  Esto lo podemos ver
    // si apretamos control y nos situamos arriba de la clase Persona.(4ta linea del codigo).
    // https://es.stackoverflow.com/questions/156432/para-que-sirve-la-l%C3%ADnea-override-en-java
    public String toString() {
        return "Persona {" + "idPersona = " + idPersona + ", nombre = " + nombre + '}';
    }
    
    
    
}
