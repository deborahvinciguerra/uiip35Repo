

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Client {

	public static void main(String[] args) {
		//public Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
		
		Indirizzo indirizzo = new Indirizzo("Fratelli Pisaniello", 2, "San martino valle caudina", "83018", "AV", "Campania");
		Indirizzo indirizzo2 = new Indirizzo("Fratelli Guida", 2, "San martino valle caudina", "83018", "AV", "Campania");
		Indirizzo indirizzo3 = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        
		Indirizzo i1= new Indirizzo ("vico lopa",18,"casamarciano","80032","NA","campania");
        Indirizzo i2= new Indirizzo ("vico lopa",18,"ostia","80032","RO","lazio");
        Indirizzo indirizzo1 = new Indirizzo("Corso Caracciolo",70,"Mercato San Severino","84085","Salerno","Campania");
		Date nascita1 = new Date("01/03/1987");
		Persona fabio = new Persona("Fabio","Irno",nascita1,indirizzo1);
      
		
		Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
		Date data = new Date("12/12/1993");
		Persona myPersona1 = new Persona("Angelo", "Clemente", data, indirizzo);

        Date x = new Date("18/06/1989");
        
        Indirizzo y = new Indirizzo("Via Campitiello", 4, "Limatola", "82030", "BN", "Campania");
        

        Persona d = new Persona ("Domenico", "Guida", x, y);
        
        System.out.println("Nome e Cognome: "+ d.getNome() + " " + d.getCognome());
        System.out.println("Indirizzo: " + d.getIndirizzo().toString());
        System.out.println("Età: "+ Utility.calcolaEta(d));
	        
	    Date d1= new Date("12/12/1990");
	        
	        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
	    Persona p1= new Persona ("francesco","la gala",d1,i1);
	    Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
	
		
		
		Utility u;
		u = new Utility();
		System.out.println("Nome: " + myPersona1.getNome());
		System.out.println("Cognome: " + myPersona1.getCognome());
		System.out.println("Indirizzo: " + myPersona1.getIndirizzo());
		
		System.out.println("eta: " + Utility.calcolaEta(myPersona1));
		
		ArrayList<Persona> lista = new ArrayList<Persona>();
		lista.add(myPersona1);
		lista.add(giacomo);
		lista.add(gabriella);
		lista.add(fabio);
		lista.add(d);
//		ArrayList<Persona> temp = ResidentiCampania.listaPersoneCampania(lista);
//		
//		System.out.println(temp);
		
		
		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
		
	 
 
        
        String str = "Persona: \n";
		for(Persona per: lista) {
			str = str + per.getNome() + " - " + per.getCognome() + "\n";
		}
		
		System.out.println(str);
	}

}
