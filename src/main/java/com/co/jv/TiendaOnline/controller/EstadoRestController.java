package com.co.jv.TiendaOnline.controller;

import com.co.jv.TiendaOnline.dto.EstadoDTO;
import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.mapper.EstadoMapper;
import com.co.jv.TiendaOnline.service.EstadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EstadoRestController {

    @Autowired
    private EstadoMapper mapper;

    @Autowired
    private EstadoService estadoService;

    @PostMapping("/registro/estado/post")
    public String guardarEstado(@RequestBody @Valid EstadoDTO estadoDTO, Errors errores){
        System.out.println("dto: "+estadoDTO.getEstado());
        estadoService.save(mapper.estadoDTOToEstado(estadoDTO));
       if (errores.hasErrors()){
           return "FAIL";
       }
        return "OK";
    }

}
