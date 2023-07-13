package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.Liquidacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILiquidacionRepo extends JpaRepository<Liquidacion, Long>{
}
