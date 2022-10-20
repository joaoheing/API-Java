package com.atividade.atividade.repositorio;

import com.atividade.atividade.model.Temporada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemporadaRepositorio extends JpaRepository<Temporada, Long> {
}
