package it.uiip.test.Biblioteca;

public class Autore {

	private int idAutore;
	private String nome,cognome;
	
	public Autore(int idAutore, String nome, String cognome) {
		super();
		this.idAutore = idAutore;
		this.nome = nome;
		this.cognome = cognome;
	}

	public int getIdAutore() {
		return idAutore;
	}

	public void setIdAutore(int idAutore) {
		this.idAutore = idAutore;
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

	@Override
	public String toString() {
		return "Autore [idAutore=" + idAutore + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}
