package com.atividade.atividade.repositorio;

import com.atividade.atividade.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepositorio extends JpaRepository<Serie, Long> {
}
