import java.util.Date;

public class PersonaFisica extends Persona{

	private String personaFisica;

	public PersonaFisica(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String personaFisica) {
		super(nome, cognome, dataDiNascita, indirizzo);
		this.personaFisica = personaFisica;
	}
	
	
}
