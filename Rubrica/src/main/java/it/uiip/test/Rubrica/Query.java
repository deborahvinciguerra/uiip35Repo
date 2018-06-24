package it.uiip.test.Rubrica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Query {
	
	public static void insertContatto(Connection connessione, Contatto contatto) throws SQLException {
		
		String sql = "INSERT INTO Contatto " +
				"(numCell, nome, cognome, smartphone) VALUES (?, ?, ?, ?)";
		
		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		ps.setString(1, contatto.getNumCell());
		ps.setString(2, contatto.getNome());
		ps.setString(3, contatto.getCognome());
		ps.setInt(4, contatto.getSmartphone());
		ps.executeUpdate();
		
	}

}
