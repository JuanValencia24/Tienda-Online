package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.entity.Categoria;
import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.service.CategoriaService;
import com.co.jv.TiendaOnline.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(path = "api/")
public class ProductoController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private EstadoService estadoService;

    @RequestMapping("/registro/producto")
    public String verProducto(Model model){
        List<Categoria> categorias = categoriaService.getAll();
        List<Estado> estados = estadoService.getAll();
        model.addAttribute("estados", estados);
        model.addAttribute("categorias",categorias);
        return "crear_producto";
    }

}
