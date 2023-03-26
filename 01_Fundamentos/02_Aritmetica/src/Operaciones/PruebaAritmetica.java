
package Operaciones;

public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        Aritmetica aritmetica1 = new Aritmetica(8, 3);
        aritmetica1.a = 3; // modificando los atributos de clase
        aritmetica1.b = 2;
        aritmetica1.sumar(); 
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("El retorno es de: " + resultado); // El retorno es de: 5
        
        aritmetica1.sumarConArgumentos(10,8);
        aritmetica1.sumar(); // resultado = 18
        
    }
    
    
}
