package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="empleador")
public class Empleador {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_empleador;
    @Column
    int run;
    @Column
    String nombre;
    @Column
    String apellido_1;
    @Column
    String apellido_2;
    @Column
    String direccion;
    @Column
    String email;
    @Column
    Long telefono;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_usuario",nullable = false)
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name="Empl_trab",
                joinColumns = @JoinColumn(name = "fk_id_empleador", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "fk_id_trabajador",nullable = false))
            private List<Trabajador>listaTrabajador;

}
