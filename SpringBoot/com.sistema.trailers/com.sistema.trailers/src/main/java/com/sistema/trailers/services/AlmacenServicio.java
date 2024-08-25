package com.sistema.trailers.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
//INTERFACE DE SERVICIO
public interface AlmacenServicio {
    public void iniciarAlmacenDeArchivos();
    public String almacenarArchivo(MultipartFile archivo);
    public Path cargarArchivo(String nombreArchivo);
    public Resource cargarComoRecurso(String nombreArchivo);
    public void eliminarArchivo(String nombreArchivo);

}
