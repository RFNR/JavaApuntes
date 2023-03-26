
package genericos;

// https://drive.google.com/file/d/1aW5SlqpXpnj8Djpuxav41mueAKVWdo3a/view?usp=sharing

public class ClaseGenerica<T> {
    
    private T objeto;
    
    public ClaseGenerica(T objecto){
        this.objeto = objecto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
