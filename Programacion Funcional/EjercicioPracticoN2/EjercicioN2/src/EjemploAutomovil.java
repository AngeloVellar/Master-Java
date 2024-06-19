import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploAutomovil {
    public static void main(String[] args) {
        List<Automovil> listaAutomoviles = new ArrayList<>();
        listaAutomoviles.add(new Automovil("Focus",2.0,"APW502","Ford",234.656));
        listaAutomoviles.add(new Automovil("Cronos",1.6,"FGK492","Fiat",139.905));
        listaAutomoviles.add(new Automovil("Golf",2.0,"APW690","Wolkswagen",221.594));
        listaAutomoviles.add(new Automovil("Onix",1.4,"FGF932","Chevrolet",339.135));
        listaAutomoviles.add(new Automovil("SanderoRS",2.3,"F31493","Renault",60.394));
        listaAutomoviles.add(new Automovil("Polo",1.6,"ARG430","Wolkswagen",45.000));

        //Listar los km de los autos existentes y multiplicarlos x 2
        List<Double> kmx2 = listaAutomoviles.stream().map(k -> k.getKilometros() * 2).toList();
        //Listar los kilometros de todos los autos
        List<Double> kms  = listaAutomoviles.stream().map(Automovil::getKilometros).toList();
        System.out.println("Km´s de todos los automoviles = " + kms);
        //Listar vehiculos de marca wolkswagen
        List<Automovil> wolks = listaAutomoviles.stream()
                .filter(wk -> wk.getMarca().startsWith("Wolkswagen"))
                .toList();
        System.out.println(wolks);
        //Listar vehiculos por kms de menor a mayor
        System.out.println("Automoviles ordenados por cantidad de kilometros"); //De menor a mayor
        listaAutomoviles.stream()
                .sorted(Comparator.comparing(Automovil::getKilometros))
                .forEach(System.out::println);

        int suma = listaAutomoviles.stream()
                .mapToInt(sum -> (int) sum.getKilometros())
                .sum();
        System.out.println(suma);






    }
}
