package com.co.jv.TiendaOnline.repository;


import com.co.jv.TiendaOnline.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto,Integer> {
}
