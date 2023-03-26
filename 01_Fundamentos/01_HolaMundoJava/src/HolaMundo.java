
//import java.util.Scanner; //Importar la clase Scanner cuando la solicite abajo. Esta en un paquete llamado java.util

// Mi clase en Java
public class HolaMundo { // La clase se accede de manera pública.

    public static void main(String args[]) { // El método main nos permite ejecutar nuestro programa.
        
        /*
        
        System.out.println("Hola Mundo desde Java"); // Imprime Hola Mundo desde Java

        int miVariableEntera = 45; // Definicion de la variable
        System.out.println(miVariableEntera); // 45 

        miVariableEntera = 5;
        // Atajo: sout + tab ->  System.out.println
        System.out.println(miVariableEntera); // 5

        // Atajo: ctrl + space -> te da sugerencias para no escribir el nombre de una variable completa.
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena); //Saludos

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena); // Adios

        // Si usamos var, Java en automatico va a inferir en el tipo de dato segun el valor que se le asigne 
        // a la variable. Esto se introdujo a partir de la version 10.
        var miVariabeEntera2 = 31;
        System.out.println(miVariabeEntera2);

        var miVariableCadena2 = "- Ola k ase?"; // var solo se puede usar dentro de un metodo. En este caso, main.
        System.out.println(miVariableCadena2 + "\n- Nada y vo k ase?");

        // Al declarar variables usar esta sintaxis. No se puede empezar el nombre de una variable con numeros y algunos 
        // caracteres ilegales. Se recomienda no usar letras con tilde.
        var miVariable = 1; //   Estas variables tiran una advertencia porque no estan siendo llamadas.
        var _miVariable = 2;
        var $miVariable = 3;

        //----------------------------------------------------------------------------------------------------------
        // Consejo: para corregir espacios, saltos de linea, etc. Click derecho + format
        var usuario = "Ronald";
        var apellido = "Nogales";
        var union = usuario + " " + apellido;

        System.out.println(union);

        var i = 4;
        var j = 6;

        System.out.println(i + j); // 10
        System.out.println(i + j + usuario); // 10Ronald
        System.out.println(usuario + i + j); // Ronald46
        System.out.println(usuario + (i + j)); // Ronald10

        //----------------------------------------------------------------------------------------------------------
        var nombre = "Ronald";
        System.out.println("Nueva linea: \n" + nombre); // Salto de linea
        System.out.println("Tabulador:\t" + nombre); // Tabulador:	Ronald
        System.out.println("Retroceso: \b" + nombre); // Retroceso:Ronald
        System.out.println("Retroceso: \b\b\b" + nombre); // RetrocesRonald
        System.out.println("Comilla simple: \'" + nombre + "\'"); // Comilla simple: 'Ronald' -> No es necesario usar \. 
        // Solo en algunos casos que veremos mas adelante pero en este ejemplo realmente no hace falta. Los podemos quitar 
        // y funcionaria igual.
        System.out.println("Comilla doble: \"" + nombre + "\""); // Comilla doble: "Ronald"

        //----------------------------------------------------------------------------------------------------------
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in); // Importar la clase Scanner arriba. 
        // Leer esto -> https://www.geeksforgeeks.org/difference-between-next-and-nextline-methods-in-java/
        var nombre = consola.nextLine(); // El metodo nextLine() Hace que la consola se pare hasta que el usuario 
        // escriba algo y de enter.
        System.out.println("Nombre: " + nombre);
        System.out.println(((Object) nombre).getClass().getSimpleName());
        System.out.println("Escribe tu titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Título: " + titulo );
        System.out.println(((Object) titulo).getClass().getSimpleName());
        System.out.println("Escribe tu edad: ");
        var edad = consola.nextFloat();
        System.out.println("Edad: " + edad);
        System.out.println(((Object) edad).getClass().getSimpleName()); // Float

        //----------------------------------------------------------------------------------------------------------
        // Tipos primitivos de enteros: byte, short, int, long.
        
        byte numeroByte = 10;
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE); // -128
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE); // 127
        // Si definimos algun valor fuera del limite, nos tira error.

        short numeroShort = 10;
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE); // -32768
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE); // 32767

        int numeroInt = 1565;
        System.out.println("Valor minimo de int: " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE); // 2147483647

        long numeroLong = 5156;
        System.out.println("Valor minimo de long: " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE); // 9223372036854775807

        // Tipos primitivos de tipo flotante: float y double.
        float numeroFloat = 10.0F; // Si ponemos 10.0 por defecto esto es de tipo double, por eso especificamos 
        // la F para que lo pase a float.
        System.out.println(numeroFloat); // 10.0
        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Float.MAX_VALUE); // 3.4028235E38

        double numeroDouble = 10.0; // 
        System.out.println(numeroDouble); // 10.0
        System.out.println(Double.MIN_VALUE); // 4.9E-324
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308

        // Tipo primitivo char
        char unCaracter = 'a'; // VAN EN COMILLAS SIMPLES SIEMPRE!!!
        System.out.println(unCaracter);

        char unCaracter2 = '\u0021';
        System.out.println(unCaracter2); // Con codigo unicode -> !

        char unCaracter3 = 33;
        System.out.println(unCaracter3); // ! -> En la tabla unicode, el valor decimal 33 es un !.

        char unCaracter4 = '!';
        System.out.println(unCaracter4); // !

        //----------------------------------------------------------------------------------------------------------
        // Con var
        var unCaracter = 'a';
        System.out.println(unCaracter); // a -> char

        var unCaracter2 = '\u0021';
        System.out.println(unCaracter2); // ! -> char

        var unCaracter3 = 33;
        System.out.println(unCaracter3); // 33 -> int

        var unCaracter4 = '!';
        System.out.println(unCaracter4); // ! -> char

        int unCaracter5 = '!';
        System.out.println(unCaracter5); // 33 -> int
        int unCaracter5 = 'a';
        System.out.println(unCaracter5); // 97 -> int

        boolean varBoolean = true;
        boolean varBoolean2 = false;

        System.out.println(varBoolean);
        System.out.println(varBoolean2);

        //----------------------------------------------------------------------------------------------------------
        // if, else como en js pero solo con ==. Y no llevan ; al final.
        var edad = 65;
        var esAdulto = edad >= 18; // true 

        //----------------------------------------------------------------------------------------------------------
        // Conversion de tipos
        // https://www.youtube.com/watch?v=-U0PDV4LhhM
        // string a entero
        var edad = Integer.parseInt("20"); // Convierte un string a un entero
        System.out.println(edad + 10); // 30
        // string a double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println(valorPI + 2); // 5.1416

        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        var mensaje = consola.nextLine(); // Esto guarda un string. 
        edad = Integer.parseInt(mensaje);
        System.out.println("Tu edad es de : " + edad);

        // Otra forma de saber el tipo de una variable es a traves de esto: 
        System.out.println(((Object) mensaje).getClass().getSimpleName()); // String
        System.out.println(((Object) edad).getClass().getSimpleName()); // Integer

        var edadTexto = String.valueOf(edad); // Convierte un entero a string
        System.out.println(edadTexto); // 25
        System.out.println(((Object) edadTexto).getClass().getSimpleName()); // String

        //----------------------------------------------------------------------------------------------------------
        var caracter = "Hola".charAt(3);
        System.out.println(caracter); // a 
        System.out.println(((Object) caracter).getClass().getSimpleName()); // Character 
        System.out.println("Proporciona un caracter: ");
        var consola = new Scanner(System.in);
        caracter = consola.nextLine().charAt(0); 
        System.out.println(caracter); // No importa cuantos caracteres ponga siempre se muestra el de la posicion 0.

        //----------------------------------------------------------------------------------------------------------
        int a = 3, b = 2;  // Esta forma de definir variables solo se puede hacer si especificamos el tipo de variable. 
        // Y que ambas variables sean de ese tipo. No se puede hacer con var.
        var resultado = a + b;
        System.out.println(resultado); // 5
        resultado = a - b;
        System.out.println(resultado); // 1
        resultado = a * b;
        System.out.println(resultado); // 6
        resultado = a / b;
        System.out.println(resultado); // 1
        float c = 5.0F;
        c = c / b;
        System.out.println(c); // 2.5
        resultado = 10 % 4;
        System.out.println(resultado); // 2

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        //----------------------------------------------------------------------------------------------------------
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println(c); // 6

        a += 9;
        System.out.println(a); // 12
        a -= 2;
        System.out.println(a); // 10
        a *= 2;
        System.out.println(a); // 20
        a /= 5;
        System.out.println(a); // 4
        a %= 2;
        System.out.println(a); // 0

        //----------------------------------------------------------------------------------------------------------
        var a = 3;
        var b = -a;
        System.out.println(a); // 3
        System.out.println(b); // -3

        var c = !true;
        System.out.println(c); // false

        a++;
        System.out.println(a); // 4
        System.out.println(a++); // 4
        ++a;
        System.out.println(a); // 6
        System.out.println(++a); // 7

        // Funciona igual para --a o a--;
        //----------------------------------------------------------------------------------------------------------
        var a = 3;
        var b = 2;
        var c = (a == b); // false 
        var d = a != b; // true

        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2; // Devuelve falso pero se esta comparando la posicion de memoria en las que se 
        // encuentran cada cadena. 
        var posicion = cadena1;
        var memoria = cadena1 == posicion; // true

        // Para comparar contenido: 
        var f = cadena1.equals(cadena2); // false
        var cadena3 = "Hola";
        var g = cadena3.equals(cadena1); // true

        var h = a >= b; // true
        var i = a < b; // false

        //----------------------------------------------------------------------------------------------------------
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var resultado = a >= 0 && a <= 10; // true
        var resultado2 = a > 12 || a <= 10; // true 

        //----------------------------------------------------------------------------------------------------------
        var resultado = 3 > 2 ? "Es verdadero" : "Es falso"; // Es verdadero

        //----------------------------------------------------------------------------------------------------------
        // https://es.stackoverflow.com/questions/57225/cu%C3%A1l-es-la-precedencia-de-operadores-en-java
       
        //----------------------------------------------------------------------------------------------------------
        // Sentencia switch, if else -> Igual que en JS pero simepre usar comillas dobles.
        var navegador = "Firefox";
        switch(navegador){
            case "Edge": System.out.println("Tienes Edge");
                break;
            case "Crome":
            case "Firefox":
            case "Safari":
            case "Opera":
                System.out.println("Esta bien, soportamos estos navegadores tambien.");
                break;
            default:
                System.out.println("¡Esperamos que esta página se vea bien!");
        } // Esta bien, soportamos estos navegadores tambien.
       
        //----------------------------------------------------------------------------------------------------------
        // Bucles -> Igual que en js -> https://www.manualweb.net/java/sentencias-bucle-java/ 
        // Break y continue -> igual que en js
        // Break y continue con etiquetas:
        
        descansar:
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 9; j++) {               
                if (i % 2 == 0){
                System.out.println("Dia "+ i + ": Descansando");
                continue descansar;
                }                
                System.out.println("Dia "+ i + ": Trabajando " + j + " horas");
            }
        }
        
        System.out.println("Salimos del bucle...");
        // Probar lo que imprime esto y leer esto:
        // https://programandoointentandolo.com/2014/05/break-y-continue-en-java.html 
        // https://rekkeb.wordpress.com/2009/04/11/curiosidades-java-break-y-continue/#:~:text=Las%20palabras%20reservadas%20break%20y,a%20la%20siguiente%20(continue).
        //----------------------------------------------------------------------------------------------------------
        // Clases -> Sigue en el paquete clases, Persona.java
        
        */
  
    }
}
    
    
        
        
        
        


