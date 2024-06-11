package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

         Stream<Usuario> nombres = Stream
                 .of("Pato V","Paco R","Pepe H","Pepe G","Luz R","Paco R","Paco R","Paco R")
                 .distinct()
                 .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));


         nombres.forEach(System.out::println);
    }
}