package it.uiip.test.Rubrica;

import java.sql.Connection;
import java.sql.SQLException;

public class Client {

    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {	
    	Connection connessione = Connessione.openConnection();
    	Contatto contatto = new Contatto("3283465777","Francesca","Capasso",4);
    	
    	Query.insertContatto(connessione, contatto);
    	
    	Connessione.closeConnection(connessione);
    	
//        Contatto c1 = new Contatto("3179499319","Giacomo","Esposito",1);
//        App a = new App();
//        a.insert(c1);
//        System.out.println(c1.toString());
        
    }

}
