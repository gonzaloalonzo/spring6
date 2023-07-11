package com.gonzaloalonzo.spring6.repository;

import com.gonzaloalonzo.spring6.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
}
