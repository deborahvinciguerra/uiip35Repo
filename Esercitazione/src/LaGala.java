import java.util.ArrayList;

public class LaGala {

	public  static void piuGiovanePiuAnziano(ArrayList<Persona> listaPersone){

		int eta=0;
		int min=200;
		Persona maggiore= new Persona();
		Persona minore= new Persona();

			for (Persona q: listaPersone) {
				if (Utility.calcolaEta(q)>eta){
			        eta= Utility.calcolaEta(q);
			        maggiore =q;
					
				    }
                if (Utility.calcolaEta(q)<min) {
                	min= Utility.calcolaEta(q);
                			minore=q;
				    	
				    }
				}

			

		
		
		
		System.out.println("Il più anziano è "+maggiore.getNome()+" "+maggiore.getCognome());
		System.out.println("Il più giovane è "+minore.getNome()+" "+minore.getCognome());
	}

}
