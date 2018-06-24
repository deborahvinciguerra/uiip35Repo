package Biblioteca.biblioteca;

public class Testbiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnectionUtility dbUtil=new DBConnectionUtility();

	/*Query1 search=new Query1();
	    search.setConnectionData(dbUtil);
         search.visualizzaLibriDisponibili();*/
		
	/*Query2 query=new Query2();
		query.setConnectionData(dbUtil);
		query.visualizzaperTitolo("Fisica2");*/
		
	Query3 research=new Query3();
     research.setConnectionData(dbUtil);
		research.visualizzaperAutore("Hallyday","Resnick");
	
	}

}
