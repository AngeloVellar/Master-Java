package org.angelo.appfacturas;

import org.angelo.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("555-5");
        cliente.setNombre("Andres");


        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura:");
        Factura factura = new Factura(s.nextLine(),cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto n°: " + producto.getCodigo() +  ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
