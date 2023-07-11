package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Empleador;

import java.util.List;

public interface IEmpleadorService {
    List<Empleador> listaEmpleador();
    Empleador CrearEmpleado(Empleador empleador);
    Empleador buscarEmpleadorPorId(int idEmpleador);
    Empleador ActualizarEmpleador(Empleador empleador);
    void EliminarEmpleadorPorId(int idEmpleador);
}
