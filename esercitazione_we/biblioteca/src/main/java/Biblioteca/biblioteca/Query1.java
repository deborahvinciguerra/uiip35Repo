package Biblioteca.biblioteca;

import java.sql.*;
public class Query1 {

DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	
	public void visualizzaLibriDisponibili() {
		
		String sql="select libro.titolo, autore.nome,autore.cognome,libro.numcopia from libro "
				+ "inner join redattoDa on libro.idBook=redattoDa.idBook "
				+ "inner join autore on autore.idAuthor=redattoDa.idAuthor  "
				+ "where disponibilità ='si'";
		
		Connection conn=null;
		
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery(sql);

			 
				//Estrazione dati e visualizzazione
			      while(rs.next()){
			     String titolo=rs.getString("titolo");
		         String nome = rs.getString("nome");
		         String cognome = rs.getString("cognome");
		         String numcopia=rs.getString("numcopia");
	           
		         System.out.print("Nome: " + nome);
		         System.out.print(" Cognome: " + cognome);
		         System.out.println(" titolo:"+ titolo);
		         System.out.println(" numerocopia:"+numcopia);
		      }
		     
			     //Chiusura connessione
		      rs.close();
		      ps.close();
		      conn.close();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
				
		
		
		
		
	}
	
	
	
	
	

