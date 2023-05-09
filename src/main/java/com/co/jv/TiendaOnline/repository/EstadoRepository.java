package com.co.jv.TiendaOnline.repository;

import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.mapper.EstadoMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends CrudRepository<Estado,Integer> {
}
