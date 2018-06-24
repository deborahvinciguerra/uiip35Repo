package esercizio.Biblioteca;

public class Libro {
	
	private String titolo;
	private int numeroCopie;
	private int i=0;
	
	public Libro(String titolo, int numeroCopie) {
		super();
		this.titolo = titolo;
		this.numeroCopie = numeroCopie;
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
	
	public String toString () {
		String str= "Titolo= "+this.getTitolo()+" Copie disponibili= "+this.getNumeroCopie()+" ";
		return str;	
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	
	

}
