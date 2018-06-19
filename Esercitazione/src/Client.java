import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        

		// Creazione persona - Giacomo Ferraiuolo
		Indirizzo indirizzo = new Indirizzo("Via Carmelo Pezzullo",99,"Frattamaggiore","80027","Napoli","Campania");
		Date nascita = new Date("09/05/1989");
		Persona giacomo = new Persona("Giacomo","Ferraiuolo",nascita,indirizzo);
		Utility u = new Utility();
		int eta = u.calcolaEta(nascita);

		System.out.println(giacomo.getNome()+" "+giacomo.getCognome()+"\n"+
				indirizzo.toString()+"Età = "+eta+" anni");

		ArrayList<Persona> listaPersone = new ArrayList<Persona>();
		listaPersone.add(giacomo);

		for(int i=0; i<listaPersone.size(); i++)
			System.out.println(ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getNome()+" "+
					ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getCognome()+"\n"+
					ResidentiCampania.listaPersoneCampania(listaPersone).get(i).getIndirizzo().toString());
	}

}
