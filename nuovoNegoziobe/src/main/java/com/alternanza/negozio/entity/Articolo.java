package com.alternanza.negozio.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Articolo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int quantita;
    private String nome;
    private double prezzo;


    public Articolo() {
    }


    public Articolo(int quantita, String nome, double prezzo) {
        this.quantita = quantita;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}


