
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Client {

	public static void main(String[] args) {
		//public Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
		
		Indirizzo indirizzo = new Indirizzo("Fratelli Pisaniello", 2, "San martino valle caudina", "83018", "AV", "Campania");
		Indirizzo indirizzo2 = new Indirizzo("Fratelli Guida", 2, "San martino valle caudina", "83018", "AV", "Campania");
		Indirizzo indirizzo3 = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");
		
		Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
		Date data = new Date("12/12/1993");
		Persona myPersona1 = new Persona("Angelo", "Clemente", data, indirizzo);
		Persona myPersona2 = new Persona("Domenico", "Guida", data, indirizzo);
		Indirizzo i1= new Indirizzo ("vico lopa",18,"casamarciano","80032","NA","campania");
	        
	    Date d1= new Date("12/12/1990");
	        
	        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
	    Persona p1= new Persona ("francesco","la gala",d1,i1);

		
		Utility u;
		u = new Utility();
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
		
		
		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        
        System.out.println("Nome= "+p1.getNome()+"\nCognome= "+p1.getCognome());
        System.out.println(p1.getIndirizzo().toString()+"Età= "+u.calcolaEta(p1));
        


		// Creazione persona - Giacomo Ferraiuolo
		
		Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
		u = new Utility();
		int eta = u.calcolaEta(nascita);

		System.out.println(giacomo.getNome()+" "+giacomo.getCognome()+"\n"+
				indirizzo.toString()+"Età = "+eta+" anni");
		lista.add(giacomo);


        
        Utility ut = new Utility();
        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
        System.out.println("Età: "+ut.calcolaEta(new Date("18/05/1988"))+" anni");
        System.out.println("Indirizzo: "+gabriella.getIndirizzo());
        lista.add(gabriella);
        
        String str = "Persona: \n";
		for(Persona per: lista) {
			str = str + per.getNome() + " - " + per.getCognome() + "\n";
		}
		
		System.out.println(str);
	    
	}

}
