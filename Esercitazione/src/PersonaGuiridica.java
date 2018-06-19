import java.util.Date;

public class PersonaGuiridica extends Persona{

	private String personaGruiridica;

	public PersonaGuiridica(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo,
			String personaGruiridica) {
		super(nome, cognome, dataDiNascita, indirizzo);
		this.personaGruiridica = personaGruiridica;
	}
	
	
}
