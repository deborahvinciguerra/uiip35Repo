package it.uiip.rubricatelefonica.rubricaTelefonica;

import java.sql.DriverManager;
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
		
		String connectionString = "jdbc:mysql://localhost:3306/RubricaTelefonica?user=root&password=root";
		       String query="INSERT INTO contact (number, name, surname, smartphone) VALUES" + 
				"('42433', 'Francesco','La Gala', 5)";
		
		 
		 
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
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
