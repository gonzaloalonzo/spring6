package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioporId(int id_usuario);

    Usuario ActualizarUsurio(Usuario usuario);

    void eliminarUsuario(int id_usuario);
}
