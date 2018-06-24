package it.uiip.test.biblioteca;

public class TestBiblioteca {

	public static void main(String[] args) {

		DBConnectionUtility dbUtil=new DBConnectionUtility();

		Biblioteca biblioteca = new Biblioteca();

		biblioteca.setConnectionData(dbUtil);

		Libro l = new Libro(2, "Harry", true, 6);

		Autore a = new Autore(2, "Luca", "Verdi");

		//Inserimento libro in biblioteca
		biblioteca.insertLib(l);

		//Inserimento Autore in biblioteca
		biblioteca.insertAut(a);

		//Associazione libro autore
		biblioteca.inserScritto(a, l);

		System.out.println("Ricerca per Titolo");
		biblioteca.ricercaTitolo("Harry");

		System.out.println("Ricerca libri disponibili");
		biblioteca.ricercaDisponibili();

		System.out.println("Ricerca per Autore");
		biblioteca.ricercaAutore("Luca", "Verdi");

		//Creazione e inserimento Tessera
		Tessera t = new Tessera(2, "Domenico", "Guida", "Via...");
		biblioteca.insertTess(t);

		System.out.println("Prestito Libro");
		biblioteca.insertPrestito(l, t);

		//Creazione Libro2, inserimento in biblioteca e associazione autore
		Libro l2 = new Libro(3, "Signore", true, 3);
		biblioteca.insertLib(l2);
		biblioteca.inserScritto(a, l2);

		//Prestito Libro2 alla stessa tessera
		System.out.println("Prestito Libro");
		biblioteca.insertPrestito(l2, t);

		//Creazione Libro3 non disponibile per verificare il metodo prestito
		Libro l3 = new Libro(4, "Codice", false, 2);
		biblioteca.insertLib(l3);
		biblioteca.insertAut(a);
		biblioteca.insertPrestito(l3, t);




	}

}
