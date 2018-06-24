package esercizio.Biblioteca;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class Connessione {
	
        private String driverClassName;
		private String url;
		private String username;
		private String password;
		
		
	
	public Connessione() {
			driverClassName = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/Biblioteca";
			username = "root";
			password = "root";
		}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public static Connection openConnection() {
		
		
		
		Connessione connessione = new Connessione();		
		Connection connection = null;

		try {
			connection = (Connection) DriverManager.getConnection(connessione.getUrl(),connessione.getUsername(),connessione.getPassword());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
