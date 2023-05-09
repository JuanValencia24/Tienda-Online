package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Estado> getAll() {
        List<Estado> lista = (List<Estado>) estadoRepository.findAll();
        if (lista.isEmpty()){
            return null;
        }
        return lista;
    }

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoRepository.save(estado);
    }
}
