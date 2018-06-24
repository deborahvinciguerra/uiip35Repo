package it.uiip.test.esercitazione_we;


public class Autori {
	
	String nome,cognome;
	int IdAutore;
	
	
	public Autori(String nome, String cognome, int idAutore) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		IdAutore = idAutore;
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


	public int getIdAutore() {
		return IdAutore;
	}


	public void setIdAutore(int idAutore) {
		IdAutore = idAutore;
	}
	
	
	
	

	
	
	

}
