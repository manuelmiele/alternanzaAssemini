package src.classes;

public class Cliente 
{
	//attributi
	
	private int idCliente;
	private String numCarta;
	private String mail;
	private String nominativo;
	
	 //costruttore di default
	
	public Cliente()
	{
		this.idCliente=0;
		this.numCarta="da definire";
		this.mail="da definire";
		this.nominativo="da definire";
	}
	
	//costruttore con parametri
	
	public Cliente(int idCliente,String numCarta,String mail,String nominativo)
	{
		setIdCliente(idCliente);
		this.numCarta=numCarta;
		this.mail=mail;
		this.nominativo=nominativo;
	}
	
	//costruttore di copia per questioni di backup
	
	public Cliente(Cliente c)
	{
		this.idCliente=c.idCliente;
		this.numCarta=c.numCarta;
		this.mail=c.mail;
		this.nominativo=c.nominativo;
	}
	
	//setters
	
	public void setIdCliente(int idCliente)
	{
		if(idCliente>0)
			this.idCliente=idCliente;
		else
			this.idCliente=0;
	}
	
	public void setNumCarta(String numCarta)
	{
		this.numCarta=numCarta;
	}
	
	public void setMail(String mail)
	{
		this.mail=mail;
	}
	
	public void setNominativo(String nominativo)
	{
		this.nominativo=nominativo;
	}
	
	//getters
	
	public int getIdCliente()
	{
		return idCliente;
	}
	
	public String getNumCarta()
	{
		return numCarta;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public String getNominativo()
	{
		return nominativo;
	}
	
	//to String
	
	public String toString()
	{
		return "Il cliente ha le seguenti caratteristiche:\nID cliente: "+idCliente+".\nNumero carta: "+numCarta+".\nE-mail: "+mail+".\nNominativo: "+nominativo+".\n";
	}
}