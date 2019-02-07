package Dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import src.classes.Ordine;


public class VenditaDao extends BaseDao{

	public VenditaDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setVendita(int id_ordine, int id_art, int quantity){
		try{
			getDbm().performQuery("INSERT INTO vendita ('id_ordine', 'id_art', 'id quantity') VALUES ("+id_ordine+","+id_art+","+quantity+")");
		}catch (SQLException e){
			logger.log(Level.SEVERE, "Errore nel reupero delle info ->" + e.getMessage());
		}
		return;
	}
}

