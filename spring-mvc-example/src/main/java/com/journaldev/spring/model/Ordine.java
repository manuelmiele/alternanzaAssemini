package org.alternanza.prova.classi;

import java.io.*;
import java.util.*;

public class Ordine{
	private int id_ordine;
	private java.sql.Timestamp time_stamp;
 
	
	public int getId_ordine() {
		return id_ordine;
	}
	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}
	public Date getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(java.sql.Timestamp  time_stamp) {
		this.time_stamp = time_stamp;
	}
 	
	public Ordine(){
		id_ordine++;
		time_stamp=new java.sql.Timestamp(0);
	}
	public Ordine(int id_ord, java.sql.Timestamp time_st)throws CtrlException{
		if(id_ord > 0){
			id_ordine = id_ord;
		}else{
			throw new CtrlException("Il numero dell'ordine e' minore di zero");
		}
		time_stamp = time_st;
	}
}
