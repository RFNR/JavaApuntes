
package ar.com.mypageweb.ventas.test;

import ar.com.mypageweb.ventas.*;

public class VentasTest {
    
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Camisa", 50.0);
        System.out.println("producto1 = " + producto1);
        
        Producto producto2 = new Producto("Pantalon", 100.0);
        System.out.println("producto2 = " + producto2);
        
        Orden orden1 = new Orden();
        System.out.println("orden1 = " + orden1);
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.mostrarOrden();

        
    }
}
