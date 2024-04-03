package org.vellar.app.hogar;

import org.vellar.app.jardin.Perro;


import static org.vellar.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro = new Perro();
        String saludo = saludar();
    }
}
