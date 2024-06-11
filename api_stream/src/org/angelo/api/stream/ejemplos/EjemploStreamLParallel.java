package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamLParallel {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Joaquin","Rodriguez"));
        lista.add(new Usuario("Fausto","Listman"));
        lista.add(new Usuario("Claudio","Guitierrez"));
        lista.add(new Usuario("Nicolas","Guiz"));
        lista.add(new Usuario("Nicolas","Sanchez"));

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(System.out::println)
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if(nombre.contains("nicolas".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                } )
                .findAny().orElse("");
        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: " + (t2 - t1));
        System.out.println(resultado);
    }
}
