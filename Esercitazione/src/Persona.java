
public class Persona {
	
	private String nome;
	private String cognome;
	private int anni;
	//indirizzo es via roma 21, 80032, nola (NA)
	private String indirizzo;
	private String regione;
	
	
	public Persona(String nome, String cognome, int anni, String indirizzo, String regione) {
		this.nome = nome;
		this.cognome = cognome;
		this.anni = anni;
		this.indirizzo = indirizzo;
		this.regione = regione;
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


	public int getAnni() {
		return anni;
	}


	public void setAnni(int anni) {
		this.anni = anni;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getRegione() {
		return regione;
	}


	public void setRegione(String regione) {
		this.regione = regione;
	}

}
