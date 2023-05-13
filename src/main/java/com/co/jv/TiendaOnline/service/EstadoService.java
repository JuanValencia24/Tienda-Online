package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Categoria;
import com.co.jv.TiendaOnline.entity.Estado;

import java.util.List;
import java.util.Optional;

public interface EstadoService {

    List<Estado> getAll();

    void save(Estado estado);

    Estado buscarPorId(Integer id);
}
