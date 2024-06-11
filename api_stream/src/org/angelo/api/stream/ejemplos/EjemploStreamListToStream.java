package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andres","Guzman"));
        lista.add(new Usuario("Joaquin","Rodriguez"));
        lista.add(new Usuario("Fausto","Listman"));
        lista.add(new Usuario("Claudio","Guitierrez"));
        lista.add(new Usuario("Nicolas","Guiz"));
        lista.add(new Usuario("Nicolas","Sanchez"));

        Stream<String> nombres = lista.stream()
                .map(u -> u.getNombre().toUpperCase().concat(" ")
                .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre -> {
                    if(nombre.contains("nicolas".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                } )
                .map(String::toLowerCase)
                .peek(System.out::println);
        System.out.println(nombres.count());
    }
}
