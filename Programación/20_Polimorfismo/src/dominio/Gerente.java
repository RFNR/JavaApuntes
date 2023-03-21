
package dominio;

public class Gerente extends Empleado{
    
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override /* El metodo que sobreescribe no puede ser mas restrictivo que el metodo del padre. 
    En este caso, el padre es public, entonces a este no le queda otra que ser public. */ 
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
    
    
}
