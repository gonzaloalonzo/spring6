package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name="liquidacion")
public class Liquidacion {
    @Id
    @Column(name="id_liquidacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idLiquidacion;
    @Column
    LocalDate periodo;
    @Column(name="sueldo_imponible")
    int sueldoImponible;
    @Column(name="sueldo_liquido")
    int sueldoLiquido;
    @Column(name="monto_inst_salud")
    int montoInstSalud;
    @Column(name="monto_inst_previsional")
    int montoInstPrevisional;
    @Column(name="total_descuento")
    int totalDescuento;
    @Column(name="total_haberes")
    int totalHaberes;
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
