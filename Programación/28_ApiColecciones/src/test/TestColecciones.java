package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        
        List miLista = new ArrayList(); // La clase ArrayList implementa la interfaz List. 
        miLista.add("Lunes"); // En este caso agregamos elementos de tipo String, pero se pueden agregar cualquier elemento de tipo de objeto. -> Object
        miLista.add("Martes"); // El metodo add se usa para agregar elementos a la lista. La lista crece dinamicamente, por lo que no hace falta
        miLista.add("Miercoles");// especificar un tamaño. Es como un array dinamico. La lista guarda el orden en que se van agregando 
        miLista.add("Jueves");// los elementos. 
        miLista.add("Viernes");// El metodo add esta en la clase padre Collection
        
//        for(Object elemento: miLista){
//            System.out.println("elemento = " + elemento);
//        }
//        System.out.println("--------------------------------------------------------------------");
//        
        // Otra manera seria usar esto: 
        /*
        miLista.forEach(elemento -> { // no hace falta poner var, int, object, etc en elemento porque esta forma hace que se aplique automaticamente.
            System.out.println("elemtento = " + elemento);
        });
        
        */
        imprimir(miLista);
        System.out.println("*********************************************************************");
        
        Set miSet = new HashSet(); // Set es otra coleccion pero que no almacena un orden.
        miSet.add("Lunes"); // El metodo add esta en la clase padre Collection
        miSet.add("Martes"); // Set es mas rapido para guardar elementos ya que se salta la parte del orden de elementos.
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
//        for(Object elemento: miSet){
//            System.out.println("elemento = " + elemento);
//        }
//        System.out.println("--------------------------------------------------------------------");
        
        imprimir(miSet);
        
        /*
        Las interfaces List y Set heredan de una interfaz llamada collection. Esta interfaz tiene el metodo add. Por eso 
        comparten metodos.
        */
        System.out.println("*********************************************************************");
        
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
//        Map es como un objeto en JS, se agregan keys con un value a traves del metodo put. 
        
        String elemento = (String) miMapa.get("valor2"); // Se accede al map a traves de la ky y se guarda en la variable elemento.
        // El metodo miMapa.get("valor2") devuelve un Object, entonces para convetirlo a string lo casteamos como se muestra.
        System.out.println("elemento = " + elemento);
        System.out.println("--------------------------------------------------------------------");
        
//        System.out.println("keyset = " + miMapa.keySet()); // Imprime un Set de las keys. 
//        System.out.println("values = " + miMapa.values()); // Imprime un Set de los valores de las keys.
        // Estos dos ultimos metodos iteran todas las key y values e imprimen cada uno.
        
        imprimir(miMapa.keySet());  
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}
