package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.IntPrevision;
import com.gonzaloalonzo.spring6.repository.IIntPrevisionRepo;
import com.gonzaloalonzo.spring6.service.IIntPresisionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service("IntPrevisionalImpl")
public class IntPrevisionalImpl implements IIntPresisionalService {

    @Autowired
    IIntPrevisionRepo objIIntPrevisionRepo;
    @Override
    public List<IntPrevision> listarIntPresisionales() {
        return objIIntPrevisionRepo.findAll();
    }
    @Override
    public IntPrevision CrearIntPrevision(IntPrevision insPrevision) {
        return objIIntPrevisionRepo.save(insPrevision);
    }
    @Override
    public IntPrevision buscarIntPrevisionPorId(int id_ins_previsional) {
        return objIIntPrevisionRepo.findById(id_ins_previsional).orElseThrow(()->new NoSuchElementException("Institrucion previsional no encontrada"));
    }
    @Override
    public IntPrevision actualizarIntPrevision(IntPrevision instPrevision) {
        return objIIntPrevisionRepo.save(instPrevision);
    }
    @Override
    public void EliminarIntPrevisional(int id_inst_previsional) {
        objIIntPrevisionRepo.deleteById(id_inst_previsional);
    }
}
