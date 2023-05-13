package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Producto;
import com.co.jv.TiendaOnline.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    @Transactional
    public void save(Producto producto) {
        productoRepository.save(producto);
    }
}
