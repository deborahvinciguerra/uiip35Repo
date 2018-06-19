import java.util.ArrayList;

public class Irno {


	public static String cercaMaggiore(ArrayList<Persona> list) {
//classe calcolo maggiore minore
		Persona max = null;

		int i = 0;

		String str = " ";

		for ( Persona persona : list ) {
			if(Utility.calcolaEta(persona)>i) {
			i = Utility.calcolaEta(persona);
			max = persona;
			str = "La persona di età maggiore è :" + persona.getNome() + " " + persona.getCognome();
			}
		}
		return str;
	}

	public static String cercaMinore(ArrayList<Persona> list) {

		Persona min = null;

		int i = 1000;

		String str = " ";

		for ( Persona persona : list ) {
			if(Utility.calcolaEta(persona)<i) {
			i = Utility.calcolaEta(persona);
			min = persona;
			str = "La persona di età minore è :" + persona.getNome() + " " + persona.getCognome();
			}
		}
		return str;
	}

}
