package Rubrica.RubricaTelefo;


import java.sql.SQLException;

import java.sql.*;

import java.sql.Connection;

public class Connessione {
	
	
	
	

	public static void main(String[] args) {
		Connection connection=null;
		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		
		String connectionString = "jdbc:mysql://localhost:3306/RubricaTelefo?user=root&password=root";
		String query="INSERT INTO utente (numTel, nome, cognome, smartphone) VALUES" + 
				"('3472201396', 'Fabio','Spagnuolo', 5)";
		 
		 
		try {
			connection = DriverManager.getConnection(connectionString) ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			PreparedStatement prepared = connection.prepareStatement(query);
			 prepared.executeUpdate();
			 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}

