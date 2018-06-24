package it.uiip.pagliaro.Biblioteca;

public class TestBiblioteca {

	public static void main(String[] args) throws LibroNonDisponibileException {

		Biblioteca b= new Biblioteca();
		
		//test della visualizzazione di tutti i libri presenti
		b.visualizzaElencoLibri();
		
		System.out.println();
		
	
		//test della visualizzazione di un libro ricercato per autore
		b.ricercaLibroPerAutore("Roberto", "Saviano");
		
		//test della visualizzazione di un libro ricercato per titolo
		b.ricercaLibroPerTitolo("architetture dei calcolatori");
		
		//creazione degli oggetti libro e tessera da passare al metodo prestitoLibro
		Libro libro=new Libro("789", "La teoria del tutto", 3);
		Tessera tessera=new Tessera(1, "Maria","Rossi","via dante");
		
		//test del metodo prestitoLibro
		b.prestitoLibro(libro,tessera);
		
		
		//visualizzazione del libro prenotato con il numero di copie che risulta decrementato
		b.ricercaLibroPerTitolo(libro.getTitolo());

	}

}
