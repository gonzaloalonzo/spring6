package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.Empleador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadorRepo extends JpaRepository<Empleador, Integer> {
}
