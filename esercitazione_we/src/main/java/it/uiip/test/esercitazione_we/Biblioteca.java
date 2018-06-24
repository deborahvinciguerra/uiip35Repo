package it.uiip.test.esercitazione_we;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {
	
	DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		
		this.dbUtil= dbUtil;
	}
	
	public void insert(Autori autore) {
		
		String sql = "INSERT INTO AUTORI " +    
				"(IDAutore,Cognome,Nome) VALUES (?, ?, ?)";
		Connection conn = null;
		
		try {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, autore.getIdAutore());
		ps.setString(2, autore.getCognome());
		ps.setString(3, autore.getNome());
					
		ps.executeUpdate();
		ps.close();
		
	} catch (SQLException e) {
		throw new RuntimeException(e);
		
	}
		
//		catch (ClassNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}
} // Fine metodo
		
public void visualizzaAutore(Autori autore) {
	
	String sql = "Select nome,cognome from AUTORI ";
			
	Connection conn = null;
	
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

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    //Retrieve by column name
	         String nome = rs.getString("nome");
	         String cognome = rs.getString("cognome");
	        

	         //Display values
	         System.out.print("Nome: " + nome);
	         System.out.print(", Cognome: " + cognome);
	         System.out.println("\n");
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
		
}// Fine metodo



// inserimento libri

public void insertLibri(Libri libro) {
	
	String sql = "INSERT INTO LIBRI " +
			"(IDLibro,IDAutore, Titolo,NumCopie) VALUES (?, ?, ? , ?)";
	Connection conn = null;
	
	try {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setInt(1, libro.getIDlibro());
	ps.setInt(2, libro.getIDAutore());
	ps.setString(3, libro.getTitolo());
	ps.setInt(4, libro.getNumCopie());
	
	//ps.setDouble(3, autore.getData_nascita());
		
	ps.executeUpdate();
	ps.close();
	
} catch (SQLException e) {
	throw new RuntimeException(e);
	
}
	
//	catch (ClassNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
finally {
	if (conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {}
	}
}
} // Fine metodo


public void visualizzaLibri(Libri libro) {
	
	String sql = "SELECT TITOLO, NumCopie FROM LIBRI ";
			
	Connection conn = null;
	
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

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    //Retrieve by column name
	         String titolo = rs.getString("Titolo");
	         int numCopie = rs.getInt("NumCopie");
	        

	         //Display values
	         System.out.print("Titolo: " + titolo);
	         System.out.print(", NumCopie: " + numCopie);
	         System.out.println("\n");
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
		
}// Fine metodo


// inserimento di lettori che prendono un libro
public void insertLettor(Lettori lettore) {
	
	String sql = "INSERT INTO LETTORI " +
			"(IDLettore,Tessera,Nome,Indirizzo) VALUES (?, ?, ? , ?)";
	Connection conn = null;
	
	try {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setInt(1, lettore.getIDLettore());
	ps.setString(2, lettore.getTessera());
	ps.setString(3, lettore.getNome());
	ps.setString(4, lettore.getIndirizzo());
	
	//ps.setDouble(3, autore.getData_nascita());
		
	ps.executeUpdate();
	ps.close();
	
} catch (SQLException e) {
	throw new RuntimeException(e);
	
}
	
//	catch (ClassNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
finally {
	if (conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {}
	}
}
} // Fine metodo


// Visualizza lettori che hanno preso e non preso un libro
public void visualizzaLettore(Lettori lettore) {
	
	String sql = "SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI\r\n" + 
			"FROM lettori l LEFT JOIN Prestiti p ON (l.IDLettore = p.IDLettore)\r\n" + 
			"GROUP BY l.Tessera, l.Nome,l.Indirizzo ";
			
	Connection conn = null;
	
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
			
			System.out.println("Lettori presenti nella bancadati del DB");
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		    //Retrieve by column name
	         String tessera= rs.getString("Tessera");
	         String nome = rs.getString("Nome");
	         String indirizzo = rs.getString("Indirizzo");
	         //int libro = rs.getInt("IDLibro");
	        

	         //Display values
	         System.out.print("Tessera: " + tessera);
	         System.out.print(", Nome: " + nome);
	         System.out.println(", Indirizzo: " + indirizzo);
	         //System.out.println(", Libro preso: " + libro);
	         System.out.println("\n");
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
		
}// Fine metodo

// inserimento di un prestito

public void insertPrestito(Prestito prestito) {
	
	String sql = "INSERT INTO PRESTITI " +
			"(IDPrestito,IDLibro,IDLettore) VALUES (?, ?, ?)";
	Connection conn = null;
	
	try {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
	PreparedStatement ps = conn.prepareStatement(sql);
	ps.setInt(1, prestito.getIdPrestito());
	ps.setInt(2, prestito.getIDLibro());
	ps.setInt(3, prestito.getIDLettore());
	
	
	//ps.setDouble(3, autore.getData_nascita());
		
	ps.executeUpdate();
	ps.close();
	
} catch (SQLException e) {
	throw new RuntimeException(e);
	
}
	
//	catch (ClassNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
finally {
	if (conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {}
	}
}
} // Fine metodo


// Visualizza utenti con libri in prestito
public void visualizzaPrestito(Prestito prestito) {
	
	String sql = "SELECT l.Tessera, l.Nome,l.Indirizzo, COUNT(p.IDLibro) AS LIBRI\r\n" + 
			" FROM Prestiti p INNER JOIN Lettori l ON (p.IDLettore=l.IDLettore) \r\n" + 
			" GROUP BY l.Tessera, l.Nome,l.Indirizzo ";
			
	Connection conn = null;
	
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

		      //STEP 5: Extract data from result set
			System.out.println("Lettori che hanno libri in prestito");
		      while(rs.next()){
		    //Retrieve by column name
	         String tessera= rs.getString("Tessera");
	         String nome = rs.getString("Nome");
	         String indirizzo = rs.getString("Indirizzo");
	         //int libro = rs.getInt("IDLibro");
	        

	         //Display values
	         System.out.print("Tessera: " + tessera);
	         System.out.print(", Nome: " + nome);
	         System.out.println(", Indirizzo: " + indirizzo);
	         //System.out.println(", Libro preso: " + libro);
	         System.out.println("\n");
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
		
}// Fine metodo

}
