package it.uiip.main.Biblioteca;

public class Autori {

//	idAutore int(11) not null primary key,
//	nomeAutore varchar(64) not null
	
	private int idAutore;
	private String nomeAutore;
	
	public Autori(int idAutore, String nomeAutore) {
		this.idAutore = idAutore;
		this.nomeAutore = nomeAutore;
	}

	//get and set
	public int getIdAutore() {
		return idAutore;
	}
	public void setIdAutore(int idAutore) {
		this.idAutore = idAutore;
	}
	public String getNomeAutore() {
		return nomeAutore;
	}
	public void setNomeAutore(String nomeAutore) {
		this.nomeAutore = nomeAutore;
	}
	
	
}
