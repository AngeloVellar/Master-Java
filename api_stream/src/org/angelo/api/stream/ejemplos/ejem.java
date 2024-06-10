package org.angelo.api.stream.ejemplos;

import java.util.List;

public class ejem {
    public static void main(String[] args) {
        // Declarativo
        List<Integer> numeros = List.of(11, 8, 9, 15, 39, 1, 4, 83);

        int contador = 0;

        for (int numero: numeros) {
            if(numero > 10){

                contador ++;
            }
        }
        System.out.println(contador);

    }
}
