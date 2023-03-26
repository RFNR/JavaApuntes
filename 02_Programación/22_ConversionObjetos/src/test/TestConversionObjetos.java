
package test;

import dominio.TipoEscritura;
import dominio.Empleado;
import dominio.Escritor;

public class TestConversionObjetos {
    
    public static void main(String[] args) {   
        
        Empleado empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado); // El metodo toString de Escritor se llama al toString de empleado. 
        
        System.out.println(empleado.obtenerDetalles());
        /* Como la clase padre como la hija tienen el metodo en comun obtenerDetales, el compilador no puede saber a cual de los dos se
        refiere, por lo tanto, apunta a la clase hija. Eso sucede si y solo si, tanto padre como hija tiene un metodo en comun y ocurre 
        lo visto en este ejemplo. 
        System.out.println(empleado.getTipoEscritura()); -> Error, empleado no tiene el metodo getTipoEscritura(). Y si lo tuviera,
        se mostraria el de la hija. */
        
        //downcasting
        
        Escritor escritor = (Escritor) empleado;
        System.out.println("escritor = " + escritor.getTipoEscritura());
        //((Escritor)empleado).getTipoEscritura();
        
        //Upcasting
        
        Empleado empleado2 = escritor; 
        System.out.println(empleado2.obtenerDetalles());
    }
}
