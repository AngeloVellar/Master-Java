package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {

         Stream<Usuario> nombres = Stream
                 .of("Pato V","Paco R","Pepe H","Pepe G","Luz R")
                 .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                 .flatMap(u -> {
                     if(u.getNombre().equalsIgnoreCase("Pepe")){
                         return Stream.of(u);
                     }
                     return Stream.empty();
                 })
                 .peek(System.out::println);


        nombres.forEach(System.out::println);

    }
}