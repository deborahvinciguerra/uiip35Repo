package it.uiip.test.biblioteca;

public class Libro {
	
	private int id;
	private String titolo;
	private boolean disponibilità;
	private int nCopie;
	
	public Libro(int id, String titolo, boolean disponibilità, int nCopie) {
		this.id=id;
		this.titolo = titolo;
		this.disponibilità = disponibilità;
		this.nCopie = nCopie;
	}



	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public boolean isDisponibilità() {
		return disponibilità;
	}

	public void setDisponibilità(boolean disponibilità) {
		this.disponibilità = disponibilità;
	}

	public int getnCopie() {
		return nCopie;
	}

	public void setnCopie(int nCopie) {
		this.nCopie = nCopie;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	
	

}
