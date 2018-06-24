package it.uiip.test.Biblioteca;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaClient {

	public static void main(String[] args) throws SQLException {
		
		App app = new App();
		Utility ut = new Utility();
		
		app.setConnection(ut);
		
		Libro l1 = new Libro(200, "Il barone rampante", 5);
		Libro l2 = new Libro(201, "David Copperfield", 3);
		Libro l3 = new Libro(202, "Don Chisciotte della Mancia", 1);
		Libro l4 = new Libro(203, "Harry Potter e la pietra filosofale", 4);
		Libro l5 = new Libro(204, "Harry Potter e la camera dei segreti", 2);
		Libro l6 = new Libro(205, "Harry Potter e il prigioniero di Azkaban", 3);
		Libro l7 = new Libro(206, "Harry Potter e il calice di fuoco", 1);
		Libro l8 = new Libro(207, "La fine è il mio inizio", 6);
		
		Autore a1 = new Autore(100, "Italo", "Calvino");
		Autore a2 = new Autore(101, "Charles", "Dickens");
		Autore a3 = new Autore(102, "Miguel", "de Cervantes");
		Autore a4 = new Autore(103, "Joanne Kathleen", "Rowling");
		Autore a5 = new Autore(104, "Tiziano", "Terzani");
		Autore a6 = new Autore(105, "Folco", "Terzani");
		
		Scrittura s1 = new Scrittura(l1,a1);
		Scrittura s2 = new Scrittura(l2,a3);
		Scrittura s3 = new Scrittura(l3,a3);
		Scrittura s4 = new Scrittura(l4,a4);
		Scrittura s5 = new Scrittura(l5,a4);
		Scrittura s6 = new Scrittura(l6,a4);
		Scrittura s7 = new Scrittura(l7,a4);
		Scrittura s8 = new Scrittura(l8,a5);
		Scrittura s9 = new Scrittura(l8,a6);
		
		Tessera t1 = new Tessera(3, "Mario","Rossi","Via Garibaldi");
		
		List<Scrittura> elenco = app.ricercaPerAutore("Calvino");
		
		elenco.add(s1);
		elenco.add(s2);
		elenco.add(s3);
		elenco.add(s4);
		elenco.add(s5);
		elenco.add(s6);
		elenco.add(s7);
		elenco.add(s8);
		elenco.add(s9);
		
		//app.prenotaLibro(t1, l8);
		
		for(int i=0;i<elenco.size();i++) {
			System.out.println(elenco.get(i));
		}

		elenco = app.ricercaPerTitolo("Harry Potter e la pietra filosofale");
		for(int i=0;i<elenco.size();i++) {
			System.out.println(elenco.get(i));
		}
		
		elenco = app.visualizzaLibri();
		for(int i=0;i<elenco.size();i++) {
			System.out.println(elenco.get(i));
		}


	}

}
