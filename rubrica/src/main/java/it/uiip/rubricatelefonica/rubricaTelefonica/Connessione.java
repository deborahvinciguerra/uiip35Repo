package it.uiip.rubricatelefonica.rubricaTelefonica;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.*;

import java.sql.Connection;

public class Connessione {
	
	
	
	

	public static void main(String[] args) {
		Connection connection=null;
		
		String connectionString = "jdbc:mysql://localhost:3306/rubrica_telefonica?user=root&password=root";
		String query="INSERT INTO contatto(numCell,nome,cognome,modelloTel) VALUES" + 
				"('3459248306', 'Gabriella','Conte', 1)";
		
		
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		
		
		
		connection = DriverManager.getConnection(connectionString) ;

		} 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
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
