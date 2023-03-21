
package test;

import dominio.Empleado;
import dominio.Gerente;

public class TestInstanceOf {
    
    public static void main(String[] args) {
        /*
        https://www.youtube.com/watch?v=EUDphVnGcoI
        https://www.youtube.com/watch?v=o07qfYLvTB0
        */
        
        Empleado empleado = new Empleado("Ronald",5000);
        determinarTipo(empleado); // Es de tipo empleado -> empleado = Ronald -> Es de tipo Object
        
        System.out.println("empleado = " + empleado); // empleado = Empleado{nombre=Ronald, sueldo=5000.0}
        
        empleado = new Gerente("Roman", 12000, "Contabilidad");
        System.out.println("empleado = " + empleado); // empleado = Gerente{departamento=Contabilidad}
        
        determinarTipo(empleado); // Es de tipo gerente -> Contabilidad -> Es de tipo empleado -> empleado = Roman -> Es de tipo Object
        
        // https://ifgeekthen.nttdata.com/es/que-es-y-como-utilizar-instanceof-en-java
    }
    
    public static void determinarTipo(Empleado empleado){ // Se hace Upcasting de manera implicita aca. Siempre y cuando
        // el objeto sea una instancia de una clase que hereda de Empleado.
        
        if(empleado instanceof Gerente){ 
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println(gerente.getDepartamento());
            // En este archivo, solo se puede hacer Upcasting y Downcasting aca. 
            // Esta es la recomendacion del IDE: ((Gerente) empleado).getDepartamento(); 
        }
        
        if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
            System.out.println("empleado = " + empleado.getNombre());
        }
        
        if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }      
        // Siempre empezar los if con las clases mas especificas hasta las menos especificas. 
        
    }
}
