package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.Empleador;
import com.gonzaloalonzo.spring6.repository.IEmpleadorRepo;
import com.gonzaloalonzo.spring6.service.IEmpleadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("EmpleadorImpl")
public class EmpleadorImpl implements IEmpleadorService {

    @Autowired
    IEmpleadorRepo objIEmpleadorRepo;
    @Override
    public List<Empleador> listaEmpleador() {
        return (List<Empleador>) objIEmpleadorRepo.findAll();
    }

    @Override
    public Empleador CrearEmpleado(Empleador empleador) {
        return objIEmpleadorRepo.save(empleador);
    }

    @Override
    public Empleador buscarEmpleadorPorId(int idEmpleador) {
        return objIEmpleadorRepo.findById(idEmpleador).orElseThrow(()->new NoSuchElementException("Empleador no encontrador"));
    }

    @Override
    public Empleador ActualizarEmpleador(Empleador empleador) {
        return objIEmpleadorRepo.save(empleador);
    }

    @Override
    public void EliminarEmpleadorPorId(int idEmpleador) {
        objIEmpleadorRepo.deleteById(idEmpleador);
    }
}
