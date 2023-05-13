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
public class CategoriaDTO {

    private Integer id;
    @NotBlank(message = "el campo nombre no debe estar vacio")
    private String nombre;

    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

}
