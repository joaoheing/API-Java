package com.atividade.atividade.controller;

import com.atividade.atividade.model.Temporada;
import com.atividade.atividade.repositorio.TemporadaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/temporada")
public class TemporadaController {

    @Autowired
    private TemporadaRepositorio temporadaRepositorio;

    @GetMapping("/")
    public List<Temporada> getAll(){
        return temporadaRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Temporada getById( long id){
        return temporadaRepositorio.findById(id).get();
    }

    @PostMapping
    public void postTemporada(@RequestBody Temporada temporada){
        temporadaRepositorio.save(temporada);
    }

    @PutMapping("/{id}")
    public void putTemporada(@RequestBody Temporada temporada, long id){
        temporada.setId(id);
        temporadaRepositorio.save(temporada);
    }

    @DeleteMapping("/{id}")
    public void deleteTemporada(long id){
        temporadaRepositorio.deleteById(id);
    }
}
