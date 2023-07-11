package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPerfilRepo extends JpaRepository<Perfil, Integer> {
}
