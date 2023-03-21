
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    
    public static void main(String[] args) {
        
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        indicarDiaSemana(Dias.DOMINGO);
        
        
        System.out.println( "Contienente 4: "+ Continentes.AMERICA);
        System.out.println("Paises en el continente 4: " + Continentes.AMERICA.getPaises());
        System.out.println("Poblacion en el continente 4: " + Continentes.AMERICA.getPoblacion());
    }
    
    private static void indicarDiaSemana(Dias dia){
        
        switch(dia){
            case LUNES:
                System.out.println("El dia es lunes.");
                break;
            case MARTES:
                System.out.println("El dia es martes.");
                break;
            case MIERCOLES:
                System.out.println("El dia es miercoles.");
                break;
            case JUEVES:
                System.out.println("El dia es jueves.");
                break;  
            case VIERNES:
                System.out.println("El dia es viernes.");
                break;
            case SABADO:             
            case DOMINGO:
                System.out.println("Es fin de semana.");
                break;
        }
    }
    
}
