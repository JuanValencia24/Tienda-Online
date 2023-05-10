package com.co.jv.TiendaOnline.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    @NotEmpty
    @NotBlank
    private String nombre;
    @NotEmpty
    @NotBlank
    private String descripcion;
    @NotNull
    @NotBlank
    private Double precio;
    @NotNull
    @NotBlank
    private Integer stock;
    private LocalDateTime fechaCreacion;
}
