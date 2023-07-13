package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    Usuario crearUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    Usuario buscarUsuarioporId(int idUsuario);

    Usuario actualizarUsuario(Usuario usuario, int idUsuario);

    void eliminarUsuario(int idUsuario);
}
