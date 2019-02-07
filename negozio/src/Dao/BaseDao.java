package Dao;

import java.util.ResourceBundle;
import java.util.logging.Logger;

import Dao.DatabaseManager;

public class BaseDao {

	protected Logger logger = Logger.getLogger(BaseDao.class.getName());

	private DatabaseManager dbm;
	
	public BaseDao() {
		ResourceBundle bundle = ResourceBundle.getBundle("aziendaospedaliera");
		
		String databasePassword = bundle.getString("db.password");
		String schema = bundle.getString("db.schema");
		String classDriver = bundle.getString("db.driver");
		String hostnameOrIpAddress = bundle.getString("db.address");
		String databasePort = bundle.getString("db.port");
		String databaseUsername = bundle.getString("db.username");
		
		setDbm(new DatabaseManager(classDriver, hostnameOrIpAddress, databasePort, databaseUsername, databasePassword, schema));
	}

	
	public DatabaseManager getDbm() {
		return dbm;
	}

	public void setDbm(DatabaseManager dbm) {
		this.dbm = dbm;
	}
	
	
}