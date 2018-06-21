package it.uiip.pagliaro.Rubrica;

public class Utente {
	private String nome,cognome,numero;
	private int phone;

	public Utente(String nome, String cognome, String numero, int phone) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.phone = phone;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}
