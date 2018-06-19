import java.util.Calendar;
import java.util.Scanner;

public class Persona {
	
	public int calcolaEta() {
	Scanner input = new Scanner(System.in);
	System.out.println("Inserisci l'anno di nascita: ");
	int nascita = input.nextInt();
	int eta;
	Calendar date = Calendar.getInstance();
	int anno = date.get(Calendar.YEAR);
	eta = anno - nascita;
	return eta;
	}

}
