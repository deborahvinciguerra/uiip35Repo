
public class Persona {
	
	private String nome;
	private String cognome;
	private String dataDiNascita;
	//indirizzo es via roma 21, 80032, nola (NA)
	private String indirizzo;
	private String regione;
	
	
	public Persona(String nome, String cognome, String dataDiNascita, String indirizzo, String regione) {
		this.nome = nome;
		this.cognome = cognome;
		this.dataDiNascita= dataDiNascita;
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





	public String getDataDiNascita() {
		return dataDiNascita;
	}


	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
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
