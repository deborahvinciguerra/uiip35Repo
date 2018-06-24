package it.uiip.test.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Scrittura {

	private int idLibro,numCopie;
	private String titolo;
	private String nome,cognome;
	List<Libro> elencoLibri;
	List<Autore> elencoAutori;
	
	public Scrittura(int idLibro,String titolo, String nome, String cognome, int numCopie) {
		this.idLibro = idLibro;
		this.titolo = titolo;
		this.nome = nome;
		this.cognome = cognome;
		this.numCopie = numCopie;
		elencoLibri = new ArrayList<Libro>();
		elencoAutori = new ArrayList<Autore>();
	}
	
	public Scrittura(Libro libro, Autore autore) {
		idLibro = libro.getIdLibro();
		titolo = libro.getTitolo();
		nome = autore.getNome();
		cognome = autore.getCognome();
		numCopie = libro.getNumCopie();
	}
	
	public void inserisciLibro(Libro libro) {
		elencoLibri.add(libro);
	}
	
	public void inserisciAutore(Autore autore) {
		elencoAutori.add(autore);
	}

	@Override
	public String toString() {
		String str = "";
		for(int i=0;i<elencoLibri.size() && i<elencoAutori.size();i++) {
			str += "IdLibro: "+elencoLibri.get(i).getIdLibro()+"; titolo: "+elencoLibri.get(i).getTitolo()+
					"; nomeAutore: "+elencoAutori.get(i).getNome()+" "+elencoAutori.get(i).getCognome()+
					"; numCopie: "+elencoLibri.get(i).getNumCopie()+"\n";
		}
		return str;
	}
	
	
}
