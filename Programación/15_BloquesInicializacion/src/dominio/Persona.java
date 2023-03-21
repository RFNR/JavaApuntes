
package dominio;

public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    {
        System.out.println("Esto se ejecuta antes del constructor. Se llama contexto dinamico o contexto no estatico.");
        this.idPersona = contadorPersonas++;
        /* Este bloque se ejecuta cada vez que se cree un nuevo objeto con esta clase. */
    }
    
    static{ /* Este bloque de codigo se ejecuta antes del constructor y de cualquier bloque de codigo no estatico. */
        System.out.println("Ejecucion de bloque estatico.");
        ++Persona.contadorPersonas;  
        /* Este bloque se ejecuta solo una vez y es a la hora de crear el primer objeto con esta clase. */
    }
    
    public Persona(){
        System.out.println("Ejecucion del contructor. ");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
