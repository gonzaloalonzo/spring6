package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="trabajador")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    int id_trabajador;
    @Column
    int run;
    @Column
    String nombre;
    @Column
    String apellido_1;
    @Column
    String apellido_2;
    @Column
    String email;
    @Column
    Long telefono;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "fk_id_inst_previsional", nullable = false)
    private IntPrevision insPre;

    @ManyToMany(mappedBy = "listaTrabajador")
    List<Empleador> listaEmpleadores;

    @OneToMany(mappedBy = "trabajador")
    List<Liquidacion> listaLiquidaciones;
}
