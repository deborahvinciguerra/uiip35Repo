import java.util.*;

public class Guida {
	
	public static String cercaMaggiore(ArrayList<Persona> lista) {
		Persona maggiore = null;
		int i = 0;
		String str = "";
		for(Persona p : lista) {
			if(Utility.calcolaEta(p)>i) {
				i = Utility.calcolaEta(p);
			    maggiore = p;
			    str ="Il maggiore �: "+ p.getNome()+ " " + p.getCognome();
			}
		}return str;
	}
	
	public static String cercaMinore(ArrayList<Persona> lista) {
		Persona minore =null;
		int i = 1000;
		String str = "";
		for(Persona p : lista) {
			if(Utility.calcolaEta(p)<i) {
				i = Utility.calcolaEta(p);
			    minore = p;
			    str ="Il minore �: "+ p.getNome()+ " " + p.getCognome();
			}
		}return str;
	}

}
