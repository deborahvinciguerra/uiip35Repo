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
        
        
       

        List<Persona> lista = new ArrayList<Persona>();
        Persona gabriella = new Persona("Gabriella","Conte",new Date(1988,5,18),new Indirizzo("via amatucci",14,"Avellino","83100","AV","Campania"));
        Utility ut = new Utility();
        System.out.println(gabriella.getNome()+" "+gabriella.getCognome());
        System.out.println("Et�: "+ut.calcolaEta(new Date("18/05/1988"))+" anni");
        System.out.println("Indirizzo: "+gabriella.getIndirizzo());
        lista.add(gabriella);
        
        for(int i=0;i<lista.size();i++)
        	System.out.println(ResidentiCampania.listaPersoneCampania((ArrayList<Persona>) lista).get(i).getNome());

	}

}
