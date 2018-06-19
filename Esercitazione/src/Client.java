import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Date;


public class Client {

	public static void main(String[] args) {

		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        Indirizzo i1= new Indirizzo ("vico lopa",18,"casamarciano","80032","NA","campania");
        
        Date d1= new Date("12/12/1990");
        
        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
        Persona p1= new Persona ("francesco","la gala",d1,i1);
        
        Utility u1 = new Utility ();
        
        System.out.println("Nome= "+p1.getNome()+"\nCognome= "+p1.getCognome());
        System.out.println(p1.getIndirizzo().toString()+"Et�= "+u1.calcolaEta(p1));
        


		// Creazione persona - Giacomo Ferraiuolo
		Indirizzo indirizzo = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");
		Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
		Utility u = new Utility();
		int eta = u.calcolaEta(nascita);

		System.out.println(giacomo.getNome()+" "+giacomo.getCognome()+"\n"+
				indirizzo.toString()+"Et� = "+eta+" anni");

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		listaPersone.add(giacomo);


        Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
        Utility ut = new Utility();
        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
        System.out.println("Et�: "+ut.calcolaEta(new Date("18/05/1988"))+" anni");
        System.out.println("Indirizzo: "+gabriella.getIndirizzo());
        listaPersone.add(gabriella);
        
        
        Indirizzo i2= new Indirizzo ("vico lopa",18,"ostia","80032","RO","lazio");

        Persona p2= new Persona ("antonio","Pagliaro",d1,i2);
        
        ArrayList<Persona> persone=new ArrayList<Persona>();
        persone.add(p1);
        persone.add(p2);
        
        
        System.out.println(ResidentiCampania.listaPersoneCampania(persone));
        
        
       
     // Creazione persona - Fabio Irno
        Indirizzo indirizzo1 = new Indirizzo("Corso Caracciolo",70,"Mercato San Severino","84085","Salerno","Campania");
		Date nascita1 = new Date("01/03/1987");
		Persona fabio = new Persona("Fabio","Irno",nascita1,indirizzo1);
		Utility uf = new Utility();
		int eta1 = u.calcolaEta(nascita1);

		System.out.println(fabio.getNome()+" "+fabio.getCognome()+"\n"+
				indirizzo.toString()+"Et� = "+eta1+" anni");
		
				
		listaPersone.add(fabio);
		
		System.out.println("\n");
        
		for(int i=0; i<listaPersone.size(); i++)
			System.out.println(ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getNome()+" "+
					ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getCognome()+"\n"+
					ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getIndirizzo().toString());


		
		
	}

}
