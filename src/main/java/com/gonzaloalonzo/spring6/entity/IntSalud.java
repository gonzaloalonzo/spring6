package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="institucion_salud")
public class IntSalud {
    @Id
    @Column(name="id_int_salud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idIntSalud;
    @Column
    String descripcion;
    @Column(name="porc_dcto")
    Float porcDcto;
}
