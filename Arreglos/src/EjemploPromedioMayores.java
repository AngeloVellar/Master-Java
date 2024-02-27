import java.util.Random;

public class EjemploPromedioMayores {
    public static void main(String[] args) {
        //Creamos el objeto random para que nos genere numeros aleatorios
        Random random = new Random();
        //Creamos lel arreglo de 100 elementos o numeros de tipo entero
        int[] numeros = new int[100];

        //Creamos un ciclo foreach para completar el arreglo con numeros aleatorios del 1 al 100
        for(int i : numeros){
            int numeroAleatorio = random.nextInt(100); //Creamos una variable y le asignamos random de tipo dato entero, con un techo que no supere valores de 100
            //Le asignamos al arreglo la variable que contiene numeros aleatorios, de esta manera en cada iteracion se va ir completando con num aleatorios del 1-100
            numeros[i] = numeroAleatorio;
        }


        int suma = 0;   //Creamos la variable suma para ir almacenando los valor del arreglo y sumandolos
        for(int i : numeros){
            suma += numeros[i];
        }
        int promedio = (suma / 100); //Creamos variable promedio para almacenar el promedio  del arrreglo
        System.out.println("La suma total es = " + suma + " //// " + " Y el promedio es = " + promedio);
    }
}
