public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        //         ---------------Primer Objeto------------------
        Automovil ford =  new Automovil("ford","Mondeo");
        //ford.setFabricante("ford");
          //ford.setColor();
        ford.setTipo(TipoAutomovil.SEDAN);

        //         ---------------Segundo Objeto------------------
        Automovil dodge = new Automovil("dodge","Ram");
        dodge.setTipo(TipoAutomovil.SATION_WAGON);

        //         ---------------Tercer Objeto------------------
        Automovil ford2 =  new Automovil("ford","focus");
        ford2.setTipo(TipoAutomovil.SEDAN);
        Automovil.setCapacidadDelTanqueEstatico(45);
        System.out.println("Km por litro = " + Automovil.calcularConsumoStatico(300,60));

        Automovil.setColorPatente(Color.BLANCO);
        System.out.println("Automovil Color Patente = " + Automovil.getColorPatente());
        System.out.println(ford.verDetalle());
        System.out.println(dodge.verDetalle());
        System.out.println(ford2.verDetalle());

        //                                  ---CONSTANTE FINAL---
        System.out.println("Velocdiad Maxima en Carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocdiad Maxima en Ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}
