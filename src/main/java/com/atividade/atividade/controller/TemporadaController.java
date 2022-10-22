package com.atividade.atividade.controller;

import com.atividade.atividade.DTOs.SerieDTO;
import com.atividade.atividade.DTOs.TemporadaDTO;
import com.atividade.atividade.model.Temporada;
import com.atividade.atividade.repositorio.TemporadaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temporada")
public class TemporadaController {

    @Autowired
    private TemporadaRepositorio temporadaRepositorio;

    @GetMapping("/")
    public List<TemporadaDTO> getAll(){
        return temporadaRepositorio.findAll().stream().map(temporada -> new TemporadaDTO(temporada)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TemporadaDTO getById(@PathVariable Long id){
        return new TemporadaDTO(temporadaRepositorio.findById(id).get());
    }

    @PostMapping
    public void postTemporada(@RequestBody Temporada temporada){
        temporadaRepositorio.save(temporada);
    }

    @PutMapping("/{id}")
    public void putTemporada(@RequestBody Temporada temporada, @PathVariable Long id){
        temporada.setId(id);
        temporadaRepositorio.save(temporada);
    }

    @DeleteMapping("/{id}")
    public void deleteTemporada(@PathVariable Long id){
        temporadaRepositorio.deleteById(id);
    }
}
