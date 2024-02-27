import java.util.Arrays;
public class EjemploArreglosForMetodoBurbuja {
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
    public static void main(String[] args) {

        String[] productos = {"Pendrive64gb","Birra","Samsung","Iphone", "Auto","Corazon","Teclado"};
        int total = productos.length;

        for(int i = 0; i < total; i++){
            for(int j = 0; j < total; j++){
                if(productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
            }
        }


        //Arrays.sort(productos);
        //ForaLaInversa(productos);

        for(int i = 0; i < total; i++){
            System.out.println("Indice "  +  i + " : " + productos[i]);
        }
    }

}
