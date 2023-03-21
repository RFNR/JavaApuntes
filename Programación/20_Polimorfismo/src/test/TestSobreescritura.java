
package test;

import dominio.Empleado;
import dominio.Gerente;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Ronald",5000);
        // System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Roman", 12000, "Contabilidad");
        // System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(empleado);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
