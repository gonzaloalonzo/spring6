package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Liquidacion;

import java.util.List;

public interface ILiquidacionService {
    Liquidacion crearLiquidaciones (Liquidacion liquidacion);
    List<Liquidacion> listarLiquidaciones();
    Liquidacion buscarLiquidacionPorId(int id_liquidacion);
    Liquidacion ActualizarLiquidacion(Liquidacion liquidacion);
    void eliminarLiqudacion(int id_liquidacion);
}
