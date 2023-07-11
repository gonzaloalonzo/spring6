package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name="liquidacion")
public class Liquidacion {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_liquidacion;
    @Column
    LocalDate periodo;
    @Column
    int sueldo_imponible;
    @Column
    int sueldo_liquido;
    @Column
    int monto_inst_salud;
    @Column
    int monto_inst_previsional;
    @Column
    int total_descuento;
    @Column
    int total_haberes;
    @Column
    int anticipo;

    @ManyToOne(optional = false,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "kf_id_inst_previsional", nullable = false)
    private IntPrevision intPrevision;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_inst_salud", nullable = false)
    private IntSalud intSalud;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_trabajador", nullable = false)
    private Trabajador trabajador;
}
