package org.angelo.ModFlujoDevolverSuma;

import java.util.Arrays;
import java.util.function.Function;
public class NumMayorStream {
    //Obtener el numero mayor en un arreglo con progrmaacion funcional lambda y api stream
    public static void main(String[] args) {

        Function<Integer[],Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac,e) -> ac > e? ac : e);

        int resultado = max.apply(new Integer[]{4,56,23,567,31,88,14,12,36});
        System.out.println("El número mayor es:" + resultado);

        // CON (e -> .... ) QUE VOY HACER?


        Arrays.asList(4,6,3,6,36,3).forEach(System.out::println));

        ArrayList<>
    }


}
