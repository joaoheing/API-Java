package com.atividade.atividade.model;

import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataLancamento;
    private String descricao;
}