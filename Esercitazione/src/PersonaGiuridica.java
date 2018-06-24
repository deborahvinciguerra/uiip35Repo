
public class PersonaGiuridica {
	
	public String nomeAzienda;

	public PersonaGiuridica(String nomeAzienda) {
		super();
		this.nomeAzienda = nomeAzienda;
	}

	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}

	@Override
	public String toString() {
		return "PersonaGiuridica [nomeAzienda=" + nomeAzienda + ", getNomeAzienda()=" + getNomeAzienda()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
