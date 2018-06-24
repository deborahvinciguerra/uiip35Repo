package it.uiip.pagliaro.Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtility {
	private static final String url="jdbc:mysql://localhost:3306/biblioteca";
	private static final String username="root";
	private static final String password="root";
	private static Connection conn=null;
	
	public static Connection getConnection() throws SQLException {
		 return conn=DriverManager.getConnection(url,username,password);

	}
	
	public static void closeConnection() throws SQLException {
		conn.close();
	}

	

}
