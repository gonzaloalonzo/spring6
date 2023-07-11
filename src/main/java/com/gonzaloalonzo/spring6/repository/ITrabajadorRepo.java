package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrabajadorRepo extends JpaRepository<Trabajador, Integer> {
}
