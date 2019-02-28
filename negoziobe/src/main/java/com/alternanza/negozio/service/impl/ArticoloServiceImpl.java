package com.alternanza.negozio.service.impl;

import java.util.List;

import com.alternanza.negozio.dao.ArticoloDao;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;
import com.alternanza.negozio.service.ArticoloService;

public class ArticoloServiceImpl implements ArticoloService{

	ArticoloDao dao;
	@Override
	public List<Articolo> getAll() throws CtrlException {
		return dao.findAll();
		
	}

	public Articolo getArticolo(int id) throws CtrlException {
		
	return dao.findById(id);
		
	}

	@Override
	public List<Articolo> getArticoloByNome(String nome) throws CtrlException {
		
		return dao.findbyName(nome);
	}
	
	
}
