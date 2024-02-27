import java.util.Scanner;

public class EjemploArreglosNumMayor2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] numeros = new int[5];

        int max;
        for(max = 0; max < numeros.length; max++){
            numeros[max] = s.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            max = numeros[max];
        }
    }
}