package com.atividade.atividade.controller;

import com.atividade.atividade.DTOs.EpisodioDTO;
import com.atividade.atividade.DTOs.TemporadaDTO;
import com.atividade.atividade.model.Episodio;
import com.atividade.atividade.repositorio.EpisodioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/episodio")
public class EpisodioController {

    @Autowired
    private EpisodioRepositorio episodioRepositorio;

    @GetMapping("/")
    public List<EpisodioDTO> getAll(){
        return episodioRepositorio.findAll().stream().map(episodio -> new EpisodioDTO(episodio)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public EpisodioDTO getById(@PathVariable Long id){
        return new EpisodioDTO(episodioRepositorio.findById(id).get());
    }

    @PostMapping
    public void postEpisodio(@RequestBody Episodio episodio){
        episodioRepositorio.save(episodio);
    }

    @PutMapping("/{id}")
    public void putEpisodio(@RequestBody Episodio episodio, @PathVariable Long id){

        episodio.setId(id);
        episodioRepositorio.save(episodio);
    }

    @DeleteMapping("/{id}")
    public void deleteEpisodio(@PathVariable Long id){
        episodioRepositorio.deleteById(id);
    }
}
