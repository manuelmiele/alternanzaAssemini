package com.alternanza.negozio.controller;

import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.repository.ArticoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticoloController {

    @Autowired
    private ArticoloRepository articoloRepository;

    @GetMapping("/catalogo")
    public List<Articolo> retrieveAllArticoli(){

        return articoloRepository.findAll();

    }


}
