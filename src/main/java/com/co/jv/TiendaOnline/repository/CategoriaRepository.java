package com.co.jv.TiendaOnline.repository;

import com.co.jv.TiendaOnline.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {
}
