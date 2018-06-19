import java.util.ArrayList;

public class ResidentiCampania {

	public ArrayList<Persona> listaPersoneCampania(ArrayList<Persona> listaPersone){
		
		ArrayList<Persona> tmp=new ArrayList<Persona>();
		
		for(Persona p: listaPersone)
			if (p.getIndirizzo().getRegione().equalsIgnorecase("campania"))
				tmp.add(p);
		
		return tmp;
		
		
	}
	
	
	
}
