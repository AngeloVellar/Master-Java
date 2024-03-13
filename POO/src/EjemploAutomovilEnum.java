
public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        //         ---------------Primer Objeto------------------
        Automovil ford =  new Automovil("Ford","Mondeo");
        //ford.setFabricante("ford");
          //ford.setColor();
        ford.setTipo(TipoAutomovil.SEDAN);

        //         ---------------Segundo Objeto------------------
        Automovil dodge = new Automovil("dodge","Ram");
        dodge.setTipo(TipoAutomovil.SATION_WAGON);
        TipoAutomovil tipoDodge = dodge.getTipo();

        switch (tipoDodge){
            case CONVERTIBLE ->
                System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE ->
                System.out.println("Es un automovil pequeño de dos puertas tipicamente deportivo");
            case TRAFIC->
                System.out.println("Es un automovil utilitario de transporte");
            case HATCHBACK ->
                System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case SATION_WAGON ->
                System.out.println("Es un automovil mas  grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta: tipos){
            System.out.print(ta + " -> " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion() + ", " +
                    ta.getNumPuertas());
            System.out.println();
        }
    }
}
