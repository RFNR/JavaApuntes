
package test;

import dominio.Gerente;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Ronald", 1200, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}
