package it.uiip.main.Biblioteca;

public class Lettori {
//	tessera int(11) not null primary key,
//	nome varchar(64) not null,
//	cognome varchar(64) not null
	
	private int tessera;
	private String nome, cognome;
	
	public Lettori(int tessera, String nome, String cognome) {
		this.tessera = tessera;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
    // GET AND SET
	public int getTessera() {
		return tessera;
	}
	public void setTessera(int tessera) {
		this.tessera = tessera;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
}
