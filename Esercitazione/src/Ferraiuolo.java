import java.util.ArrayList;

public class Ferraiuolo {
	
	// Metodo per il calcolo della persona più giovane
	public static Persona cercaYounger(ArrayList<Persona> elenco) {
		Persona piuGiovane = null;
		int minore = 0;
		for (int i=0; i<elenco.size(); i++) {
			int eta = Utility.calcolaEta(elenco.get(i).getDataDiNascita());
			if (eta>minore){
				minore = eta; 
				piuGiovane = elenco.get(i);
			}
		}
		return piuGiovane;
	}
	
	// Metodo per il calcolo della persona più anziana
	public static Persona cercaOlder(ArrayList<Persona> elenco) {
		Persona piuAnziano = null;
		int maggiore = 100;
		for (int i=0; i<elenco.size(); i++) {
			int eta = Utility.calcolaEta(elenco.get(i).getDataDiNascita());
			if (eta<maggiore){
				maggiore = eta; 
				piuAnziano = elenco.get(i);
			}
		}
		return piuAnziano;
	}

}
