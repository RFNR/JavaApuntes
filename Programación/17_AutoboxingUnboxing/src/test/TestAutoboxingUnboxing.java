
package test;

public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        /*
        Clases envolventes de tipos primitivos:
        int -> Integer
        long -> Long
        float -> Float
        double -> Double
        boolean -> Boolean
        byter -> Byte
        char -> Character
        short -> Short
        */
        
        Integer entero = 10; // Autoboxing -> Objecto
        System.out.println("entero = " + entero);
        System.out.println("entero a double = " + entero.doubleValue());
        
        int entero2 = entero; // Unboxing -> Primitivo
        
        // https://quejava.com/java-autoboxing-y-unboxing-con-ejemplos/
        
        
        
    }
    
}
