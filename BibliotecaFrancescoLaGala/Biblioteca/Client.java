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
		Scanner s = new Scanner(System.in);
//		System.out.println("\nInserire nome autore:");
//		String r = s.nextLine();
//		System.out.println("\nInserire cognome autore:");
//		String r1 = s.nextLine();
//		LibroAutore la = Query.ricercaLibroPerAutore(connessione, r, r1);
//		System.out.println(la.toString());
//		
//		
//		System.out.println("\nInserire titolo:");
//		String r3 = s.nextLine();
//		LibroAutore la2 = Query.ricercaLibroPerTitolo(connessione, r3);
//		System.out.println(la2.toString());
//		s.close();
		
		System.out.println("\nInserire titolo:");
	    String r5 = s.nextLine();
	    System.out.println("\nInserire idTessera:");
	    String r4 = s.nextLine();
	    
		LibroAutore la2 = Query.prenotazioneLibroPerTitolo(connessione, r5, r4);
		s.close();
		
		
		
		connessione.close();
		
		
		
		
		
		
		
		
	}
}
