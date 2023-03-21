package accesodatos;

public class ImplementacionMySql implements IAccesoDatos { // Implementando una interface. 
    /* Recordar que si no vamos a usar los metodos, tenemos que poner la clase como abstract. Por lo tanto reescribiremos los metodos
    en una clase hija. 
    */

    @Override // Reescribimos los metodos.
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override // Reescribimos los metodos.
    public void listar() {
        System.out.println("Listar desde Mysql");

    }

    @Override // Reescribimos los metodos.
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");

    }

    @Override // Reescribimos los metodos.
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");

    }

}
