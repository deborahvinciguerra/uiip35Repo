package it.uiip.test.Biblioteca;

public class Libro {

	private int idLibro, numCopie;
	private String titolo;
	
	public Libro(int idLibro, String titolo, int numCopie) {
		super();
		this.idLibro = idLibro;
		this.numCopie = numCopie;
		this.titolo = titolo;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getNumCopie() {
		return numCopie;
	}

	public void setNumCopie(int numCopie) {
		this.numCopie = numCopie;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", numCopie=" + numCopie + ", titolo=" + titolo + "]";
	}	
	
}
