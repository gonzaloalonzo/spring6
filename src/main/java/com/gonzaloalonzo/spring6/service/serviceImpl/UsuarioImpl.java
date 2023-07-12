package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.Usuario;
import com.gonzaloalonzo.spring6.repository.IUsuarioRepo;
import com.gonzaloalonzo.spring6.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsuarioImpl implements IUsuarioService {

    @Autowired
    IUsuarioRepo objIUsuarioRepo;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return objIUsuarioRepo.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuario() {
        return objIUsuarioRepo.findAll();
    }

    @Override
    public Usuario buscarUsuarioporId(int id_usuario) {
        return objIUsuarioRepo.findById(id_usuario).orElseThrow(()->new NoSuchElementException("Usuario no encontrado"));
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario, int id_usuario) {
        return objIUsuarioRepo.save(usuario);
    }

    @Override
    public void eliminarUsuario(int id_usuario) {
        objIUsuarioRepo.deleteById(id_usuario);
    }
}
