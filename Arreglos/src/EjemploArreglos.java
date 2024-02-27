import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        numeros[0] = 55;
        numeros[1] = 45;
        numeros[2] = 32;
        numeros[3] = 11;

        Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];


        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        String productos[] = new String[7];
        productos[0] = "Pendrive64gb";
        productos[1] = "Pc";
        productos[2] = "Samsung";
        productos[3] = "Iphone";
        productos[4] = "Auto";
        productos[5] = "Corazon";
        productos[6] = "Teclado";


        Arrays.sort(productos);//Este es un metodo para ordenar los arreglos de forma alfabetica o numerica

        System.out.println("Productos[0] = "+ productos[0]);
        System.out.println("Productos[1] = "+ productos[1]);
        System.out.println("Productos[2] = "+ productos[2]);
        System.out.println("Productos[3] = "+ productos[3]);
        System.out.println("Productos[4] = "+ productos[4]);
        System.out.println("Productos[5] = "+ productos[5]);
        System.out.println("Productos[6] = "+ productos[6]);





    }
}
