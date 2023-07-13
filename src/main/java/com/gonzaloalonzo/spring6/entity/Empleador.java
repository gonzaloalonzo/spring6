package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="empleador")
public class Empleador {
    @Id
    @Column(name="id_empleador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idEmpleador;
    @Column
    int run;
    @Column
    String nombre;
    @Column(name="apellido_1")
    String apellido1;
    @Column(name="apellido_2")
    String apellido2;
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
