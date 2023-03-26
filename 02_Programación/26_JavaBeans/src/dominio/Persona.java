package dominio;

import java.io.Serializable;

/*
Para que una clase se considere JavaBean se necesitan estos requisitos minimos: 
    - Que la clase implemente la interface Serializable.
    - Todos los atributos deben ser privados.
    - Debe tener un constructor vacio y publico.
    - Tener un metodos get y set publicos para cada atributo.
*/

public class Persona implements Serializable{
    private String nombre;
    private String apellido;
    
    public Persona(){
    }
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
