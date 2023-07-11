package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="institucion_salud")
public class IntSalud {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_int_salud;
    @Column
    String descripcion;
    @Column
    Float porc_dcto;
}
