package com.co.jv.TiendaOnline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detalle_orden")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cantidad;
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "orden_idorden")
    private Orden orden;

    @ManyToOne
    @JoinColumn(name = "producto_idproducto")
    private Producto producto;
}
