package org.angelo.proyecMantUsuarios;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ejemploUsuarios {
    public static void main(String[] args) {

        Map<String,Integer> operaciones = new HashMap<>(); //Diccionario clave valor
        operaciones.put("Actualizar",1); operaciones.put("Eliminar",2);operaciones.put("Agregar",3);
        operaciones.put("Listar",4); operaciones.put("Salir", 5);

        Object[] opcArreglo = operaciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                        "Seleccione una Operación",
                        "Mantenedor de Usuarios",
                        JOptionPane.INFORMATION_MESSAGE,null,opcArreglo,opcArreglo[0]);



    }
}
