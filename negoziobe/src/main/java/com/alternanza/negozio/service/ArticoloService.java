package com.alternanza.negozio.service;

import java.util.List;
import com.alternanza.negozio.entity.Articolo;
public interface ArticoloService {

	public List<Articolo> getAll();
	public Articolo getArticolo(int id);
	
}
