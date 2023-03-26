
package Operaciones; // https://www.manualweb.net/java/tipos-datos-primitivos-java/ -> Ver parte de valores por defecto

public class Aritmetica {
   // Atributos de clase 
    int a;
    int b;
    
    //constructor 
    public Aritmetica(int a, int b){ // var no esta permitido en los argumentos
        this.a = a;
        this.b = b;
        System.out.println("Se ejecuto el constructor.");
    }
    
    //Metodos
    
    public void sumar(){
        System.out.println("a = " + this.a + "  b = " + this.b);
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    
    public int sumarConRetorno(){
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){
        // Modificamos los atributos de la clase
        a = arg1; 
        this.b = arg2;
        // Podemos usar las dos formas para modificar los atributos
        return a + b;
        
        //  this se usa igual que en js
        //  Dentro de un metodo static no podemos usar this. 
    }
    
}

