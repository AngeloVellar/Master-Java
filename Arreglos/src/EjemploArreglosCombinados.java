public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        //creamos un arreglo de 3 elementos
        int[] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Creamos un for para poblar el arreglo "a"
       for(int i = 0; i < a.length; i++){
           a[i] = i + 1;
       }
        //Creamos un for para poblar el arreglo "b"
       for(int i = 0; i < b.length; i++){
            b[i] = (i+1)*5;
       }

       //Creamos un for para poblar el arreglo "c", con una variable aux contadora que va ir incrementando los
        //indices mientras se colocan los números del arreglo a y b en c
       int aux = 0;
       for(int i = 0; i < 10; i++){
           c[aux++] = a[i];
           c[aux++] = b[i];
       }
       //Creamos un for para recorrer ya el arreglo c y mostrarlo en pantalla
       for(int i = 0; i < c.length; i++){
           System.out.println(i + ": " + c[i]);
       }
    }
}
