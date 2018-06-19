import java.io.LineNumberInputStream;
import java.util.Date;
import java.util.*;

public class Client {

	public static void main(String[] args) {

		//Indirizzo(String via, int civico, String citta, String cap, String provincia, String regione)
        Indirizzo i1= new Indirizzo ("via roma",22,"napoli","80125","NA","campania");
        
        Date d1= new Date(1990,4,22);
        
        
        //Persona(String nome, String cognome, Date dataDiNascita, Indirizzo indirizzo, String regione)
        Persona p1= new Persona ("francesco","la gala",d1,i1);
        
        Date x = new Date("18/06/1989");
        
        Indirizzo y = new Indirizzo("Via Campitiello", 4, "Limatola", "82030", "BN", "Campania");
        
        Persona d = new Persona ("Domenico", "Guida", x, y);
        
        Utility u = new Utility();
        
        System.out.println("Nome e Cognome: "+ d.getNome() + " " + d.getCognome());
        System.out.println("Indirizzo: " + d.getIndirizzo().toString());
        System.out.println("Età: "+ u.calcolaEta(d));
        
        ArrayList <Persona> lista = new ArrayList<Persona>();
        lista.add(d);
        ResidentiCampania.listaPersoneCampania(lista);
        System.out.println("Persone residenti in Campania: ");
        for(Persona p : lista) {
        System.out.println(p.getNome() + " " + p.getCognome()+"\n");
        }
       
        
        
        

	}

}
