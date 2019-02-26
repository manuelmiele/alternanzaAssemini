package org.alternanza.prova.classi;

public class Articolo {

	private double (1.2)prezzo;
	private int id;
	private int quantita;
    private String tipo;
    private String nome;
    private String descrizione;
    private String piattaforma;
    
    //costruttore di default
    public Articolo(){
    	prezzo=0;
    	id=0;
    	quantita=0;
    	tipo=" ";
    	nome=" ";
    	descrizione=" ";
    	piattaforma=" ";
    }
    
    //costruttore con parametri
    public Articolo(double prezzo, int id, int quantita, String tipo, String nome, String descrizione, String piattaforma) throws CtrlException{
    	setPrezzo(prezzo);
    	setId(id);
    	setQuantita(quantita);
    	this.tipo=tipo;
    	this.nome=nome;
    	this.descrizione=descrizione;
    	this.piattaforma=piattaforma;
    }
    
    //costruttore di copia
    public Articolo(Articolo a){
    	this.prezzo=a.prezzo;
    	this.id=a.id;
    	this.quantita=a.quantita;
    	this.tipo=a.tipo;
    	this.nome=a.nome;
    	this.descrizione=a.descrizione;
    	this.piattaforma=a.piattaforma;
    }

    //getters
	public int getPrezzo() {
		return prezzo;
	}

	public int getId() {
		return id;
	}	

	public int getQuantita() {
		return quantita;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public String getPiattaforma() {
		return piattaforma;
	}
	
	
	//setters
    public void setPrezzo(double prezzo) throws CtrlException{
    	if(prezzo>0){
		this.prezzo = prezzo;
    	} else {
    		prezzo=0;
    		throw new CtrlException("il prezzo è minore di zero\n");
    	}
	}
    
    public void setId(int id) {
		this.id = id;
	}
    
	public void setQuantita(int quantita) throws CtrlException {
		if(quantita>0){
			this.quantita = quantita;
	    	} else {
	    		quantita=0;
	    		throw new CtrlException("la quantita e' minore di zero\n");
	    	}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public void setPiattaforma(String piattaforma) {
		this.piattaforma = piattaforma;
	}
	
	public String toString(){
		return "prezzo articolo:"+prezzo+"\nId articolo:"+id+"\nQuantita' stesso articolo:"+quantita+"\nTipo articolo:"+tipo+"\nDescrizione articolo:"+descrizione+"\nPiattaforma articolo:"+piattaforma;
	}
}
