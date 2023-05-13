package com.co.jv.TiendaOnline.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

    private String nombre;

    private String descripcion;

    private Double precio;

    private Integer stock;

    private LocalDateTime fechaCreacion;

    private CategoriaDTO categoria;

    private EstadoDTO estado;

}
