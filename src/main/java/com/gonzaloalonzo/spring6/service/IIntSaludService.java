package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.IntSalud;

import java.util.List;

public interface IIntSaludService {

    IntSalud crearIntSalud( IntSalud intSalud);
    List<IntSalud> listarIntSalud();
    IntSalud buscarIntSaludPorId(int id_int_salud);
    IntSalud actualizarInstSalud(IntSalud intSalud);
    void eliminarInstSalud(int id_int_salud);

}
