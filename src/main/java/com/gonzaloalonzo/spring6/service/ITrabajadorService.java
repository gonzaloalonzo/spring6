package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Trabajador;

import java.util.List;

public interface ITrabajadorService {
    Trabajador crearTrabajador(Trabajador trabajador);
    List<Trabajador> listarTrabajadores();
    Trabajador listarTrabajadorPorId(int id_trabajador);

    Trabajador actualizartrabajador(Trabajador trabajador);

    void eliminarTrabajador(int id_trabajador);
}
