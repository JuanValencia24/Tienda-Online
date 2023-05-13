package com.co.jv.TiendaOnline.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTOPlantilla {

    @NotBlank(message = "El campo Nombre no debe estar vacio")
    private String nombre;

    @NotBlank(message = "El campo Descripcion no debe estar vacio")
    private String descripcion;

    @DecimalMin(value = "0.0",message = "Ingrese un valor mayor a O.0")
    private Double precio;


    @Min(message = "Ingrese un valor mayor a cero",value = 0)
    private Integer stock;

    private LocalDateTime fechaCreacion;

    @NotNull
    private Integer estado;
    @NotNull
    private Integer categoria;

}
