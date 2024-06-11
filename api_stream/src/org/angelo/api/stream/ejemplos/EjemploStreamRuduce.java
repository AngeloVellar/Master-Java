package org.angelo.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamRuduce {
    public static void main(String[] args) {

          Stream<String> nombres = Stream.of("Pato V","Paco R","Pepe H","Pepe G","Luz R","Luz R",
                          "Luz R","Luz R","Luz R")
                  .distinct();
          String resultado = nombres.reduce("resultado concatenación", (a,b) -> a+ ", " + b);
        System.out.println( resultado);

    }
}