import java.util.ArrayList;

public  class ResidentiCampania {

	public  static ArrayList<Persona> listaPersoneCampania(ArrayList<Persona> listaPersone){

		ArrayList<Persona> tmp=new ArrayList<Persona>();

		for(Persona p: listaPersone)
			if (p.getIndirizzo().getRegione().equalsIgnoreCase("campania"))
				tmp.add(p);

		return tmp; 


	}



}
