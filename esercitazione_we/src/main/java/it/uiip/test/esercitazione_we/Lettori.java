package it.uiip.test.esercitazione_we;

public class Lettori {
	
	int IDLettore;
	String tessera;
	String nome;
	String indirizzo;
	
	
	public Lettori(int iDLettore, String tessera, String nome, String indirizzo) {
		super();
		IDLettore = iDLettore;
		this.tessera = tessera;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}


	public int getIDLettore() {
		return IDLettore;
	}


	public void setIDLettore(int iDLettore) {
		IDLettore = iDLettore;
	}


	public String getTessera() {
		return tessera;
	}


	public void setTessera(String tessera) {
		this.tessera = tessera;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
		

}
