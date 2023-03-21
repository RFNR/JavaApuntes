package test;

import accesodatos.*;

public class TestInterfaces {
    
    public static void main(String[] args) {
        
        IAccesoDatos datos = new ImplementacionMySql(); // Creamos una variable de tipo IAccesoDatos y 
        // le asignamos una clase que implemente esa interfaz. Observar que esto es casting. 
        
        // Por casting.. 
        datos.listar(); // Listar desde Mysql
        
        // imprimir(datos); // Listar desde Mysql
        
        datos = new ImplementacionOracle(); // -> Esto es  IAccesoDatos datos = new ImplementacionOracle();
        datos.listar(); // Listar desde Oracle
        // imprimir(datos); // Listar desde Oracle
    }
    
    /* Podriamos usar este metodo para que quede mas claro. 
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
    */ 
}
