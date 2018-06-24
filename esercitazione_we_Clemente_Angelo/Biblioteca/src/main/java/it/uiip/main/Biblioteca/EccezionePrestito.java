package it.uiip.main.Biblioteca;

public class EccezionePrestito extends Exception {
	public EccezionePrestito() {
		super("\nNumero di copie finite");
	}
}
