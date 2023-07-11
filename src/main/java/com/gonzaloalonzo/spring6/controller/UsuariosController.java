package com.gonzaloalonzo.spring6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
    @RequestMapping("/index")
    public String inicio(){
        return "index";
    }
}

