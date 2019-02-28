package com.alternanza.negozio.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alternanza.negozio.service.ArticoloService;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ArticoloService articoloService;
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws CtrlException 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Articolo> getAll(Model model) throws CtrlException {
		return articoloService.getAll();
	}
	 
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public String getArticolo(@RequestParam(value="id", required=true) int id, Model model) throws CtrlException {
		Articolo articolo = articoloService.getArticolo(id);
		model.addAttribute("articoloTrovato", articolo);
		return "dettaglio";
		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Articolo> getArticoloByNome(@RequestParam(value="nome",required=true) String nome,Model model) throws CtrlException {
		return articoloService.getArticoloByNome(nome);
	}
	 
	
	
	
	
}

