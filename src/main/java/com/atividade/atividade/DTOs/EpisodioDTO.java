package com.atividade.atividade.DTOs;

import com.atividade.atividade.model.Episodio;
import lombok.Data;

@Data

public class EpisodioDTO {
    private Long id;
    private int numero;
    private String nome;
    private String resumo;
    private long temporadaNumero;
    private String serieNome;

    public EpisodioDTO(Episodio episodio) {
        this.id = episodio.getId();
        this.numero = episodio.getNumero();
        this.nome = episodio.getNome();
        this.resumo = episodio.getResumo();
        this.temporadaNumero = episodio.getTemporada().getNumero();
        this.serieNome = episodio.getTemporada().getSerieNome();
    }
}
