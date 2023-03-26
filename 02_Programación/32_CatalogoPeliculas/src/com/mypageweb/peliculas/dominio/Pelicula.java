
// Se aplica el concepto de JavaBeans
// Como esta clase no estara en un servidor no es necesario aplicar la interfaz Serializable

package com.mypageweb.peliculas.dominio;

public class Pelicula {
    
    private String nombre;

    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
}
