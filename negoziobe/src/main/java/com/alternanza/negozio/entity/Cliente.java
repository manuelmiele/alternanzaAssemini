package org.alternanza.prova.classi;

public class Cliente 
{
	//attributi
	
	private int idCliente;
	private String numCarta;
	private String mail;
	private String nome;
	private String cognome;
	
	 //costruttore di default
	
	public Cliente()
	{
		this.idCliente=0;
		this.numCarta="da definire";
		this.mail="da definire";
		this.nome="da definire";
		this.cognome="da definire";
	}
	
	//costruttore con parametri
	
	public Cliente(int idCliente,String numCarta,String mail,String nome,String cognome)
	{
		setIdCliente(idCliente);
		this.numCarta=numCarta;
		this.mail=mail;
		this.nome=nome;
		this.cognome=cognome;
	}
	
	//costruttore di copia per questioni di backup
	
	public Cliente(Cliente c)
	{
		this.idCliente=c.idCliente;
		this.numCarta=c.numCarta;
		this.mail=c.mail;
		this.nome=c.nome;
		this.cognome=c.cognome;
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
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public void setCognome(String cognome)
	{
		this.cognome=cognome;
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
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	//to String
	
	public String toString()
	{
		return "Il cliente ha le seguenti caratteristiche:\nID cliente: "+idCliente+".\nNumero carta: "+numCarta+".\nE-mail: "+mail+".\nNome: "+nome+".\nCognome: "+cognome+".\n";
	}
}
