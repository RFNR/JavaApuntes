package test;

import datos.PersonaDAO;
import dominio.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();

        // Insertando un nuevo objeto de tipo persona
        Persona persona2 = new Persona("Alberto Javier", "Rivarola Castillo", "albertorivarola54@gmail.com", "3514728954");
        personaDao.insertar(persona2);

        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
