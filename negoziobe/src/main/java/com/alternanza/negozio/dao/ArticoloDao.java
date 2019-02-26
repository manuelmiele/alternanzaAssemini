package com.alternanza.negozio.dao;

import java.util.List;

import com.alternanza.negozio.entity.Articolo;

public interface ArticoloDao {

	public List<Articolo> findAll();
	public Articolo findById();
	
}
