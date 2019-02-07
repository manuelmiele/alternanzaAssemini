package Dao;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import src.classes.Articolo;

public class ArticoloDao {

	public ArticoloDao() {
		super();
	}

	public List<Articolo> getAllArticoli (String query) {
		Logger.info("Recupero tutti i ricoveri");
		List<Articolo> articolo;

		try {
			ResultSet rs = getDbm().performQuery(query);
			while (rs.next()) {
				int id = rs.getInt("id");
				String piattaforma = rs.getString("piattaforma");
				String tipo = rs.getString("tipo");
				String descrizione = rs.getString("descrizione");
				String copertina = rs.getString("copertina");   //copertina --> img
				String nome = rs.getString("nome");
				int quantita = rs.getInt("quantita");
				float prezzo = rs.getFloat("prezzo"); 
				
				articolo.setID(id);
				articolo.setPrezzo(prezzo);
				articolo.setTipo(tipo);
				articolo.setNome(nome);
				articolo.setPiattaforma(piattaforma);
				articolo.setDescrizione(descrizione);
				articolo.setCopertina(copertina);
				articolo.setQuantita(quantita);
				
			}
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}

		return articolo;
	}
	 
	//ottieni generi e console
  
  public List <String> getTipi() {
		try {
		ResultSet rs = getDbm().performQuery("SELECT DISTINCT tipo FROM articolo");
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}
		return;
	}
  
  public List <String> getPiattaforme() {
		try {
		ResultSet rs = getDbm().performQuery("SELECT DISTINCT piattaforme FROM articolo");
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}
		return;
	}
  
  	 
	//ricerche
		
	public List <Articolo> getArticoloByName(String name) {
		return getAllRicovero("select * from articolo where nome="+name+" OR nome LIKE '%"+name+"' OR nome LIKE '"+name+"%'");
	}
	public List <Articolo> getArticoloByTipo(String tipo) {
		return getAllRicovero("select * from articolo where genere="+genere);
	}
	public List <Articolo> getArticoloByPiattoforma(String piattaforma) {
		return getAllRicovero("select * from articolo where console ="+piattaforma);
	}
	public List <Articolo> getArticoloByPrezzo(float prezzo) {
		return getAllRicovero("select * from articolo where prezzo <="+prezzo);
	}
	
	
	//aggiorno quantità
	
	public void updateQuantity(int quantity) {
		try {
		ResultSet rs = getDbm().performQuery("UPDATE articolo SET quantita="+quantity);
		} catch (SQLException e) {
			logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}
		return;
	}
	
	
	
	}
	
}

