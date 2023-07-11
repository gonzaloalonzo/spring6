package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.IntPrevision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIntPrevisionRepo extends JpaRepository<IntPrevision, Integer> {
}
