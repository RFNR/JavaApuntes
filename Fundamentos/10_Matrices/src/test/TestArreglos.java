
package test;

public class TestArreglos {
    
    public static void main(String[] args) {
        
        int edades[] = new int[3]; // Definicion de un arreglo de longitud 3.
        System.out.println("edades = " + edades); // edades = [I@378bf509 -> Muestra la posicion de memoria.
        /* El valor por defecto en cada posicion de un arreglo de tipo int es 0. */
        System.out.println("edades[0] = " + edades[0]); // edades[0] = 0
        System.out.println("edades[1] = " + edades[1]); // edades[1] = 0
        System.out.println("edades[2] = " + edades[2]); // edades[2] = 0
        
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]); // edades[0] = 10
        edades[1] = 20;
        System.out.println("edades[1] = " + edades[1]); // edades[1] = 20
        edades[2] = 30;
        System.out.println("edades[2] = " + edades[2]); // edades[2] = 30
        
        // Tambien se puede definir un arreglo de esta forma ->  String autos[] = {"Ranger", "Corona", "Amarok"};
        
        /* edades[3] = 5; -> Marca error cuando se ejecuta porque el error no es a nivel de compilacion 
        sino en tiempo de ejecucion. */
        
        for(var i = 0 ; edades.length > i; i++){
            System.out.println("edades["+i+"] = " + edades[i]);
        }
        
        
    }
    
}
