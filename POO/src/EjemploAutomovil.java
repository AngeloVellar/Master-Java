import com.sun.security.jgss.GSSUtil;

public class EjemploAutomovil {
    public static void main(String[] args) {

        //         ---------------Primer Objeto------------------
        Automovil ford =  new Automovil("ford",Color.ROJO,"Fiesta",2.0,50);
//        ford.setFabricante("ford");
//         ford.setModelo( "Focus");


        //         ---------------Segundo Objeto------------------
        Automovil dodge = new Automovil("dodge",Color.NEGRO,"Ram",4.0,60);


        //         ---------------Tercer Objeto------------------
        Automovil ford2 =  new Automovil("ford","focus");

        //Automovil auto = new Automovil();
        System.out.println("Son iguales?" + (ford == ford));
        System.out.println("Son iguales con equals? " + (ford.equals(ford2)));
        System.out.println(ford.verDetalle());
        //System.out.println(auto.equals(ford));


        System.out.println(ford.acelerar(3000));
        System.out.println(ford.frenar());
        System.out.println(ford.acelerarFrenar(5000));
        System.out.println("Kilometros por litro " + ford.calcularConsumo(300,0.75f));
        System.out.println("Kilometros por litro " + ford.calcularConsumo(300,60));


        System.out.println(ford);
        System.out.println(dodge);
    }
}
