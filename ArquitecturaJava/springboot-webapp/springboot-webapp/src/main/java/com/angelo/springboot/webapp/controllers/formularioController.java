package com.angelo.springboot.webapp.controllers;

import com.angelo.springboot.webapp.models.Libro;
import com.angelo.springboot.webapp.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class formularioController {

    @Autowired
    private LibroRepository libroRepository;


    @GetMapping("/formulario")
    public String formulario(Model model){
        return "formulario";
    }
    @PostMapping("/guardarForm")
    public String guardarForm(@ModelAttribute Libro libro){
        libroRepository.save(libro);
        return "redirect:/formulario";
    }

}
