public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil ford =  new Automovil();

        ford.fabricante = "ford";
        ford.cilindrada = 2.0;
        ford.color = "Verde";
        ford.modelo = "Focus";

        System.out.println(ford.verDetalle());
        System.out.println(ford.acelerar(3000));
        System.out.println(ford.frenar());
        System.out.println(ford.acelerarFrenar(5000));
        System.out.println("Kilometros por litro " + ford.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro " + ford.calcularConsumo(300,60));

    }
}
