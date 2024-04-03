package org.vellar.app.jardin;

import org.vellar.app.hogar.Persona;

public class Perro {
    protected String nombre;
    protected String raza;

     String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
