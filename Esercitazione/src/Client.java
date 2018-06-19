import java.util.ArrayList;
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
        System.out.println(p1.getIndirizzo().toString()+"Età= "+u1.calcolaEta(p1));
        
        
        
        Indirizzo i2= new Indirizzo ("vico lopa",18,"ostia","80032","RO","lazio");

        Persona p2= new Persona ("antonio","Pagliaro",d1,i2);
        
        ArrayList<Persona> listaPersone=new ArrayList<Persona>();
        listaPersone.add(p1);
        listaPersone.add(p2);
        
        
        System.out.println(ResidentiCampania.listaPersoneCampania(listaPersone));
        
        
       

	}

}
