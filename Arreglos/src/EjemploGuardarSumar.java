import java.util.Scanner;

public class EjemploGuardarSumar {
    public static void main(String[] args) {

        int numeros [] = new int [10];
        

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        int aux = 0;
        for(int j = 0; j < numeros.length; j++){
            aux += numeros[j] ;

        }
        System.out.println("Suma de los vectores: " + aux);

    }
}
