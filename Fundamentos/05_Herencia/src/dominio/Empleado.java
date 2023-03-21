
package dominio;

/* En java una clase extiende de Object por default si no se especifica. */
public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado() {
        //super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    

    public Empleado(String nombre, double sueldo) {
        // super(nombre); -> se manda a llamar al constructor 2 del padre. 
        this(); /* -> se manda a llamar al constructor vacio de esta clase. Podemos especificar a que 
        constructor llamar dependiendo de la cantidad y el tipo de argumentos que recibe el this(). En este 
        caso solo tenemos un constructor vacio que no recibe argumentos.  
        Solo se puede realizar una llamada a un constructor por constructor. Por lo tanto, no podemos 
        usar super() y this() al mismo tiempo. */
        this.nombre = nombre; /* Podemos acceder a la variable nombre del constructor 2 del padre de esta forma porque
        estan declaradas con protected. */
        this.sueldo = sueldo;        
        /* Otra forma de realizar lo de arriba seria: 
        super(nombre);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
        */
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    /*
    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}';
    } */ 
    
    @Override // Este metodo hace lo mismo que toString solo que es mas eficiente y mas rapido que concatenar 
    // de manera tradicional con el +. Lo insertamos con insertCode y seleccionamos la casilla -> Use StringBuilder
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", nombre=").append(nombre);
        sb.append(", ").append(super.toString()); // Podemos llamar metodos o variables 
        // de la clase padre asi. -> super.Metodo() o super.variable
        sb.append('}');
        return sb.toString();
    }

    
    
    

    
    

            
            
    
    
}
