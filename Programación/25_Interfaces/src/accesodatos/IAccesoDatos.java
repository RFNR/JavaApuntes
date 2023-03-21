package accesodatos;

public interface IAccesoDatos {
    /*
    Todas las variables definidas en una interface son constantes, con todo lo que eso implica.
    Todos los metodos definidos en una interface son abstractos.
    */
    
    int MAX_REGISTRO = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
