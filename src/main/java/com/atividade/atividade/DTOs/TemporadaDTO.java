package com.atividade.atividade.DTOs;

import com.atividade.atividade.model.Temporada;
import lombok.Data;

@Data

public class TemporadaDTO {
    private Long id;
    private int numero;
    private String descricao;
    private Long serieId;
    private String serieNome;

    public TemporadaDTO(Temporada temporada) {
        this.id = temporada.getId();
        this.numero = temporada.getNumero();
        this.descricao = temporada.getDescricao();
        this.serieId = temporada.getSerie().getId();
        this.serieNome = temporada.getSerieNome();
    }
}
