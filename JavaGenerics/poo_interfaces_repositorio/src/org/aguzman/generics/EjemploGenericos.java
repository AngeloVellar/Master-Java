package org.aguzman.generics;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres ", "Guzman"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo =  {(new Cliente("Andres ", "Guzman")),
                    (new Cliente("Mica", "Sosa"))};

        Integer[] enterosArreglo = {3,4,6,7,8};

        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        List<Cliente> clientes2 = fromArrayToList(clientesArreglo);

        enterosLista.forEach(System.out::println);
        clientes2.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andrés", "Pepe","Juana","Ignacio","Roberto"},enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumsList = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Juan","Altamira")});;

        imprimirClientes(clientes);
        imprimirClientes(clientes2);
        imprimirClientes(clientePremiumsList);
    }
    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }

    public static <T extends Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }
    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);

    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[]x){
        for(G elemento: x){
            System.out.println(elemento);
        }
        return Arrays.asList(c);

    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

}
