
package ar.com.mypageweb.ventas;

public class Orden {
    
    
    private int idOrden;
    private Producto productos[]; // Esto sera un arreglo de objetos Producto.
    private static int contadorOrdenes;
    private int contadorProductos;
    public final static int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes; 
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Creamos un areglo de longitud 10.
    }
    
    public void agregarProducto(Producto obj){
        if(contadorProductos <= 10){
            this.productos[this.contadorProductos++] = obj;
        }
        else{
            System.out.println("Se ha superado el maximo de productos.");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden = " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden = $" + totalOrden);
        System.out.println("Productos de la orden = ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", productos=").append(productos);
        sb.append(", contadorProductos=").append(contadorProductos);
        sb.append('}');
        return sb.toString();
    }
    
}
