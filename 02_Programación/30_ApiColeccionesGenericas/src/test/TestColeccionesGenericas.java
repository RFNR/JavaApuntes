package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); // El <> de ArrayList espara indicarle que se usa un tipo generico. Se puede poner <String> pero
        miLista.add("Lunes"); // segun el IDE es repetitivo, entoces se puede omitir.
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0); // Obtener elemento en la posicion 0. -> Observar que el metodo get devolvia un objeto pero como
//        se especifico que la lista tendria solo Strings, el metodo get devuleve un String y no hace falta hacer casting.
//        System.out.println("elemento = " + elemento);
        
        //imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        miMapa.put("valor3", "Carlos"); // Se reemplaza el valor de Rosario con el de Carlos. Porque las keys estan duplicadas.
        
        String elementoMapa = miMapa.get("valor3");
//        System.out.println("elementoMapa = " + elementoMapa);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion) {
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        for(String elemento: coleccion){
            System.out.println("elemento = " + elemento);
        }
    }

}
