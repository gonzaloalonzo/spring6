package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Perfil;

import java.util.List;

public interface IPrefilService {
    Perfil crearPerfil (Perfil perfil);
    List<Perfil> listarPerfiles();
    Perfil buscarPerfilPorId(int idperfil);
    Perfil actulizarPerfil(Perfil perfil);
    void eliminarPerfil(int idePerfil);

}
