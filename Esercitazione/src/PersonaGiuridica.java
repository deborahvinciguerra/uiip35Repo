import java.util.Date;

public class PersonaGiuridica extends Persona{

	private String ragioneSociale;

	public PersonaGiuridica(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo,
			String ragioneSociale) {
		super(nome, cognome, dataDiNascita, indirizzo);
		this.ragioneSociale = ragioneSociale;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	
	
}
