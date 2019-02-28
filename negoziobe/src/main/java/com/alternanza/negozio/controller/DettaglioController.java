package com.alternanza.negozio.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;
import com.alternanza.negozio.service.ArticoloService;

public class DettaglioController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ArticoloService articoloService;
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public String getArticoloByNome(@RequestParam(value="nome", required=true) String nome, Model model) throws CtrlException {
		List<Articolo> articoli = articoloService.getArticoloByNome(nome);
		model.addAttribute("articoliTrovatiNome", articoli);
		return "home";
	}
}
