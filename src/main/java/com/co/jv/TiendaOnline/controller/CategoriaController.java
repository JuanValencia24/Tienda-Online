package com.co.jv.TiendaOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class CategoriaController {
    @GetMapping("/registro/categoria")
    public String verCategoria(){
        return "crear_categoria";
    }



}
