package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

         Stream<Usuario> nombres = Stream
                 .of("Pato V","Paco R","Pepe H","Pepe G","Luz R")
                 .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                 .filter(u -> u.getNombre().equals("Pepe"))
                 .peek(System.out::println);

         Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());
        //nombres.forEach(System.out::println);

    }
}