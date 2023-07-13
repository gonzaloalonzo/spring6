package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="institucion_prevision")
public class IntPrevision {
    @Id
    @Column(name="id_inst_previsional")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idInstPrevisional;
    @Column
    String descripcion;
    @Column(name="porc_dcto")
    Float porcDcto;

    @OneToMany(mappedBy = "insPre")
    List<Trabajador> listaTrabajadores;

    @OneToMany(mappedBy = "intPrevision")
    List<Liquidacion> listarLiquidaciones;
}
