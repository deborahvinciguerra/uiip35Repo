package it.uiip.pagliaro.Biblioteca;


//classe per la gestione dell'eccezione relativa alla non disponibilità del libro cercato
public class LibroNonDisponibileException extends Exception {
	
	public LibroNonDisponibileException(String msg) {
		System.out.println(msg);
	}

}
