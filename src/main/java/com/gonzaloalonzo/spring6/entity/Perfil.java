package com.gonzaloalonzo.spring6.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="perfil")
public class Perfil {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idperfil;
    @Column
    String descripcion;
    @Column
    boolean estado;

    @OneToMany(mappedBy = "perfil")
    private List<Usuario>listaUsuario;
}
