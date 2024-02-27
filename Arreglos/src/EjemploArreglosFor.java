import javax.swing.*;
import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

//      String[] productos = new String[7];
        String[] productos = {"Pendrive64gb","Birra","Samsung","Iphone", "Auto","Corazon","Teclado"};
        int total = productos.length;
//        productos[0] = "Pendrive64gb";
//        productos[1] = "Birra";
//        productos[2] = "Samsung";
//        productos[3] = "Iphone";
//        productos[4] = "Auto";
//        productos[5] = "Corazon";
//        productos[6] = "Teclado";

        Arrays.sort(productos);

                                     System.out.println("==== Usando For ====");

        for(int i = 0; i < total; i++){
            System.out.println("Indice "  +  i + " : " + productos[i]);
        }

                                    System.out.println("==== Usando ForEach ====");

        for(String produ: productos){
            System.out.println("Produ = " + produ);
        }
                                    System.out.println("==== Usando For Inverso ====");
        for(int i = 0; i < total; i++){
            System.out.println("Para i = " + (total-1-i) + " valor: " + productos[total-1-i]);
        }
                                    System.out.println("==== Usando For Inverso 2 ====");
        for(int i = total - 1; i >= 0; i--){
            System.out.println("Para i = " + i + " Valor: "  + productos[i]);
        }



    }

}
