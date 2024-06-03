package org.aguzman.genericsclass;

public class EjemploGenericos {

    public static<T> void imprimirCaminon(Camion<T>camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo: " +((Animal)a).getTipo());
            }
            else if(a instanceof  Automovil){
                System.out.println( "Marca del Automovil: " + ((Automovil)a).getMarca());
            }
            else if(a instanceof Maquinaria){
                System.out.println("Tipo de Maquinaria: " + ((Maquinaria)a).getTipo());
            }

        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Pelegrino","Caballo"));
        transporteCaballos.add(new Animal("grillo","Caballo"));
        transporteCaballos.add(new Animal("Tunquen","Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        imprimirCaminon(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));
        imprimirCaminon(transMaquinas);
        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Ford"));
        imprimirCaminon(transAuto);

    }
}
