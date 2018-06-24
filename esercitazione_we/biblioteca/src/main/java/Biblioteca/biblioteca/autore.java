package Biblioteca.biblioteca;

public class autore {
	
	private String nome;
	private String cognome;
	private int idAuthor;
	
	//costruttore
	public autore(String nome, String cognome, int idAuthor) {
		this.nome = nome;
		this.cognome = cognome;
		this.idAuthor = idAuthor;
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

	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}
	
	
	
	
	
	
	

}
