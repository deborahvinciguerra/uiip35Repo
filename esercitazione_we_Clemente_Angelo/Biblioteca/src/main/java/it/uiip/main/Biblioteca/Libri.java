package it.uiip.main.Biblioteca;

public class Libri {

	//idLibro int(11) not null  primary key,
//	titolo varchar(64) not null primary key,
//	autori int(11) not null,
//	numeroCopie int(11) not null,
//	lettori int(11) not null
	
	private String titolo;
	private int autori, numeroCopie, lettori;
	private int idLibro;
	
	public Libri(int idLibro, String titolo, int autori, int numeroCopie, int lettori) {
		this.idLibro = idLibro;
		this.titolo = titolo;
		this.autori = autori;
		this.numeroCopie = numeroCopie;
		this.lettori = lettori;
	}

	//get and set
	
	public String getTitolo() {
		return titolo;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getAutori() {
		return autori;
	}
	public void setAutori(int autori) {
		this.autori = autori;
	}
	public int getNumeroCopie() {
		return numeroCopie;
	}
	public void setNumeroCopie(int numeroCopie) {
		this.numeroCopie = numeroCopie;
	}
	public int getLettori() {
		return lettori;
	}
	public void setLettori(int lettori) {
		this.lettori = lettori;
	}
	
	
	
}
