package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.Trabajador;
import com.gonzaloalonzo.spring6.repository.ITrabajadorRepo;
import com.gonzaloalonzo.spring6.service.ITrabajadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TrabajadorImpl implements ITrabajadorService {

    @Autowired
    ITrabajadorRepo objITrabajadorRepo;
    @Override
    public Trabajador crearTrabajador(Trabajador trabajador) {
        return objITrabajadorRepo.save(trabajador);
    }

    @Override
    public List<Trabajador> listarTrabajadores() {
        return objITrabajadorRepo.findAll();
    }

    @Override
    public Trabajador listarTrabajadorPorId(int id_trabajador) {
        return objITrabajadorRepo.findById(id_trabajador).orElseThrow(()->new NoSuchElementException("Trabajador no encontrado"));
    }

    @Override
    public Trabajador actualizartrabajador(Trabajador trabajador) {
        return objITrabajadorRepo.save(trabajador);
    }

    @Override
    public void eliminarTrabajador(int id_trabajador) {
        objITrabajadorRepo.deleteById(id_trabajador);
    }
}
