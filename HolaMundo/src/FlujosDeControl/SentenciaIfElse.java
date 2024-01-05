package FlujosDeControl;

public class SentenciaIfElse {

    public static void main(String[] args) {
        float promedio = 10.0f;

        if(promedio >=  6.5){
            System.out.println("Felicidades muy buen promedio");}
        //Cuando tenemos una sola linea en la sentencia no es necesario poner llaves({}) mas de 1 si ya es necesario
        else if(promedio >= 6.0){
            System.out.println("Muy buen promedio!");}
        else if(promedio >= 5.5){
            System.out.println(" buen promedio!");}
        else if(promedio >= 5.0){
            System.out.println("Regular, necesitas mas esfuerzo!");}
        else if(promedio >= 4.0){
            System.out.println("Insuficente, ncesitas estudiar mas!");}
        else{
            System.out.println("Reprobado");}
        System.out.println("Tu promedio es = " + promedio);
    }
}
