package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Estado;

import java.util.List;

public interface EstadoService {

    List<Estado> getAll();

    void save(Estado estado);
}
