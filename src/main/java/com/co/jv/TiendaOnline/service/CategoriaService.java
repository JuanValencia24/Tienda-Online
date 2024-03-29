package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {

    public void save(Categoria categoria);

     List<Categoria> getAll();

     Categoria buscarPorId(Integer id);
}
