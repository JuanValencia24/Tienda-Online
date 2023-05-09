package com.co.jv.TiendaOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EstadoController {
    @GetMapping("/registro/estado")
    public String viewRegistroEstado(){
        return "crear_estado";
    }
}
