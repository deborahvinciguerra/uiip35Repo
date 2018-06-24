package esercizio.Biblioteca;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Connessione {

	
	public static Connection openConnection() {
		
		Utility u = new Utility();
		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection(u.url, u.username, u.password);
			System.out.println("Connessione aperta!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(java.sql.Connection connessione) {
		
		if (connessione != null) {
			try {
				connessione.close();
				System.out.println("Connessione chiusa!");
			} catch (SQLException e) {}
		}
	}

}
