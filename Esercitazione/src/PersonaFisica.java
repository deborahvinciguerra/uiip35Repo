


	
	
import java.util.Date;

	public class PersonaFisica {
		
		

		private String nome;
		private String cognome;
		private Date dataDiNascita;
		private Indirizzo indirizzo;
		private String codiceFiscale;
		
		public PersonaFisica(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo,String codiceFiscale) {
			this.nome = nome;
			this.cognome = cognome;
			this.dataDiNascita = dataDiNascita;
			this.indirizzo = indirizzo;
			this.codiceFiscale=codiceFiscale;
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

		public Date getDataDiNascita() {
			return dataDiNascita;
		}

		public void setDataDiNascita(Date dataDiNascita) {
			this.dataDiNascita = dataDiNascita;
		}

		public Indirizzo getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(Indirizzo indirizzo) {
			this.indirizzo = indirizzo;
		}

	}


