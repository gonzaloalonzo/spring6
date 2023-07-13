package com.gonzaloalonzo.spring6.service.serviceImpl;

import com.gonzaloalonzo.spring6.entity.Liquidacion;
import com.gonzaloalonzo.spring6.repository.ILiquidacionRepo;
import com.gonzaloalonzo.spring6.service.ILiquidacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LiquidacionImpl implements ILiquidacionService {

    @Autowired
    ILiquidacionRepo objILiquidacionRepo;
    @Override
    public Liquidacion crearLiquidaciones(Liquidacion liquidacion) {
        return objILiquidacionRepo.save(liquidacion);
    }

    @Override
    public List<Liquidacion> listarLiquidaciones() {
        return objILiquidacionRepo.findAll();
    }

    @Override
    public Liquidacion buscarLiquidacionPorId(Long id_liquidacion) {
        return objILiquidacionRepo.findById(id_liquidacion).orElseThrow(()->new NoSuchElementException("Liquidacion no encontrada"));
    }

    @Override
    public Liquidacion ActualizarLiquidacion(Liquidacion liquidacion) {
        return objILiquidacionRepo.save(liquidacion);
    }

    @Override
    public void eliminarLiqudacion(Long id_liquidacion) {
    objILiquidacionRepo.deleteById(id_liquidacion);
    }
}
