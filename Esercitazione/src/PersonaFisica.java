
public class PersonaFisica {
	
	public String codiceFiscale;

	public PersonaFisica(String codiceFiscale) {
		
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "PersonaFisica [codiceFiscale=" + codiceFiscale + "]";
	}
	
	
	
	
	
	

}
