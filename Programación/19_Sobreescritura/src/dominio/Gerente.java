
package dominio;

public class Gerente extends Empleado{
    
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
        /* Esto es lo mismo que lo de arriba: 
        return "nombre: " + nombre + ", sueldo: "+ sueldo + ", departamento: " + this.departamento;
        */
    }
    
    
}
