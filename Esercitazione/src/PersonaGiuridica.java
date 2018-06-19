import javax.xml.crypto.Data;

public class PersonaGiuridica {
	
	private String nomeAzienda;
	private Data annoDiFondazione;
	private String ragioneSociale;
	private Indirizzo indirizzo;
	public PersonaGiuridica(String nomeAzienda, Data annoDiFondazione, String ragioneSociale, Indirizzo indirizzo) {
		super();
		this.nomeAzienda = nomeAzienda;
		this.annoDiFondazione = annoDiFondazione;
		this.ragioneSociale = ragioneSociale;
		this.indirizzo = indirizzo;
	}
	public String getNomeAzienda() {
		return nomeAzienda;
	}
	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}
	public Data getAnnoDiFondazione() {
		return annoDiFondazione;
	}
	public void setAnnoDiFondazione(Data annoDiFondazione) {
		this.annoDiFondazione = annoDiFondazione;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	

}
