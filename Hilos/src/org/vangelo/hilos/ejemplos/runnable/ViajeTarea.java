package org.vangelo.hilos.ejemplos.runnable;

public class ViajeTarea implements Runnable {
    private String nombre;


    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public void run() {
       for(int i = 0; i < 10; i++){
           System.out.println(i + " - " + nombre);

       }
    }
}
