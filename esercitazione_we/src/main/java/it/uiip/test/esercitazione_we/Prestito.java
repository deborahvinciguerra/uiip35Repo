package it.uiip.test.esercitazione_we;

import java.util.Date;

public class Prestito {
	
	int IdPrestito,IDLibro,IDLettore;

	public Prestito(int idPrestito, int iDLibro, int iDLettore) {
		super();
		IdPrestito = idPrestito;
		IDLibro = iDLibro;
		IDLettore = iDLettore;
	}
	

	public int getIdPrestito() {
		return IdPrestito;
	}

	public void setIdPrestito(int idPrestito) {
		IdPrestito = idPrestito;
	}

	public int getIDLibro() {
		return IDLibro;
	}

	public void setIDLibro(int iDLibro) {
		IDLibro = iDLibro;
	}

	public int getIDLettore() {
		return IDLettore;
	}

	public void setIDLettore(int iDLettore) {
		IDLettore = iDLettore;
	}
	
	

}
