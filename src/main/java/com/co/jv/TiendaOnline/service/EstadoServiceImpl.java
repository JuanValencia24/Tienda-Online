package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Estado;
import com.co.jv.TiendaOnline.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    @Transactional(readOnly = true)
    public Estado buscarPorId(Integer id) {
        Optional<Estado> estadoOpcional =estadoRepository.findById(id);
        if (estadoOpcional.isPresent()){
            Estado estado = new Estado();
            estado = estadoOpcional.get();
            return estado;
        }
        return null;
    }
}
