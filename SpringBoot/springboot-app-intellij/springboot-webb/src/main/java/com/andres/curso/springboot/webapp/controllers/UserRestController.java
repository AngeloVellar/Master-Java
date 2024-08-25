package com.andres.curso.springboot.webapp.controllers;

import com.andres.curso.springboot.webapp.models.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController//Importante para indicar que es un controlador
@RequestMapping("/api") //Modificamos la ruta agregandole /api/details. Se le llama ruta base
public class UserRestController {
    //JSON
    @GetMapping("/details")
    public Map<String, Object> details(){
        User user = new User("Andres","Guzman");
        Map<String, Object> body = new HashMap<>();

        body.put("title","Hola Mundo Spring Boot");
        body.put("user",user);
        return body;
    }
}
