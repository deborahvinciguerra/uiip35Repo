import java.io.LineNumberInputStream;
import java.util.ArrayList;
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



		// Creazione persona - Giacomo Ferraiuolo
		Indirizzo indirizzo = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");
		Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
		int eta = Utility.calcolaEta(nascita);

		System.out.println(giacomo.getNome()+" "+giacomo.getCognome()+"\n"+
				indirizzo.toString()+"Età = "+eta+" anni");

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		listaPersone.add(giacomo);



        Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
 
//        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
//        System.out.println("Età: "+Utility.calcolaEta(new Date("18/05/1988"))+" anni");
//        System.out.println("Indirizzo: "+gabriella.getIndirizzo());

        listaPersone.add(gabriella);
        
        
        
        //creazione persona pagliaro
        Indirizzo indirizzoPagliaro= new Indirizzo ("via dante",3,"montecalvo irpino","83037","AV","campania");
        Date nascitaPagliaro = new Date("13/07/1988");
        Persona pagliaro= new Persona ("Antonio","Pagliaro",nascitaPagliaro,indirizzoPagliaro);
        
        //stampa prima
        System.out.println(pagliaro.getNome()+" "+pagliaro.getCognome());
        System.out.println("Età: "+Utility.calcolaEta(pagliaro.getDataDiNascita())+" anni");
        System.out.println("Indirizzo: "+pagliaro.getIndirizzo());
        
        ArrayList<Persona> persone=new ArrayList<Persona>();
        persone.add(p1);
        persone.add(pagliaro);
     
        
        //stampa persone campane
        ArrayList<Persona> personeCampane=ResidentiCampania.listaPersoneCampania(persone);
        System.out.println("Persone residenti in campania");
        for(Persona p : personeCampane) {
        	System.out.println("Nome: "+p.getNome()+" Cognome: "+p.getCognome());
        }
        
        //creazione fabio spagnuolo
        Date d3=new Date("27/06/1995");
        Indirizzo i3=new Indirizzo ("via variante est",2,"avellino ","83030","av","campania");
        Persona p3=new Persona("Fabio", "spagnuolo", d3 , i3);
         System.out.println(p3.getNome()+ p3.getCognome() +p3.getIndirizzo());
        
        
        
       
     // Creazione persona - Fabio Irno
        Indirizzo indirizzo1 = new Indirizzo("Corso Caracciolo",70,"Mercato San Severino","84085","Salerno","Campania");
		Date nascita1 = new Date("01/03/1987");
		Persona fabio = new Persona("Fabio","Irno",nascita1,indirizzo1);
			
		System.out.println(fabio.getNome()+" "+fabio.getCognome()+"\n"+
				indirizzo1.toString()+"Età = "+Utility.calcolaEta(nascita1)+" anni");
		
				
		listaPersone.add(fabio);
		
		
		
		
		
		
		
		System.out.println("\n");
        
		// Stampa della lista delle persone residenti in campania
		List<Persona> personeTrovate = new ArrayList<Persona>();
		personeTrovate = ResidentiCampania.listaPersoneCampania(listaPersone);
		
		for(int i=0; i<listaPersone.size(); i++)
			System.out.println(personeTrovate.get(i).getNome()+" "+
					personeTrovate.get(i).getCognome()+"\n"+
					personeTrovate.get(i).getIndirizzo().toString());


		

	}

}
