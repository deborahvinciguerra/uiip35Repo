package it.uiip.pagliaro.Rubrica;

public class TestRubrica {

	public static void main(String[] args) {
	
		DBConnectionUtility dbUtil=new DBConnectionUtility();
		Rubrica rubrica = new Rubrica();
		
		Utente u=new Utente("toni", "pagliaro", "4343", 1);
		
		rubrica.setConnectionData(dbUtil);
		
		rubrica.insert(u);
		rubrica.visualizzaAnagrafica(u);
		

	}

}
