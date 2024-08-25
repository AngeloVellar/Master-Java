package org.aguzman.patrones.singleton;

public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia; //Creamos un objeto null

    private ConexionBdSingleton(){ //Creamos un constructor private
        System.out.println("Conectandose algún motor de base de datos");

    }
    public static ConexionBdSingleton getInstancia(){ //Creamos un metodo que retorna el objeto null ya con una instancia de la clase
        if(instancia == null){
            instancia = new ConexionBdSingleton();
        }
        return instancia;
    }
}

