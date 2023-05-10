package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.dto.CategoriaDTO;
import com.co.jv.TiendaOnline.mapper.CategoriaMapper;
import com.co.jv.TiendaOnline.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private CategoriaMapper mapper;

    @GetMapping("/registro/categoria")
    public String verCategoria(CategoriaDTO categoriaDTO){
        return "crear_categoria";
    }

    @PostMapping(value = "/registro/categoria/post")
    public String guardarCategoria(@Valid CategoriaDTO categoriaDTO, BindingResult errores){

        if (errores.hasErrors()){
            return "crear_categoria";
        }
        categoriaDTO.setFechaCreacion(LocalDateTime.now());
        categoriaService.save(mapper.categoriaDTOToCategoria(categoriaDTO));
        return "crear_producto";
    }



}
