package org.angelo.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamRuduceInt {
    public static void main(String[] args) {

          Stream<Integer> nombres = Stream.of(5,10,15,50,534)
                  .distinct();
          int resultado = nombres.reduce(0, Integer::sum);
        System.out.println( resultado);

    }
}