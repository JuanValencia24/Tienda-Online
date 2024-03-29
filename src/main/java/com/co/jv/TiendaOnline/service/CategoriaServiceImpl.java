package com.co.jv.TiendaOnline.service;

import com.co.jv.TiendaOnline.entity.Categoria;
import com.co.jv.TiendaOnline.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getAll() {
       List<Categoria> lista = (List<Categoria>) categoriaRepository.findAll();
        if (lista.isEmpty()){
            return null;
        }
        return lista;

    }

    @Override
    @Transactional(readOnly = true)
    public Categoria buscarPorId(Integer id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if (categoriaOptional.isPresent()){
            Categoria categoria = new Categoria();
            categoria= categoriaOptional.get();
            return categoria;
        }
        return null;
    }

}
