import java.util.Date;

public class PersonaGiuridica {
	
	private String nomeAzienda;
	private String regioneSociale;
	private Indirizzo indirizzo;
	
	
	public PersonaGiuridica(String nomeAzienda, String regioneSociale, Indirizzo indirizzo) {
		super();
		this.nomeAzienda = nomeAzienda;
		this.regioneSociale = regioneSociale;
		this.indirizzo = indirizzo;
	}
	
	
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public String getRegioneSociale() {
		return regioneSociale;
	}
	public void setRegioneSociale(String regioneSociale) {
		this.regioneSociale = regioneSociale;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	

	
	
}
