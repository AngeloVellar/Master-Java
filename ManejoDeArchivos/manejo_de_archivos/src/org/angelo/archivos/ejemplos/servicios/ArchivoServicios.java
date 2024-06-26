package org.angelo.archivos.ejemplos.servicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicios {
    public void crearArchico(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
