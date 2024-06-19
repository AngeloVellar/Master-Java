package org.angelo.optional.ejemplo;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {
        String nombre = "Andres";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola" + opt.get());
        }

        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println("Hola " + valor));

        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
    }


}
