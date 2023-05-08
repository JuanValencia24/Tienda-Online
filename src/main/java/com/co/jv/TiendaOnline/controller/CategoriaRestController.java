package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.dto.CategoriaDTO;
import com.co.jv.TiendaOnline.entity.Categoria;
import com.co.jv.TiendaOnline.mapper.CategoriaMapper;
import com.co.jv.TiendaOnline.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class CategoriaRestController {

    @Autowired
    private CategoriaMapper mapper;
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping(value = "/registro/categoria/post")
    public String guardarCategoria(@RequestBody @Valid CategoriaDTO categoriaDTO, Errors errores){
        categoriaDTO.setFechaCreacion(LocalDateTime.now());

        System.out.println("Hora:"+categoriaDTO.getFechaCreacion()+" Nombre "+ categoriaDTO.getNombre());
        System.out.println(mapper.categoriaDTOToCategoria(categoriaDTO));
        // categoriaService.save();

        if (errores.hasErrors()){
            return "FAIL";
        }
        return "OK";
    }

}
