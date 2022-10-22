package com.atividade.atividade.controller;

import com.atividade.atividade.DTOs.SerieDTO;
import com.atividade.atividade.model.Serie;
import com.atividade.atividade.repositorio.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/serie")
public class SerieController {
    @Autowired
    private SerieRepositorio serieRepositorio;

    @GetMapping("/")
    public List<SerieDTO> getAll(){
        return serieRepositorio.findAll().stream().map(serie -> new SerieDTO(serie)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public SerieDTO getById( @PathVariable Long id){
        return new SerieDTO(serieRepositorio.findById(id).get());
    }

    @PostMapping
    public void postSerie(@RequestBody Serie serie){
        serieRepositorio.save(serie);
    }

    @PutMapping("/{id}")
    public void putSerie(@RequestBody Serie serie, @PathVariable Long id){
        serie.setId(id);
        serieRepositorio.save(serie);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable Long id){
        serieRepositorio.deleteById(id);
    }
}
