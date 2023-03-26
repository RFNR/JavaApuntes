package com.mypageweb.peliculas.datos;

import com.mypageweb.peliculas.excepciones.LecturaDatosEx;
import com.mypageweb.peliculas.excepciones.AccesoDatosEx;
import com.mypageweb.peliculas.excepciones.EscrituraDatosEx;
import java.util.List;
import com.mypageweb.peliculas.dominio.Pelicula;

public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
