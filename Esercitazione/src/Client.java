import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Client {

	public static void main(String[] args) {

		
		//public Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
		
		Indirizzo indirizzo = new Indirizzo("Fratelli Pisaniello", 2, "San martino valle caudina", "83018", "AV", "Campania");
		Indirizzo indirizzo2 = new Indirizzo("Fratelli Guida", 2, "San martino valle caudina", "83018", "AV", "Campania");
		//public Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo)
		Date data = new Date("12/12/1993");
		
		Persona myPersona1 = new Persona("Angelo", "Clemente", data, indirizzo);
		Persona myPersona2 = new Persona("Domenico", "Guida", data, indirizzo);
		
		Utility u = new Utility();
		System.out.println("Nome: " + myPersona1.getNome());
		System.out.println("Cognome: " + myPersona1.getCognome());
		System.out.println("Indirizzo: " + myPersona1.getIndirizzo());
		
		System.out.println("eta: " + u.calcolaEta(myPersona1));
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(myPersona1);
		lista.add(myPersona2);
//		ArrayList<Persona> temp = ResidentiCampania.listaPersoneCampania(lista);
//		
//		System.out.println(temp);
		String str = "Persona: \n";
		for(Persona per: lista) {
			str = str + per.getNome() + " - " + per.getCognome() + "\n";
		}
		
		System.out.println(str);

	}

}
