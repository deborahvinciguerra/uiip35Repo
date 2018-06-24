package it.uiip.pagliaro.Biblioteca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Biblioteca {
	Connection conn=null;

	
	/*
	 * metodo per la visualizzazione di tutti i libri presenti in biblioteca
	 * e dei relativi autori
	 */
	
	public void visualizzaElencoLibri(){

		String sql = "select l.titolo,a.nome,a.cognome,l.numeroCopie from Libro as l " + 
				"inner join scrittura as s on l.isbn=s.isbnLibro " + 
				"inner join autore as a on s.idAutore=a.id;";

		try {
			conn=DBConnectionUtility.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()){
				String titolo = rs.getString("titolo");
				String nomeAutore=rs.getString("nome");
				String cognomeAutore=rs.getString("cognome");
				int numeroCopie=rs.getInt("numeroCopie");

				System.out.println("Titolo = "+titolo+"| Autore = "+nomeAutore+" "
						+cognomeAutore+"| Copie disponibili = "+numeroCopie);


			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} 
		finally {
			if (conn != null) {
				try {
					DBConnectionUtility.closeConnection();
				} catch (SQLException e) {}
			}
		}
	}

	
/*
 * metodo di riceca del libro in base al titolo
 */

	public void ricercaLibroPerTitolo(String titolo){

		String sql = "select titolo,numeroCopie,isbn from Libro " + 
				"where titolo='"+titolo+"';";

		try {
			conn=DBConnectionUtility.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()){
				String titoloLibro = rs.getString("titolo");
				String isbn=rs.getString("isbn");
				int numeroCopie=rs.getInt("numeroCopie");

				System.out.println("Titolo = "+titoloLibro+"| ISBN = "+isbn+"| Copie disponibili = "+numeroCopie);


			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} 
		finally {
			if (conn != null) {
				try {
					DBConnectionUtility.closeConnection();
				} catch (SQLException e) {}
			}
		}
	}

	/*
	 * metodo di riceca di un libro in base al nome e al cognome dell'autore
	 */

	public void ricercaLibroPerAutore(String nomeAutore,String cognomeAutore){

		String sql = "select l.titolo,l.numeroCopie from Libro as l\r\n" + 
				"inner join scrittura as s on l.isbn=s.isbnLibro\r\n" + 
				"inner join autore as a on s.idAutore=a.id\r\n" + 
				"where a.nome='"+nomeAutore+"' and a.cognome='"+cognomeAutore+"';";
		System.out.println("Libri trovati per l'autore "+nomeAutore+" "+cognomeAutore);

		try {
			conn=DBConnectionUtility.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()){
				String titoloLibro = rs.getString("titolo");
				int numeroCopie=rs.getInt("numeroCopie");

				System.out.println("Titolo = "+titoloLibro+"| Copie disponibili = "+numeroCopie);

			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} 
		finally {
			if (conn != null) {
				try {
					DBConnectionUtility.closeConnection();
				} catch (SQLException e) {}
			}
		}
	}
	
	


	/*
	 * Il metodo prestitoLibro riceve come parametri formali un oggetto di tipo Libro e un 
	 * oggetto di tipo Tessera.
	 *	Viene effettuata una ricerca del libro per titolo e se è presente vengono effettuate
	 * due operazioni:
	 * - update , in modo da decrementare il numero di copie del libro
	 * - insert, per l'inserimento di una riga nella tabella Prestito
	 *    per indicare l'avvenuto prestito tramite isbn del libro e id della tessera
	 *    
	 *    E' possibile prenotare lo stesso libro con la stessa tessera, finchè il libro è disponibile
	 *    Per evitare di prenotare lo stesso libro con la stessa tessera
	 *    la tabella prestito dovrebbe avere come chiave primaria la coppia isbnLibro e idTessera
	 *    
	 *    
	 *    Se il libro non è disponibile( numero di copie = 0) viene lanciata una eccezione
	 *    per indicare che il libro non è disponibile
	 */


	public void prestitoLibro(Libro libro,Tessera tessera) throws LibroNonDisponibileException {
		String sql = "select titolo,numeroCopie,isbn from Libro " + 
				"where titolo='"+libro.getTitolo()+"';";

		try {
			conn=DBConnectionUtility.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);
			while(rs.next()){
				int numeroCopie=rs.getInt("numeroCopie");

				if(numeroCopie>0) {
					numeroCopie--;
					String updateLibro = "UPDATE  LIBRO "
							+ "SET NUMEROCOPIE='"+numeroCopie+"'"+
							" WHERE TITOLO='"+libro.getTitolo()+"';";

					PreparedStatement ps2=conn.prepareStatement(updateLibro);
					ps2.executeUpdate();

					String insertPrestito = "INSERT INTO Prestito (isbnLibro,idTessera)"
							+ " VALUES (?, ?);";
					ps2=conn.prepareStatement(insertPrestito);
					ps2.setString(1, libro.getIsbn());
					ps2.setInt(2, tessera.getId());


					ps2.executeUpdate();

					System.out.println("Libro Prestato");
					ps2.close();

				}
				else {
					throw new LibroNonDisponibileException("Non sono disponibili copie del libro cercato");
				}

			}
			rs.close();
			ps.close();


		} catch (SQLException e) {
			throw new RuntimeException(e);

		} 
		finally {
			if (conn != null) {
				try {
					DBConnectionUtility.closeConnection();
				} catch (SQLException e) {}
			}
		}

	}

}
