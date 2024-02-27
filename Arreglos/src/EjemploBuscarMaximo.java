public class EjemploBuscarMaximo {
    public static void main(String[] args) {

       int[] numeros = {55,44,4,8,24,52,88,28,67,2};

//        for(int i = 0; i < numeros.length; i++){
//            numeros[i] = i + 1;
//
//        }
        int max = numeros[0];
        int pocision = 1;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
                pocision += 1;
            }

        }
        System.out.println("Numero maximo = " + max + "Posicion = " + pocision);

    }
}
