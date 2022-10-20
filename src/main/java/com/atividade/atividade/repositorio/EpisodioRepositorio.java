package com.atividade.atividade.repositorio;


import com.atividade.atividade.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepositorio extends JpaRepository<Episodio, Long> {

}
