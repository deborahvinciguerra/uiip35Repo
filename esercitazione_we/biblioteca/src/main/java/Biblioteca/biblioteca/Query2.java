package Biblioteca.biblioteca;



import java.sql.*;

public class Query2 {

DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	public void visualizzaperTitolo(String title ) {
		String sql="select * from libro where titolo =" + "'" +title+ "'";
	
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
		         String idBook = rs.getString("idBook");
		         String numcopia=rs.getString("numcopia");
	           
		         System.out.println("\n"+" titolo:"+ titolo);
		         System.out.print(" idBook:" + idBook);
		         System.out.println(" numerocopia:"+numcopia);
		         System.out.print("disponibile " + disponibilità+"\n");
		               
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
	

