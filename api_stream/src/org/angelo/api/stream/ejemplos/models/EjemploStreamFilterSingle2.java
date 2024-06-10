package org.angelo.api.stream.ejemplos.models;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario = Stream
                 .of("Pato V","Paco R","Pepe H","Pepe G","Luz R")
                 .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                 .filter(u -> u.getId().equals(3))
                .findFirst().get();

        System.out.println(usuario);


    }
}