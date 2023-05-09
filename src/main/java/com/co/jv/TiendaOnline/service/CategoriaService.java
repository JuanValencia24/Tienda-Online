package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Categoria;

import java.util.List;

public interface CategoriaService {

    public void save(Categoria categoria);

     List<Categoria> getAll();
}
