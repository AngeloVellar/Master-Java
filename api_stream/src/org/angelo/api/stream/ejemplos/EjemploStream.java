package org.angelo.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

//        Stream<String> nombres = Stream.of("Pato","Paco","Pepe");
//        nombres.forEach(System.out::println);
//        String[] arr = {"Pato","Paco","Pepa","Pepe"};
//        Stream<String> nombres = Arrays.stream(arr);
//        nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepe");
        lista.add("Pepa");
        lista.stream().forEach(System.out::println);

    }
}
