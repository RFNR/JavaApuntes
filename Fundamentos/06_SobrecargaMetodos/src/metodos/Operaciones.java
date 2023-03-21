
package metodos;

public class Operaciones {
    
    /*
    La sobrecarga de métodos es la creación de varios métodos con el mismo nombre pero con diferente 
    lista de tipos de parámetros. Java utiliza el número y tipo de parámetros para seleccionar cuál 
    definición de método ejecutar. Java diferencia los métodos sobrecargados con base en el número y tipo 
    de parámetros o argumentos que tiene el método y no por el tipo que devuelve.
    */
    
    public static int sumar(int a, int b){
        System.out.println("Se llamo el metodo con los argumentos de tipo int. -> Este texto se imprime al declarar la variable.");
        return a + b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("Se llamo el metodo con los argumentos de tipo double. -> Este texto se imprime al declarar la variable.");
        return a + b;
    }
    
    /* Se declaran estos metodos de tipo public porque se llamaran desde otro páquete. */
    
}
