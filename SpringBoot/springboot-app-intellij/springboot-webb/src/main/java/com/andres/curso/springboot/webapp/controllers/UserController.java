package com.andres.curso.springboot.webapp.controllers;

import com.andres.curso.springboot.webapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Importante para indicar que es un controlador
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Andres","Guzman");
        model.addAttribute("title","Hola Mundo Spring Boot");
        model.addAttribute("user",user);
        return "details";
    }
}
