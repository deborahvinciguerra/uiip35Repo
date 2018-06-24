package it.uiip.main.Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Biblioteca {
	
	DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	public void insert(Lettori lettori){

		String sql = "INSERT INTO LETTORI " +
				"(tessera, nome, cognome) VALUES (?, ?, ?)";
		Connection conn = null;
		
		try {
		
				
			

			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
			java.sql.PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setString(1, utente.getNumero());
			ps.setInt(1, lettori.getTessera());
			ps.setString(2, lettori.getNome());
			ps.setString(3, lettori.getCognome());
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} 
//		catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	//fine insert
	public void visualizzaAnagrafica(Lettori lettori) {
		

		String sql = "Select nome, cognome from Lettori "
				+ "where tessera="+lettori.getTessera();
		Connection conn = null;
		
		try {
			

			try {
				conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      while(rs.next()){
			    //Retrieve by column name
		         String nome = rs.getString("nome");
		         String cognome = rs.getString("cognome");
		        

		         //Display values
		         System.out.print("Nome: " + nome);
		         System.out.print(" - Cognome: " + cognome);
		      }
		      //STEP 6: Clean-up environment
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

}//fineAnagrafica
	
	
	
	
	public void insert(LibroAutore lb){

		String sql = "INSERT INTO LibroAutore " +
				"(idAutore, idLibro) VALUES (?, ?)";
		Connection conn = null;
		
		try {
		
				
			

			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
			java.sql.PreparedStatement ps = conn.prepareStatement(sql);
			//ps.setString(1, utente.getNumero());
			ps.setInt(1, lb.getIdAutore());
			ps.setInt(2, lb.getdLibro());
		
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} 

		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	//fine inserimento
	
	
	public void insert(Libri libro){

		String sql = "INSERT INTO Libri " +
				"(idLibro, titolo, autori, numeroCopie, lettori) VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;
		
		try {
		
				
			

			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
			java.sql.PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, libro.getIdLibro());
			ps.setString(2, libro.getTitolo());
			ps.setInt(3, libro.getAutori());
			ps.setInt(4, libro.getNumeroCopie());
			ps.setInt(5, libro.getLettori());
		
			
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} 

		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	//fine inserimento
	
	
	
	
	
	
	
	
	
public void visualizzaALibro() {
		

		String sql = "select l.titolo, a.nomeAutore ,l.numeroCopie from Libri as l " + 
				"inner join Autori as a on l.autori = a.idAutore;" ;
		Connection conn = null;
		
		try {
			

			try {
				conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery(sql);

			      //STEP 5: Extract data from result set
			      while(rs.next()){
			    //Retrieve by column name
		         String titolo = rs.getString("l.titolo");
		         String autori = rs.getString("a.nomeAutore");
		         int numeroC = rs.getInt("l.numeroCopie");
		        

		         //Display values
		         System.out.print("Titolo: " + titolo);
		         System.out.print(" - Autori: " + autori);
		         System.out.print(" - Numero di copie: " + numeroC + "\n");
		      }
		      //STEP 6: Clean-up environment
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

}//fine visualizzazione Libro
	
public void visualizzaALibro(String tit) {
	

	String sql = "select l.titolo, a.nomeAutore from Libri as l " + 
	           "inner join Autori as a on l.autori = a.idAutore " +
			"where l.titolo= " +"'"+ tit +"'";
	Connection conn = null;
	
	try {
		

		try {
			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    //Retrieve by column name
	         String titolo = rs.getString("l.titolo");
	         String autori = rs.getString("a.nomeAutore");
	         //int numeroC = rs.getInt("numeroCopie");
	        

	         //Display values
	         System.out.print("Titolo: " + titolo);
	         System.out.print(" - Autori: " + autori);
	        // System.out.print(" - Numero di copie: " + numeroC + "\n");
	      }
	      //STEP 6: Clean-up environment
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

}//fine visualizzazione libro per titolo	
	
public void visualizzaALibroPerAutore(String nome) {
	

	String sql = "select l.titolo, l.numeroCopie from Libri as l "+
			"inner join Autori as a on l.autori = a.idAutore "+
			 "where a.nomeAutore =  " + "'"+ nome + "'";
	Connection conn = null;
	
	try {
		

		try {
			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    //Retrieve by column name
		    	  String titolo = rs.getString("l.titolo");
	         //int autori = rs.getInt("autori");
	         int numeroC = rs.getInt("l.numeroCopie");
	        

	         //Display values
	         System.out.print("Titolo: " + titolo);
	         //System.out.print(" - Autori: " + autori);
	         System.out.print(" - Numero di copie: " + numeroC + "\n");
	      }
	      //STEP 6: Clean-up environment
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

}//fine visualizzazione libro per autore
	
	
	
public void prestito(Libri libro, Lettori lettori) throws EccezionePrestito {
	
  this.visualizzaALibro(libro.getTitolo());
  if(libro.getNumeroCopie()>0) {
	  System.out.println("\nPrestito effettuato all'utente con tessera:  " + lettori.getTessera());
	  Libri l = new Libri(libro.getIdLibro(), libro.getTitolo(), libro.getAutori(), (libro.getNumeroCopie()-1), lettori.getTessera());
	  
	  
  }else {
	  throw new EccezionePrestito();
  }
	

}//fine visualizzazione prestito
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
