package com.co.jv.TiendaOnline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orden")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idorden")
    private Integer id;

    private Double total;
    private LocalDateTime fecha;

    @OneToOne
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;

    @OneToOne
    @JoinColumn(name = "metodo_pago_idmetodo_pago")
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;



}
