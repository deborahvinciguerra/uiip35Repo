import java.util.List;
import java.util.ArrayList;

public class Conte {

	
	public String piuVecchio(ArrayList<Persona> lista) {
		String str = "";
		Persona persona = null;
		int max = 0;
		for(Persona p: lista) {
			if(Utility.calcolaEta(p) < max) {
				persona = p;
				max = Utility.calcolaEta(p);
			}
		}
		str += "La persona più vecchia è: "+persona.getNome()+" "+persona.getCognome();
		return str;
	}
	
	public String piuGiovane(ArrayList<Persona> lista) {
		String str = "";
		Persona persona = null;
		int min = 100;
		for(Persona p: lista) {
			if(Utility.calcolaEta(p) > min) {
				persona = p;
				min = Utility.calcolaEta(p);
			}
		}
		str += "La persona più giovane è: "+persona.getNome()+" "+persona.getCognome();
		return str;
	}
	
	
	
}
