import java.util.Arrays;
import java.util.Random;

public class EjemploDeterminarOrdenamiento {
            // Guardar 20 números. Determinar si está ordenado.
    public static void main(String[] args) {
        Random random = new Random();
        int numeros[] = new int[20];


        for(int i = 0; i < numeros.length; i++ ){
            int randoms = random.nextInt(100);
            numeros[i] = randoms;
            System.out.println(numeros[i]);
        }

        //Arrays.sort(numeros);
       boolean ban = true;
        int max = numeros[0];
        for(int i = 0; i < numeros.length; i++ ){
            if(numeros[i] >= max){
                max = numeros[i];
                System.out.println(numeros[i]);
            }

        }
    }
}
