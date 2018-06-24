package it.uiip.pagliaro.Biblioteca;

public class Libro {
	String isbn,titolo;
	int numeroCopie;
	
	public Libro(String isbn, String titolo, int numeroCopie) {
		super();
		this.isbn = isbn;
		this.titolo = titolo;
		this.numeroCopie = numeroCopie;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getNumeroCopie() {
		return numeroCopie;
	}
	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}
	
	

}
