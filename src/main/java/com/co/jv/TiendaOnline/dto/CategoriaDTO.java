package com.co.jv.TiendaOnline.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO {
    @NotNull
    private String nombre;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

}
