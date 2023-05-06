package com.co.jv.TiendaOnline.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String barrio;
    @Column(name = "tipo_calle")
    private String tipoCalle;
    @Column(name = "celular_contacto")
    private String celular;
    @Column(name = "informacion_ad")
    private String informcionAd;

    @OneToOne
    @JoinColumn(name = "ciudad_has_departamento_id_ciudad_departamento")
    private CiudadDepartamento ciudadDepartamento;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
