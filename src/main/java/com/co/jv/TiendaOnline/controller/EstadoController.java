package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.dto.EstadoDTO;
import com.co.jv.TiendaOnline.mapper.EstadoMapper;
import com.co.jv.TiendaOnline.service.EstadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class EstadoController {

    @Autowired
    private EstadoMapper mapper;

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/registro/estado")
    public String viewRegistroEstado(EstadoDTO estadoDTO){
        return "crear_estado";
    }

    @PostMapping("/registro/estado/post")
    public String guardarEstado(@Valid EstadoDTO estadoDTO, BindingResult errores) {
        estadoService.save(mapper.estadoDTOToEstado(estadoDTO));
        if (errores.hasErrors()) {
            return "crear_estado";
        }
        return "crear_producto";
    }

    }
