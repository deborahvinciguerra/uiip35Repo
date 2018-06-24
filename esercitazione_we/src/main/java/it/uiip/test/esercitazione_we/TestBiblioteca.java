package it.uiip.test.esercitazione_we;


public class TestBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnectionUtility dbUtil = new DBConnectionUtility();
		
		Biblioteca biblioteca = new Biblioteca();
		
		Autori autore = new Autori("Pippo","Rossi",10);
		
		biblioteca.setConnectionData(dbUtil);
		
		biblioteca.insert(autore);
		biblioteca.visualizzaAutore(autore);
		
		//public Libri(String titolo, int numCopie, int iDAutore, int iDlibro)
		Libri libro = new Libri("Titoloprova",3,10,10);
		
		biblioteca.insertLibri(libro);
		biblioteca.visualizzaLibri(libro);
		
		//public Lettori(int iDLettore, String tessera, String nome, String indirizzo)
		
		Lettori lettore = new Lettori(23,"1234","Marco","Bivio Rosto");
		
		biblioteca.insertLettor(lettore);
		biblioteca.visualizzaLettore(lettore);
		
		//public Prestito(int idPrestito, int iDLibro, int iDLettore)
		
		Prestito prestito = new Prestito(44,10,23);
		
		biblioteca.insertPrestito(prestito);
		biblioteca.visualizzaPrestito(prestito);
		
			

	}

}
