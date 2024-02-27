import java.util.Arrays;

public class EjemploArreglosForMutable {
    public static void main(String[] args) {


        //Arreglo String de tipo Object de 7 elementos
        String[] productos = {"Pendrive64gb","Birra","Samsung","Iphone", "Auto","Corazon","Teclado"};

        int total = productos.length;  //Atributo lenght nos sirve para obtener la longitud del arreglo(Array de 7EJ)


        Arrays.sort(productos);//Método que nos ordena alfabeticamente o numericamente los elementos(1-10, A-Z)

        ForaLaInversa(productos);   //LLamamos al método for que contiene el código para invertir el arreglo


        for(int i = 0; i < total; i++){
            System.out.println("Indice "  +  i + " : " + productos[i]);
        }
    }

    //Creamos el método ForaLaInversa para guardar el for con el arreglo
    public static void ForaLaInversa(String[] arreglo){
        System.out.println("==== Usando For ====");
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }
}
