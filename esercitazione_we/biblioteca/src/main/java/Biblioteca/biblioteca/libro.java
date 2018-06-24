package Biblioteca.biblioteca;

public class libro {
	
	private String titolo ;
	private String disponibilità ;
	private int numcopia ;
	private int idBook;
	
	//costruttore
	public libro (String titolo,String disponibilità,int numcopia,int idBook) {
		this.titolo=titolo;
		this.disponibilità=disponibilità;
		this.numcopia=numcopia;
		this.idBook=idBook;
	}
	
	
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDisponibilità() {
		return disponibilità;
	}
	public void setDisponibilità(String disponibilità) {
		this.disponibilità = disponibilità;
	}
	public int getNumcopia() {
		return numcopia;
	}
	public void setNumcopia(int numcopia) {
		this.numcopia = numcopia;
	}
	public int getIdBook() {
		return idBook;
	}
	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

}
