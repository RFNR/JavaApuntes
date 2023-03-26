
package paquete1;

public class Clase1 { /* El modificador portected no se puede usar a nivel de clases. */
    
    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtected = "protected";
    
    public Clase1(){
        System.out.println("Constructor publico");
    }
    
    protected Clase1(String arg){
        System.out.println("Constructor protected -> " + arg);
        System.out.println("Se puede llamar a los " + this.atributoProtected + " desde la misma clase, paquete.");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
    
}
