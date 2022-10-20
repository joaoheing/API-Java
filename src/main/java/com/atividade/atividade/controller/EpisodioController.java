package com.atividade.atividade.controller;

import com.atividade.atividade.model.Episodio;
import com.atividade.atividade.repositorio.EpisodioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/episodio")
public class EpisodioController {

    @Autowired
    private EpisodioRepositorio episodioRepositorio;

    @GetMapping("/")
    public List<Episodio> getAll(){
        return episodioRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Episodio getById( long id){
        return episodioRepositorio.findById(id).get();
    }

    @PostMapping
    public void postEpisodio(@RequestBody Episodio episodio){
        episodioRepositorio.save(episodio);
    }

    @PutMapping("/{id}")
    public void putEpisodio(@RequestBody Episodio episodio, long id){

        episodio.setId(id);
        episodioRepositorio.save(episodio);
    }

    @DeleteMapping("/{id}")
    public void deleteEpisodio(long id){
        episodioRepositorio.deleteById(id);
    }
}
