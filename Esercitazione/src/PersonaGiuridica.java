


	public class PersonaGiuridica {
		


		private String nome;
		
		private Indirizzo indirizzo;
		private String partitaIva;
		
		public PersonaGiuridica(String nome, Indirizzo indirizzo,String partitaIva) {
			this.nome = nome;
			this.indirizzo = indirizzo;
			this.partitaIva=partitaIva;
		}
		
			public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Indirizzo getIndirizzo() {
			return indirizzo;
		}

		public void setIndirizzo(Indirizzo indirizzo) {
			this.indirizzo = indirizzo;
		}

	}


