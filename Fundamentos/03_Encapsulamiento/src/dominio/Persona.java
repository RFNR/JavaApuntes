
package dominio;

public class Persona {
    
    private String nombre; // private significa que la variable solo podra ser accedida desde la clase.
    private double sueldo;
    boolean eliminado; //   Cuando no ponemos ningun modificador de acceso como aca, la variable se puede acceder desde todo el paquete. Es decir, todas las clases del mismo paquete pueden acceder a esta propiedad.
    
    public Persona (String nombre, double sueldo, boolean eliminado){ // Definimos el constructor
        
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
        
    }
// Definimos gettes y setters para cada valor del constructor;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // Cuando es tipo pregunta se agrega el is. 
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    public String toString(){
        return "Persona { " +
                "nombre: " + nombre + ", " +
                "sueldo: " + sueldo + ", " +
                "eliminado: " + eliminado +       
                " }";
    }
    
    
    
}
