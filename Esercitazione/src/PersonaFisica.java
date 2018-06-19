import java.util.Date;

public class PersonaFisica extends Persona {
	
	// Parametri della classe persona
	private String codiceFiscale;
	private String dataMorte;
	
	public PersonaFisica() {
		super();
		this.codiceFiscale = codiceFiscale;
		this.dataMorte = dataMorte;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getDataMorte() {
		return dataMorte;
	}

	public void setDataMorte(String dataMorte) {
		this.dataMorte = dataMorte;
	}
	
	
	


}
