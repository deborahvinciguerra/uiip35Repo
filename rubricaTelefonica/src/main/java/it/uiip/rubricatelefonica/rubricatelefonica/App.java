package it.uiip.rubricatelefonica.rubricatelefonica;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

import java.sql.Connection;

public class App {

	public static void main(String[] args) {

		Connection connection=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String connectionString = "jdbc:mysql://localhost:3306/RubricaTelefonica?user=root&password=root";
		String query = "INSERT INTO contatto (numCell, nome, cognome, smartphone) VALUES" + 
				"('3279499319', 'Giacomo','Ferraiuolo', 1)";


		try {
			connection = DriverManager.getConnection(connectionString) ;
		} 
		
		catch (SQLException e) {
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
