
package dominio;

public class Empleado extends Prueba{
    /*
    Si una clase tiene el modificador de acceso "final" como Persona.java, no puede tener
    subclases. Por ejemplo si extendemos esta clase a -> public class Empleado extends Persona{},
    da error. La clase Persona no puede tener clases hijas o subclases, como le quieras llamar. 
    Es decir, Persona no puede tener descendencia.
    */
    
    /*
    public void imprimir(){
        System.out.println("Metodo imprimir desde clase hija.");  --> Da error. No se puede modificar el metodo.
    }
    */
    
    @Override /* Override nos indica que hay un metodo en la clase padre que tiene el mismo nombre y lo estamos 
    sobreescribiendo. El Override lo agregamos nosotros para una lectura del codigo mas entendible. */
    public void copiar(){
        System.out.println("Se copio 546 hojas.");
    }
}
