package com.co.jv.TiendaOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "api/")
public class ProductoController {
    @RequestMapping("/producto")
    public String verProducto(Model model){
        return "crear_producto";
    }

}
