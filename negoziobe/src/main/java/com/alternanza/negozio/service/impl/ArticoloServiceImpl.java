package com.alternanza.negozio.service.impl;

import java.util.List;

import com.alternanza.negozio.dao.ArticoloDao;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.service.ArticoloService;

public class ArticoloServiceImpl implements ArticoloService{

	ArticoloDao dao;
	@Override
	public List<Articolo> getAll() {
		return dao.findAll();
		
	}

	public Articolo getArticolo(int id) {
		
	return dao.findById();
		
	}
	
	
}
