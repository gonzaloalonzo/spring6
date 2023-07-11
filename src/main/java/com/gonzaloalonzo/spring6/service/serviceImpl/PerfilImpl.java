package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.Perfil;
import com.gonzaloalonzo.spring6.repository.IPerfilRepo;
import com.gonzaloalonzo.spring6.service.IPrefilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PerfilImpl implements IPrefilService {

    @Autowired
    IPerfilRepo objIPerfilRepo;


    @Override
    public Perfil crearPerfil(Perfil perfil) {
        return objIPerfilRepo.save(perfil);
    }

    @Override
    public List<Perfil> listarPerfiles() {
        return objIPerfilRepo.findAll();
    }

    @Override
    public Perfil buscarPerfilPorId(int idperfil) {
        return objIPerfilRepo.findById(idperfil).orElseThrow(()->new NoSuchElementException("Perfil no encontrado"));
    }

    @Override
    public Perfil actulizarPerfil(Perfil perfil) {
        return objIPerfilRepo.save(perfil);
    }

    @Override
    public void eliminarPerfil(int idPerfil) {
        objIPerfilRepo.deleteById(idPerfil);
    }
}
