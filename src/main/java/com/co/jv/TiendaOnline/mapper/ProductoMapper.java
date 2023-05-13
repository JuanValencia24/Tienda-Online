package com.co.jv.TiendaOnline.mapper;

import com.co.jv.TiendaOnline.dto.ProductoDTO;
import com.co.jv.TiendaOnline.dto.ProductoDTOPlantilla;
import com.co.jv.TiendaOnline.entity.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    @Mapping(target ="id",ignore = true)
    Producto productoDTOToProducto(ProductoDTO productoDTO);

    ProductoDTO productoToProductoDTO(Producto producto);

}
