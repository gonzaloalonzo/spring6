package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.IntSalud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIntSaludRepo extends JpaRepository<IntSalud, Integer> {
}
