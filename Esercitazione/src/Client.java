import java.io.LineNumberInputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		
	 
		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        Indirizzo i1= new Indirizzo ("vico lopa",18,"casamarciano","80032","NA","campania");
        
        Date d1= new Date("12/12/1990");
        
        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
        Persona p1= new Persona ("francesco","la gala",d1,i1);
        

        Date x = new Date("18/06/1989");
        
        Indirizzo y = new Indirizzo("Via Campitiello", 4, "Limatola", "82030", "BN", "Campania");
        
        Persona d = new Persona ("Domenico", "Guida", x, y);
        
        System.out.println("Nome e Cognome: "+ d.getNome() + " " + d.getCognome());
        System.out.println("Indirizzo: " + d.getIndirizzo().toString());
        System.out.println("Età: "+ Utility.calcolaEta(d));
        
  
      
        System.out.println("Nome= "+p1.getNome()+"\nCognome= "+p1.getCognome());
        System.out.println(p1.getIndirizzo().toString()+"Età= "+Utility.calcolaEta(p1));
        
       
        List<Persona> lista = new ArrayList<Persona>();
        Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
 
        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
        System.out.println("Età: "+Utility.calcolaEta(new Date("18/05/1988"))+" anni");
        System.out.println("Indirizzo: "+gabriella.getIndirizzo());
        lista.add(gabriella);
        lista.add(d);
        lista.add(p1);
        for(int i=0;i<lista.size();i++)
        	System.out.println(ResidentiCampania.listaPersoneCampania((ArrayList<Persona>) lista).get(i).getNome());


	}

}
