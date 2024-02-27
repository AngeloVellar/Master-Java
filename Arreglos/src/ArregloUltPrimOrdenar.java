import java.util.Arrays;
import java.util.Scanner;

public class ArregloUltPrimOrdenar {

                    // Ordenar el arreglo de la forma último primero
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];

        //Ciclo for para ingresar los números y guardarlos en arreglo
        System.out.println("Ingrese 10 números: ");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = s.nextInt();


        }

        int aux = 0;
        for(int i = 0; i < numeros.length; i++){
            numeros[aux++] =
            numeros[aux++] = numeros.length -1 -i;
        }
        System.out.println(numeros[aux]);
    }
}
