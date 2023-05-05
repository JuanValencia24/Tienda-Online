package com.co.jv.TiendaOnline.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproducto")
    private Integer id;
    @NotNull
    private String nombre;
    @NotNull
    private String descripcion;
    @NotNull
    private Double precio;
    @NotNull
    private Integer stock;
    @NotNull
    private LocalDateTime fecha;

    @OneToOne
    @JoinColumn(name = "estado_idestado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "categoria_idcategoria")
    private Categoria categoria;

}
