package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="institucion_prevision")
public class IntPrevision {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_inst_previsional;
    @Column
    String descripcion;
    @Column
    Float porc_dcto;

    @OneToMany(mappedBy = "insPre")
    List<Trabajador> listaTrabajadores;

    @OneToMany(mappedBy = "intPrevision")
    List<Liquidacion> listarLiquidaciones;
}
