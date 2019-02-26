package com.alternanza.negozio.dao;

import java.util.List;

import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;

public interface ArticoloDao {

	public List<Articolo> findAll() throws CtrlException;
	public Articolo findById(int id) throws CtrlException;
	
}
