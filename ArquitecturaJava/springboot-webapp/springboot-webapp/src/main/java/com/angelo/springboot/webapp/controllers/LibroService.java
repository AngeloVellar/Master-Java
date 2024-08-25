package com.angelo.springboot.webapp.controllers;

import com.angelo.springboot.webapp.models.Libro;
import com.angelo.springboot.webapp.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public void guardar(Libro libro) {
        libroRepository.save(libro);
    }
}
