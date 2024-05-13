package ar.vellar.poointerfaces.imprenta;

import ar.vellar.poointerfaces.imprenta.modelo.Curriculum;
import ar.vellar.poointerfaces.imprenta.modelo.Hoja;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("John Doe|")
    }
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
