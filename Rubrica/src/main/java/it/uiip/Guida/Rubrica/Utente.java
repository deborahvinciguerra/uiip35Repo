package it.uiip.Guida.Rubrica;

public class Utente {
	private String nome,cognome,numero;
	private int Smartphone;

	public Utente(String numero, String nome, String cognome, int Smartphone) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.Smartphone = Smartphone;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getSmartphone() {
		return Smartphone;
	}

	public void setSmartphone(int phone) {
		this.Smartphone = Smartphone;
	}
	

}
