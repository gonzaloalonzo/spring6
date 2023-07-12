package com.gonzaloalonzo.spring6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/registro")
    public String registro(){
        return "registro";
    }

    @GetMapping("/inicioSesion")
    public String inicioSesion(){
        return "inicioSesion";
    }
}

