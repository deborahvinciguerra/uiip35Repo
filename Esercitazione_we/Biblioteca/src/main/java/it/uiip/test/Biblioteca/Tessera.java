package it.uiip.test.Biblioteca;

public class Tessera {

	private int idTessera;
	private String nome, cognome, indirizzo;
	
	public Tessera(int idTessera, String nome, String cognome, String indirizzo) {
		super();
		this.idTessera = idTessera;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public int getIdTessera() {
		return idTessera;
	}

	public void setIdTessera(int idTessera) {
		this.idTessera = idTessera;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Tessera [idTessera=" + idTessera + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo="
				+ indirizzo + "]";
	}
}
