package com.alternanza.negozio.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alternanza.negozio.service.HomeService;

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
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Articolo> getAll(Model model) {
		return articoloService.getAll();
	}
	 
	@RequestMapping(value = "/%d", method = RequestMethod.GET)
	public Articolo getArticolo(@RequestParam("id") int id,Model model) {
		return articoloService.getArticolo(id);
	}
	
	
}

