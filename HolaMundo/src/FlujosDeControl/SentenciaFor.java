package FlujosDeControl;
public class SentenciaFor {
    public static void main(String[] args) {

       for(int i = 0; i <= 5; i++){
           System.out.println("i = " + i);
       }

       for(int i = 1, j = 10; i < j; i++, j-- ){
           System.out.println(i + "-" + j);
       }
                  //For para encontrar numeros impares
       for(int i = 1; i <= 30; i++){
           if(i % 2== 0){
              continue;
           }
           System.out.println("Números Impares:" + i);
       }
            //For para encontrar numeros pares
        for(int i = 1; i <= 30; i++){
            if(i % 2== 0){
                System.out.println("Números Pares:" + i);
                }
        }

    }
}
