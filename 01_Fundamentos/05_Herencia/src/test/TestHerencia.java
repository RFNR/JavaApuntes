
package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Ronald", 1200);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(), true, "Ronald", 'M', 25, "Constancio Vigil 1684");
        System.out.println("cliente1 = " + cliente1);
        
        
        
    }
    
    
}
