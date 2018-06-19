import java.util.Date;

public class Utility {


			public static int calcolaEta(Date annoNascita) {
			int eta;
			Date date = new Date();
			int anno = date.getYear();
			eta = anno - annoNascita.getYear();
			return eta;
			}
			
			public static int calcolaEta(Persona persona) {
				return calcolaEta(persona.getDataDiNascita());
				}

			
			// Test di verifica funzionamento
			public static void main(String[] args) {
				Utility u = new Utility();
				Date nascita = new Date("12/12/1993");
				System.out.println(u.calcolaEta(nascita));
			}



}
