package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

         Stream<Usuario> nombres = Stream
                 .of("Pato","Paco","Pepe")
                 .map(nombre -> new Usuario(nombre,null))
                 .peek(System.out::println)
                 .map(usuario -> {
                     String nombre = usuario.getNombre().toLowerCase();
                     usuario.setNombre(nombre);
                     return usuario;
                 });

         List<Usuario> lista = nombres.collect(Collectors.toList());
         lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);

    }
}