package com.co.jv.TiendaOnline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "carrito")
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarrito")
    private Integer id;

    private Integer catidad;

    @ManyToOne
    @JoinColumn(name = "producto_idproducto")
    private Producto producto;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;


}
