package it.uiip.test.esercitazione_we;

public class Libri {
	
	String titolo;
	int numCopie,IDAutore,IDlibro;
	
	
	public Libri(String titolo, int numCopie, int iDAutore, int iDlibro) {
		super();
		this.titolo = titolo;
		this.numCopie = numCopie;
		IDAutore = iDAutore;
		IDlibro = iDlibro;
	}


	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getNumCopie() {
		return numCopie;
	}


	public void setNumCopie(int numCopie) {
		this.numCopie = numCopie;
	}


	public int getIDAutore() {
		return IDAutore;
	}


	public void setIDAutore(int iDAutore) {
		IDAutore = iDAutore;
	}


	public int getIDlibro() {
		return IDlibro;
	}


	public void setIDlibro(int iDlibro) {
		IDlibro = iDlibro;
	}
	
	

}
