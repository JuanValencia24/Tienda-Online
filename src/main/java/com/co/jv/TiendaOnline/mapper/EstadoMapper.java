package com.co.jv.TiendaOnline.mapper;

import com.co.jv.TiendaOnline.dto.EstadoDTO;
import com.co.jv.TiendaOnline.entity.Estado;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EstadoMapper {
    @Mapping(target ="id",ignore = true)
    Estado estadoDTOToEstado(EstadoDTO estadoDTO);

    EstadoDTO estadoToEstadoDTO(Estado estado);
}
