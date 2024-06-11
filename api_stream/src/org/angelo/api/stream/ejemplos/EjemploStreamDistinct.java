package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

          Stream<String> nombres = Stream.of("Pato V","Paco R","Pepe H","Pepe G","Luz R","Luz R",
                          "Luz R","Luz R","Luz R")
                  .distinct();
          nombres.forEach(System.out::println);

    }
}