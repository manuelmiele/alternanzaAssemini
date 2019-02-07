package Dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.sql.ResultSet;
import src.classes.Ordine;

public class OrdineDao {

	public OrdineDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setOrdine(java.sql.Timestamp time_stamp) {
		
		try {
			
			ResultSet rs = getDbm().performQuery("INSERT INTO ordini ('time_stamp') VALUES ("+time_stamp+")");
			
		} catch (SQLException e) {
			
		
		logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
			
		}
		
		return;
	}
	
	public void setOrdine(java.sql.Timestamp time_stamp, int id_cliente) {
		
		try {
			
			ResultSet rs = getDbm().performQuery("INSERT INTO ordini ('time_stamp','id_cliente') VALUES ("+time_stamp+","+id_cliente+")");
			
		} catch (SQLException e) {
			
		
		logger.log(Level.SEVERE, "Errore nel recupero delle info ->" + e.getMessage());
		
		}
		
		return;
	}
	
	
	
}
