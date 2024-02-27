import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class OrdenDecreciente {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int v[] = new int[20];

        for(int i = 0; i < v.length;i++){
            v[i] = + 8 * i / 4;
            //System.out.println(v[i]);
        }

        int aux;
        for(int i = 0; i < v.length - 1; i++){
                if(v[i] < v[i + 1]){
                    aux = v[i +1];
                    v[i + 1] = v[i];
                    v[i] = aux;
                };

                System.out.println(v[i]);
            }
    }
}
