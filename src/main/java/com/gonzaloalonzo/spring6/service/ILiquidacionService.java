package com.gonzaloalonzo.spring6.service;

import com.gonzaloalonzo.spring6.entity.Liquidacion;

import java.util.List;

public interface ILiquidacionService {
    Liquidacion crearLiquidaciones (Liquidacion liquidacion);
    List<Liquidacion> listarLiquidaciones();
    Liquidacion buscarLiquidacionPorId(Long id_liquidacion);
    Liquidacion ActualizarLiquidacion(Liquidacion liquidacion);
    void eliminarLiqudacion(Long id_liquidacion);
}
