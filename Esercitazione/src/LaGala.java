import java.util.ArrayList;

public class LaGala {

	public  static void piuGiovanePiuAnziano(ArrayList<Persona> listaPersone){

		Persona tx= new Persona();

		for(Persona p: listaPersone) {
			for (Persona q: listaPersone) {
				if (Utility.calcolaEta(p)<Utility.calcolaEta(q))
			{tx=p;
					p=q;
				    q=tx;}
				}

			

		}
		
		
		System.out.println("Il più anziano è "+listaPersone.get(0).getNome());
		System.out.println("Il più giovane è "+listaPersone.get((listaPersone.size()-1)).getNome());
	}

}
