package it.uiip.test.Rubrica;

public class Contatto {
	
	String numCell;
	String nome;
	String cognome;
	int smartphone;
	
	public Contatto(String numCell, String nome, String cognome, int smartphone) {
		this.numCell = numCell;
		this.nome = nome;
		this.cognome = cognome;
		this.smartphone = smartphone;
	}
	
	public String getNumCell() {
		return numCell;
	}
	public void setNumCell(String numCell) {
		this.numCell = numCell;
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
	public int getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(int smartphone) {
		this.smartphone = smartphone;
	}
	
	

}
