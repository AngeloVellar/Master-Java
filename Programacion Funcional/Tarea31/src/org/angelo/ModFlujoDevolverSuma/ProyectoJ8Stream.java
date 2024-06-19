package org.angelo.ModFlujoDevolverSuma;

import java.util.Arrays;

public class ProyectoJ8Stream {
    public static void main(String[] args) {

        int arreglo[] = new int[100];

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);
        System.out.println(total);
    }
}
