import java.util.ArrayList;

public class Spagnuolo {

	public static String trovaMinimo(ArrayList<Persona> list) {
	        int persona1=Utility.calcolaEta(list.get(0));
	        String str =list.get(0).getNome()+ list.get(0).getCognome();
	        for(Persona p:list) {
	        	int persona2=Utility.calcolaEta(p);
	        	if(persona2<persona1) {
	        		persona1=persona2;
	        		str=p.getNome() + p.getCognome();
	        	}
	        }return str;
			
		}
	public static String trovaMassimo(ArrayList<Persona> list) {
   
		int persona1=Utility.calcolaEta(list.get(0));
        String str =list.get(0).getNome()+ list.get(0).getCognome();
        for(Persona p:list) {
        	int persona2=Utility.calcolaEta(p);
        	if(persona2>persona1) {
        		persona1=persona2;
        		str=p.getNome() + p.getCognome();
        	}
        }return str;
		
	}
		
		
		
	        }
	
		
		
		
		
		
	
	
	
	
	
	
	
	
	

