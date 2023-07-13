package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    int idUsuario;
    @Column
    int run;
    @Column
    String clave;
    @Column
    String nombre;
    @Column
    String apellido1;
    @Column
    String apellido2;
    @Column
    String email;
    @Column
    LocalDateTime fecha_creacion;
    @Column
    Long telefono;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="id_perfil",nullable = false)
    private Perfil perfil;
}
