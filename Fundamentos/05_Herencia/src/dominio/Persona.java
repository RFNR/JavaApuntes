
package dominio;

public class Persona {
    protected String nombre; // https://ricardogeek.com/el-modificador-de-acceso-protected-en-java/
    protected char genero;
    protected int edad;
    protected String direccion;
    
    /* 
    Se llama sobrecarga de constructores a tener varios contructores en una clase. Todos los constructores que no 
    tengan una llamada a un constructor con super(variable) o this(variable), tiene una llamada invisible como esta:
    super() que hace un llamado al constructor de la clase padre que es Object.
    */

    public Persona() { /* Constructor 1 */
        //super();
    }
    
    public Persona(String nombre){ /* Constructor 2 */
        //super();
        this.nombre = nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) { /* Constructor 3 */
        //super();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + "}" + "\n Direccion de memoria del objeto creado a partir de esta clase = " + super.toString();
    }
    
}
