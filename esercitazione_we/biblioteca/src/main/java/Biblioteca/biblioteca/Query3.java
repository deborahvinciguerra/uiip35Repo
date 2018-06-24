package Biblioteca.biblioteca;

import java.sql.*;


public class Query3 {

	
DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	public void visualizzaperAutore(String name,String surname){
		String sql="select libro.titolo,libro.disponibilità  from libro "
				+ "inner join redattoDa on libro.idBook=redattoDa.idBook "
				+ "inner join autore on autore.idAuthor=redattoDa.idAuthor "
				+ "where (autore.nome ="+"'"+name+"' and autore.cognome="+"'"+surname+"')";
		
		
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
		         String disponibilità = rs.getString("disponibilità");
		         
		         System.out.println("\n"+" titolo:"+ titolo);
		         System.out.print("disponibile:" + disponibilità+"\n");
		    
		        
		      
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
	
	
	
	
	
	
	
	
	
	
	
	

