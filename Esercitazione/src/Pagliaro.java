import java.util.ArrayList;

public class Pagliaro {

	public static void piuGiovane(ArrayList<Persona> listaPersone) {
		Persona piuGiovane=listaPersone.get(0);
		System.out.println("init "+piuGiovane.getCognome());
		for(Persona p : listaPersone) {
			if(Utility.calcolaEta(p)<Utility.calcolaEta(piuGiovane)) {
				System.out.println("si!");
				piuGiovane=p;
			}
		}
		
		System.out.println("La persona più giovane è "+piuGiovane.getNome()+" "+piuGiovane.getCognome());
	}

	
	
	public static void piuAnziana(ArrayList<Persona> listaPersone) {
		Persona piuAnziana=listaPersone.get(0);
		for(Persona p : listaPersone) {
			if(Utility.calcolaEta(p)>Utility.calcolaEta(piuAnziana)) {
				piuAnziana=p;
			}
		}
		
		System.out.println("La persona più anziana è "+piuAnziana.getNome()+" "+piuAnziana.getCognome());
	}

}
