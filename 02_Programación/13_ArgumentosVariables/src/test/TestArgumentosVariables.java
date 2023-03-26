
package test;

public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(3, 9, 5, 7);
        imprimirNumeros(5, 7, 2);
        variosParametros("Ronald", 1, 5, 1997);
        
    }
    
    private static void imprimirNumeros(int ...numeros){
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("elemento["+ i + "] = " + numeros[i]);
            }
    }
    
    private static void variosParametros(String nombre, int ...numeros){
        /* Cuando tenemos varios parametros, el argumento variable debe ser el ultimo en ingresarse. */
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);    
    } 
    
}
