package com.atividade.atividade.controller;

import com.atividade.atividade.model.Serie;
import com.atividade.atividade.repositorio.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {
    @Autowired
    private SerieRepositorio serieRepositorio;

    @GetMapping("/")
    public List<Serie> getAll(){
        return serieRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Serie getById( long id){
        return serieRepositorio.findById(id).get();
    }

    @PostMapping
    public void postSerie(@RequestBody Serie serie){
        serieRepositorio.save(serie);
    }

    @PutMapping("/{id}")
    public void putSerie(@RequestBody Serie serie, long id){
        serie.setId(id);
        serieRepositorio.save(serie);
    }

    @DeleteMapping("/{id}")
    public void deleteSerie(long id){
        serieRepositorio.deleteById(id);
    }
}
