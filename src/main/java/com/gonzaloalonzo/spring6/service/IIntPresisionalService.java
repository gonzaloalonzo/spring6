package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Empleador;
import com.gonzaloalonzo.spring6.entity.IntPrevision;

import java.util.List;

public interface IIntPresisionalService {
    List<IntPrevision> listarIntPresisionales();
    IntPrevision CrearIntPrevision(IntPrevision insPrevision);

    IntPrevision buscarIntPrevisionPorId(int id_ins_previsional);

    IntPrevision actualizarIntPrevision(IntPrevision instPrevision);

    void EliminarIntPrevisional(int id_inst_previsional);


}
