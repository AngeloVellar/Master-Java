package org.vellar.app.jardin;

import org.vellar.app.hogar.*;
import static org.vellar.app.hogar.Persona.saludar;
//import static org.vellar.app.hogar.Persona.GENERO_MASCULINO;
//import static org.vellar.app.hogar.Persona.GENERO_FEMENINO;
                //Manera ideal de importartodo
import static org.vellar.app.hogar.Persona.*;
import static org.vellar.app.hogar.ColorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {

       Persona p = new Persona();

        p.setNombre("Andres");
        p.setApellido("Guzman");
        p.setColorPelo(CASTANIO);
        System.out.println(p.getNombre());
//        Gato g = new Gato();
        Perro perro = new Perro();
        perro.nombre = "Ciro";
        perro.raza = "Border Collie";
        
        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMasculino = GENERO_MASCULINO;
        String generoFemenino = GENERO_FEMENINO;


    }
}
