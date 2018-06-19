

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class Client {

	public static void main(String[] args) {

		 
		//Creazione Francesco La Gala
		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        Indirizzo i1= new Indirizzo ("vico lopa",18,"casamarciano","80032","NA","campania");
        Date d1= new Date("12/12/1990");
        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
        Persona p1= new Persona ("francesco","la gala",d1,i1);
        System.out.println("Nome= "+p1.getNome()+"\nCognome= "+p1.getCognome());
        System.out.println(p1.getIndirizzo().toString()+"Età= "+ Utility.calcolaEta(p1));

        //Creazione Angelo Clemente
        //Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        Indirizzo indirizzoAngelo= new Indirizzo ("Fratelli Pisaniello",2,"San Martino Valle Caudina","83018","AV","Campania");
        Date dataAngelo= new Date("12/12/1993");
        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
        Persona personaAngelo= new Persona ("Angelo","Clemente",dataAngelo,indirizzoAngelo);
        System.out.println(personaAngelo.getIndirizzo().toString()+"Età= "+ Utility.calcolaEta(personaAngelo));
        System.out.println("Nome= "+personaAngelo.getNome()+"\nCognome= "+personaAngelo.getCognome());
        
        // Creazione Domenico Guida
        Date dataDomenico = new Date("18/06/1989");
        Indirizzo indirizzoDomenico = new Indirizzo("Via Campitiello", 4, "Limatola", "82030", "BN", "Campania");
        Persona personaDomenico = new Persona ("Domenico", "Guida", dataDomenico, indirizzoDomenico);
        System.out.println("**********");
        System.out.println("Nome e Cognome: "+ personaDomenico.getNome() + " " + personaDomenico.getCognome());
        System.out.println(personaDomenico.getIndirizzo().toString());
        System.out.println("Età: "+ Utility.calcolaEta(personaDomenico));

		// Creazione persona - Giacomo Ferraiuolo
		Indirizzo indirizzo = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");
		Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
		int eta = Utility.calcolaEta(nascita);
		System.out.println("********** "+giacomo.getNome()+" "+giacomo.getCognome()+" **********\n"+
				indirizzo.toString()+"\nEtà = "+eta+" anni");

		//Creazione Gabriella Conte
        Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
        System.out.println("******* Gabriella Conte ******");
        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
        System.out.println("Indirizzo: "+gabriella.getIndirizzo());
        System.out.println("Età: "+Utility.calcolaEta(new Date("18/05/1988"))+" anni\n");
        
        
        
        //creazione persona pagliaro
        Indirizzo indirizzoPagliaro= new Indirizzo ("via dante",3,"montecalvo irpino","83037","AV","campania");
        Date nascitaPagliaro = new Date("13/07/1988");
        Persona pagliaro= new Persona ("Antonio","Pagliaro",nascitaPagliaro,indirizzoPagliaro);
        
        //stampa persona
        System.out.println("***Antonio Pagliaro***");
        System.out.println(pagliaro.getNome()+" "+pagliaro.getCognome());
        System.out.println("Indirizzo: "+pagliaro.getIndirizzo());
        System.out.println("Età: "+Utility.calcolaEta(pagliaro.getDataDiNascita())+" anni");
       
        
        //creazione fabio spagnuolo
        Date d3=new Date("27/06/1995");
        Indirizzo i3=new Indirizzo ("via variante est",2,"avellino ","83030","av","campania");
        Persona p3=new Persona("Fabio", "spagnuolo", d3 , i3);
         System.out.println(p3.getNome()+ p3.getCognome() +p3.getIndirizzo());
        
        // Creazione persona - Fabio Irno
        Indirizzo indirizzo1 = new Indirizzo("Corso Caracciolo",70,"Mercato San Severino","84085","Salerno","Campania");
 		Date nascita1 = new Date("01/03/1987");
 		Persona fabio = new Persona("Fabio","Irno",nascita1,indirizzo1);
		System.out.println(fabio.getNome()+" "+fabio.getCognome()+"\n"+indirizzo1.toString()+"Età = "+Utility.calcolaEta(nascita1)+" anni");
		
				

		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(gabriella);
        lista.add(personaDomenico);
        lista.add(personaAngelo);
        lista.add(p1);
        lista.add(giacomo);
        lista.add(fabio);
        lista.add(pagliaro);
        lista.add(p3);
        
       
        ArrayList<Persona> residentiInCampania=ResidentiCampania.listaPersoneCampania(lista);
        System.out.println("Persone residenti in campania");
        for(Persona p : residentiInCampania) {
        	System.out.println("Nome: "+p.getNome()+" Cognome: "+p.getCognome());
        }
    
	}

}
