package com.co.jv.TiendaOnline.mapper;

import com.co.jv.TiendaOnline.dto.CategoriaDTO;
import com.co.jv.TiendaOnline.entity.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {

    @Mapping(target ="id",ignore = true)
    Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO);


    CategoriaDTO categoriaToCategoriaDTO(Categoria categoria);

}
