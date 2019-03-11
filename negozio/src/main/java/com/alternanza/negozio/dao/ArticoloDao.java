package com.alternanza.negozio.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;
@Component
public interface ArticoloDao {

	public List<Articolo> findAll() throws CtrlException;
	public Articolo findById(int id) throws CtrlException;
	public List<Articolo> findbyName(String nome) throws CtrlException;
	public List<Articolo> findbyTipo(String tipo) throws CtrlException;
	public List<Articolo> findbyPiattaforma(String piattaforma) throws CtrlException;
	public List<Articolo> findbyPrezzo(double prezzo) throws CtrlException;
}
