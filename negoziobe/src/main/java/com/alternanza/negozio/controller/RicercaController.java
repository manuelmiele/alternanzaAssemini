package com.alternanza.negozio.controller;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alternanza.negozio.service.ArticoloService;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;

@RestController
public class RicercaController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ArticoloService articoloService;
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public List<Articolo> getArticoloByPrezzo(@RequestParam(value="prezzo", required=true) double prezzo, Model model) throws CtrlException {
		return articoloService.getArticoloByPrezzo(prezzo);
	}
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public List<Articolo> getArticoloByTipo(@RequestParam(value="tipo", required=true) String tipo, Model model) throws CtrlException {
		return articoloService.getArticoloByTipo(tipo);
	}
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public List<Articolo> getArticoloByNome(@RequestParam(value="nome", required=true) String nome, Model model) throws CtrlException {
		return articoloService.getArticoloByNome(nome);
	}
	
	
	

}
