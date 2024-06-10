package org.angelo.api.stream.ejemplos.models;

import java.util.stream.Stream;

public class EjemploStreamFilterSingleAnyMatch {
    public static void main(String[] args) {

        boolean existe = Stream
                 .of("Pato V","Paco R","Pepe H","Pepe G","Luz R")
                 .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                 .anyMatch(u -> u.getId().equals(3));


        System.out.println(existe);


    }
}