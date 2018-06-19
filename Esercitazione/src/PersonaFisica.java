import java.util.Date;

public class PersonaFisica extends Persona {

	private String codiceFiscale;

	public PersonaFisica(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String codiceFiscale) {
		super(nome, cognome, dataDiNascita, indirizzo);
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
}
