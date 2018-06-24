package it.uiip.main.Biblioteca;

public class Test {
	public static void main(String[] args) throws EccezionePrestito {
		
		DBConnectionUtility dbUtil=new DBConnectionUtility();
		Biblioteca b = new Biblioteca();
		Autori a = new Autori(3, "Stephen King");
		
	     Lettori l = new Lettori(5555, "Michele", "Pippo");
		
		b.setConnectionData(dbUtil);
		//inserimento tabella Lettori
		b.insert(l);
		//visualizza l
		b.visualizzaAnagrafica(l);
		
		LibroAutore lb= new LibroAutore(1, 6);
		//inserimento nella tabella LibroAutore
		b.insert(lb);
		
		
		Libri libr = new Libri(7, "It", 3, 15, 2222);
		//inserimento nella colonna dei libri
		b.insert(libr);
		
		System.out.println("\n");
		//metodo per visualizzare tutti i libri
		b.visualizzaALibro();
		
		System.out.println("\n");
		//visualizza libro per titolo
		b.visualizzaALibro("Harry Potter e la pietra filosofale");
		System.out.println("\n");
		//visualizza libro per autore
		b.visualizzaALibroPerAutore("Jonathan Swift");
		
		//prestito
		try {
			System.out.println("\n");
		b.prestito(libr, l);
		}catch (EccezionePrestito e) {
			System.out.println("\n");
			System.out.println(e.getMessage());
		}

	}

}
