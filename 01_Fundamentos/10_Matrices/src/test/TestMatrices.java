
package test;

import dominio.Persona;


public class TestMatrices {
    
    public static void main(String[] args) {
        
        // https://www.youtube.com/watch?v=B46f8nOnNbc
        
        int edades[][] = new int[3][2]; // Definicion de una matriz de 3 filas por 2 columnas.
        System.out.println("edades = " + edades); // edades = [[I@378bf509
        
        edades[0][0] = 5;
        edades[0][1] = 4;
        edades[1][0] = 6;
        edades[1][1] = 1;
        edades[2][0] = 3;
        edades[2][1] = 9;
        
        
        System.out.println("edades[2][0] -> " + edades[2][0]);
        System.out.println("Cantidad de filas = " + edades.length);
        System.out.println("Cantidad de columnas = " + edades[0].length); // Ponemos el 0 como podriamos haber puesto el 1 y 2.
        
        for(var fila = 0 ; edades.length > fila; fila++){    
            for(var colum = 0 ; edades[fila].length > colum; colum++){
                System.out.println("Edades["+fila+"]["+colum+"] = " + edades[fila][colum]);
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Banana", "Durazno"}, {"Manzana", "Pera"}}; // 3x2
        
        /* Forma 1:
        for(var fila = 0 ; frutas.length > fila; fila++){    
            for(var colum = 0 ; frutas[fila].length > colum; colum++){
                System.out.println("personas["+fila+"]["+colum+"] = " + frutas[fila][colum]);
            }
        }
        
        Forma 2:
        */
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Ronald");
        personas[0][1] = new Persona("Fernando");
        personas[0][2] = new Persona("Ramon");
        personas[1][0] = new Persona("Jaime");
        personas[1][1] = new Persona("Oscar");
        personas[1][2] = new Persona("Tomas");
        
        imprimir(personas);
        
        
    }
    
    /*
    RECORDAR -> LOS METODOS SIEMPRE FUERA DE MAIN. 
    */
    public static void imprimir(Object matriz[][]){
        for(var fila = 0 ; matriz.length > fila; fila++){    
            for(var colum = 0 ; matriz[fila].length > colum; colum++){
                    System.out.println("posicion["+fila+"]["+colum+"] = " + matriz[fila][colum]);
            }
        }
    }
}
