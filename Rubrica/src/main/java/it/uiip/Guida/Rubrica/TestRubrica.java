package it.uiip.Guida.Rubrica;

public class TestRubrica {

	public static void main(String[] args) {
	
		DBConnectionUtility dbUtil=new DBConnectionUtility();
		Rubrica rubrica = new Rubrica();
		
		Utente u=new Utente("3471", "Domenico", "Guida", 3);
//		int id, String nome, String ram, String cpu, int displayPpi, String displaySize,
//		String displayResolution, String size, int weight, String notes, int brand, int opSys
		Smartphone s = new Smartphone(20, "alcatel", "2Gb", "2.3 GHz quad-core CPU", 250, "4.7", "1080x1920", "146x70x9", 160, " ", 4, 1 );
		
		rubrica.setConnectionData(dbUtil);
		
		rubrica.insert(u);
		rubrica.visualizzaAnagrafica(u);
		rubrica.visualizzaTelefono(u);
		

	}

}
