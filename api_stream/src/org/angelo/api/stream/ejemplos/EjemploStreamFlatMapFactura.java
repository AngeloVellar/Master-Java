package org.angelo.api.stream.ejemplos;

import org.angelo.api.stream.ejemplos.models.Factura;
import org.angelo.api.stream.ejemplos.models.Usuario;
import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doue");
        Usuario u2 = new Usuario("Michael", "Sansz");

        u1.addtFactura(new Factura("compras tecnologías"));
        u1.addtFactura(new Factura("compra muebles"));
        u2.addtFactura(new Factura("bicicleta"));
        u2.addtFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios= Arrays.asList(u1,u2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(": cliente ")
                        .concat(f.getUsuario().toString())));

//        for(Usuario u: usuarios){
//            for(Factura f: u.getFacturas()){
//                System.out.println(f.getDescripcion());
//            }
//        }

    }
}
