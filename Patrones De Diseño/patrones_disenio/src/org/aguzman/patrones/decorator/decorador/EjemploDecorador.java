package org.aguzman.patrones.decorator.decorador;

import org.aguzman.patrones.decorator.Formateable;
import org.aguzman.patrones.decorator.Texto;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Andres");
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        System.out.println(subrayar.darFormato());
    }
}
