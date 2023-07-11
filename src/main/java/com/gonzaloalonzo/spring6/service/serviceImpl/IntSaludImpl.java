package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.IntPrevision;
import com.gonzaloalonzo.spring6.repository.IIntPrevisionRepo;
import com.gonzaloalonzo.spring6.service.IIntPresisionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("IntSaludImpl")
public class IntSaludImpl implements IIntPresisionalService {

    @Autowired
    IIntPrevisionRepo objIInPrevisionRepo;
    @Override
    public List<IntPrevision> listarIntPresisionales() {
        return (List<IntPrevision>) objIInPrevisionRepo.findAll();
    }

    @Override
    public IntPrevision CrearIntPrevision(IntPrevision insPrevision) {
        return objIInPrevisionRepo.save(insPrevision);
    }

    @Override
    public IntPrevision buscarIntPrevisionPorId(int id_ins_previsional) {
        return objIInPrevisionRepo.findById(id_ins_previsional).orElseThrow(()->new NoSuchElementException("Prevision no encontrada"));
    }

    @Override
    public IntPrevision actualizarIntPrevision(IntPrevision instPrevision) {
        return objIInPrevisionRepo.save(instPrevision);
    }

    @Override
    public void EliminarIntPrevisional(int id_inst_previsional) {
        objIInPrevisionRepo.deleteById(id_inst_previsional);
    }
}
