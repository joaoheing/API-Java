package com.atividade.atividade.DTOs;

import com.atividade.atividade.model.Serie;
import lombok.Data;

import java.time.LocalDate;

@Data

public class SerieDTO {
    private Long id;
    private String nome;
    private LocalDate dataLancamento;

    public SerieDTO(Serie serie) {
        this.id = serie.getId();
        this.nome = serie.getNome();
        this.dataLancamento = serie.getDataLancamento();
    }
}
