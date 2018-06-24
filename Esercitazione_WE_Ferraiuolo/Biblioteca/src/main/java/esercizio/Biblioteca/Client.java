package esercizio.Biblioteca;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Client 
{
	public static void main( String[] args ) throws SQLException
	{
		Connection connessione = Connessione.openConnection();
		
		// Ricerca dei libri in base a "parole chiave", il metodo usa una query dove la condizione usa un like
		Scanner input = new Scanner(System.in);
		System.out.println("\nInserire Titolo del libro:");
		String risposta = input.nextLine();
		ArrayList<LibroAutore> ricerca = Query.ricercaLibriByTitolo(connessione, risposta);
		System.out.println("Libri trovati: ");
		for (int i=0; i<ricerca.size(); i++) {
			System.out.println((i+1)+". ID: "+ricerca.get(i).idLibro+", Titolo: "+ricerca.get(i).titolo+
					" - Autore: "+ricerca.get(i).nomeAutore+" "+ricerca.get(i).cognomeAutore);
		}

		// Ricerca dei libri in base al cognome dell'autore
		System.out.println("\nInserire Autore del libro [cognome]:");
		String risposta2 = input.nextLine();
		ArrayList<LibroAutore> ricerca2 = Query.ricercaLibroByAutore(connessione, risposta2);
		System.out.println("Libri trovati: ");
		for (int i=0; i<ricerca2.size(); i++) {
			System.out.println((i+1)+". ID: "+ricerca2.get(i).idLibro+", Titolo: "+ricerca2.get(i).titolo+
					" - Autore: "+ricerca2.get(i).nomeAutore+" "+ricerca2.get(i).cognomeAutore);
		}
		
		// Prenotazione di un libro, bisogna introdurre l'identificativo della propria tessera e 
		// il titolo (esatto - la query nella condizione usa un = ) del
		// libro che si vuole prenotare
		System.out.println("\nInserire ID tessera: ");
		String risposta4 = input.nextLine();
		System.out.print("Inserire titolo del libro da prenotare:\n");
		String risposta3 = input.nextLine();
		boolean prestito = Query.prenotaLibro(connessione, risposta4, risposta3);
		if (prestito == true) {
			System.out.println("Prestito effettuato!");
		}
		else {
			System.out.println("Libro non disponibile!");
		}

		// Visualizzazione di tutte le prenotazioni effettuate
		System.out.println("\nElenco libri prestati: ");
		ArrayList<Prenotazione> ricerca3 = Query.viewPrestiti(connessione);
		for (int i=0; i<ricerca3.size(); i++) {
			System.out.println((i+1)+". ID: "+ricerca3.get(i).idPrenotazione+", "+ricerca3.get(i).nome+
								" "+ricerca3.get(i).cognome+" - Libro prenotato: "+ricerca3.get(i).titolo);
		}
		
		input.close();
		Connessione.closeConnection(connessione);
	}
}
