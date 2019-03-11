package com.alternanza.negozio.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alternanza.negozio.dao.ArticoloDao;
import com.alternanza.negozio.entity.Articolo;
import com.alternanza.negozio.entity.CtrlException;
import com.alternanza.negozio.database.*;

@Component
public class ArticoloDaoImpl implements ArticoloDao {

	@Override
	public List<Articolo> findAll() throws CtrlException {

		List<Articolo> ret = null;
		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli";
		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			// ret = new ArrayList();
			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return ret;
	}

	@Override
	public Articolo findById(int id) throws CtrlException {

		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli WHERE id=" + id;

		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);

			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return a;
	}

	@Override
	public List<Articolo> findbyName(String nome) throws CtrlException {
		List<Articolo> ret = null;
		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli WHERE nome LIKE %"+nome+"%";
		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			//ret = new ArrayList();
			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return ret;
	}

	@Override
	public List<Articolo> findbyTipo(String tipo) throws CtrlException {
		List<Articolo> ret = null;
		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli WHERE tipo='"+tipo+"'";
		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			//ret = new ArrayList();
			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return ret;
	}

	@Override
	public List<Articolo> findbyPiattaforma(String piattaforma) throws CtrlException {
		List<Articolo> ret = null;
		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli WHERE piattaforma='"+piattaforma+"'";
		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			//ret = new ArrayList();
			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return ret;
	}

	@Override
	public List<Articolo> findbyPrezzo(double prezzo) throws CtrlException {
		List<Articolo> ret = null;
		Articolo a = null;
		DatabaseManager db = null;
		Connection conn=null;
		ResultSet rs = null;
		String query = "SELECT * FROM articoli WHERE prezzo="+prezzo;
		try {
			conn = db.getConnection();
			Statement st = conn.createStatement();
			rs = st.executeQuery(query);
			//ret = new ArrayList();
			while (rs.next()) {
				a = new Articolo();
				a.setId(rs.getInt("int"));
				a.setNome(rs.getString("nome"));
				a.setPiattaforma(rs.getString("piattaforma"));
				a.setPrezzo(rs.getDouble("prezzo"));
				a.setQuantita(rs.getInt("quantit�"));
				a.setTipo(rs.getString("tipo"));
				a.setDescrizione(rs.getString("descrizione"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			db.closeConnection();
		}
		return ret;
	}

}