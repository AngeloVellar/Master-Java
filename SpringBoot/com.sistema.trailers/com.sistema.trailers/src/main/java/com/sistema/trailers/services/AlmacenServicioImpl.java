package com.sistema.trailers.services;

import com.sistema.trailers.exceptions.AlmacenException;
import com.sistema.trailers.exceptions.FileNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service //Importante estar con la anotación service
public class AlmacenServicioImpl implements AlmacenServicio{

@Value("${storage.location}")
private String storageLocation; //Donde vamos almacenar nuestras fotos

    //Esta anotacion sirve para indicar que estes metodo se va ejecutar cada vez que haya una nuueva instancia de esta clase
    @PostConstruct
    @Override
    public void iniciarAlmacenDeArchivos() {
        try{
            Files.createDirectories(Paths.get(storageLocation)); //Obtenemos el nombre del directorio
        }catch (IOException exception){
            throw new AlmacenException("Error al inicializar la ubicación en el almacen de archivos");

        }
    }

    @Override
    public String almacenarArchivo(MultipartFile archivo) {
        String nombreArchivo = archivo.getOriginalFilename(); //obtenemos el archivo
        if (archivo.isEmpty()) {  // Si es vacio entonces..
            throw new AlmacenException("No se puede almacenar un archivo vacio");
        }
        try{
            InputStream inputStream = archivo.getInputStream();
            Files.copy(inputStream,Paths.get(storageLocation).resolve(nombreArchivo),StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException exception){
            throw new AlmacenException("Error al almacenar el archivo" + nombreArchivo,exception);
        }
        return nombreArchivo;
    }

    @Override
    public Path cargarArchivo(String nombreArchivo) {
        return Paths.get(storageLocation).resolve(nombreArchivo);
    }

    @Override
    public Resource cargarComoRecurso(String nombreArchivo) {
       try {
           Path archivo = cargarArchivo(nombreArchivo);
           Resource recurso = new UrlResource(archivo.toUri());
           if(recurso.exists() || recurso.isReadable()){
               return recurso;
           }else{
               throw new FileNotFoundException("No se pudo encontrar el archivo" + nombreArchivo );
           }
       }catch(MalformedURLException exception){
           throw new FileNotFoundException("No se pudo encontrar el archivo" + nombreArchivo,exception );

       }
    }

    @Override
    public void eliminarArchivo(String nombreArchivo) {
        Path archivo = cargarArchivo(nombreArchivo);
        try{
            FileSystemUtils.deleteRecursively(archivo);
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
}
