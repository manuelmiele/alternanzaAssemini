package com.alternanza.negozio.service;

import java.util.List;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;
public interface ArticoloService {

	public List<Articolo> getAll() throws CtrlException;
	public Articolo getArticolo(int id) throws CtrlException;
	public List<Articolo> getArticoloByNome(String nome) throws CtrlException;
}
