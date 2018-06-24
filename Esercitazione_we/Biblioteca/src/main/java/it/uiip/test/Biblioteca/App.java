package it.uiip.test.Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class App 
{
	private Utility connectionUtility;

	public void setConnection(Utility connectionUtility) {
		this.connectionUtility = connectionUtility;
	}

	//visualizzare l'elenco dei libri disponibili (titoli, autori e numero di copie)
	public ArrayList<Scrittura> visualizzaLibri() throws SQLException{

		String sql = "select l.titolo, a.nome, a.cognome, l.numCopie from Libro as l " + 
				"	inner join Scrittura as s on s.idLib = l.idLibro" + 
				"    inner join Autore as a on a.idAutore = s.idA" + 
				"    where numCopie > 0;";
		Connection conn = null;

		conn = DriverManager.getConnection(connectionUtility.getUrl(), connectionUtility.getUsername(), connectionUtility.getPassword());
		List<Scrittura> elencoLibriTrovati = new ArrayList<Scrittura>();
		Scrittura libro;
		PreparedStatement ps = conn.prepareStatement(sql);			
		ResultSet rs = ps.executeQuery(sql);

		while(rs.next()) {
			libro = new Scrittura(
					rs.getInt("idLibro"),
					rs.getString("titolo"),
					rs.getString("nome"),
					rs.getString("cognome"),
					rs.getInt("numCopie"));
			elencoLibriTrovati.add(libro);
		}
		rs.close();
		ps.close();
		conn.close();

		return (ArrayList<Scrittura>) elencoLibriTrovati;
	}

	//Ricerca libri per titolo
	public ArrayList<Scrittura> ricercaPerTitolo(String titolo) throws SQLException{
		String sql = "select l.*, a.nome, a.cognome from Libro as l " + 
				"	inner join Scrittura as s on s.idLib = l.idLibro " + 
				"    inner join Autore as a on a.idAutore = s.idA " + 
				"    where l.titolo = '"+titolo+"%';";
		Connection conn = null;

		conn = DriverManager.getConnection(connectionUtility.getUrl(), connectionUtility.getUsername(), connectionUtility.getPassword());
		List<Scrittura> elencoLibriTrovati = new ArrayList<Scrittura>();
		Scrittura libro1 = null;
		PreparedStatement ps = conn.prepareStatement(sql);			
		ResultSet rs = ps.executeQuery(sql);

		while(rs.next()) {
			libro1 = new Scrittura(
					rs.getInt("idLibro"),
					rs.getString("titolo"),
					rs.getString("nome"),
					rs.getString("cognome"),
					rs.getInt("numCopie"));
			elencoLibriTrovati.add(libro1);
		}
		rs.close();
		ps.close();
		conn.close();

		return (ArrayList<Scrittura>) elencoLibriTrovati;
	}

	//Ricerca libri per autore
	public ArrayList<Scrittura> ricercaPerAutore(String cognomeAutore) throws SQLException{
		String sql = "select l.*, a.nome, a.cognome from Libro as l " + 
				"	inner join Scrittura as s on s.idLib = l.idLibro " + 
				"    inner join Autore as a on a.idAutore = s.idA " + 
				"    where a.cognome = '"+cognomeAutore+"';";
		Connection conn = null;

		conn = DriverManager.getConnection(connectionUtility.getUrl(), connectionUtility.getUsername(), connectionUtility.getPassword());
		List<Scrittura> elencoLibriTrovati = new ArrayList<Scrittura>();
		Scrittura libro;
		PreparedStatement ps = conn.prepareStatement(sql);			
		ResultSet rs = ps.executeQuery(sql);

		while(rs.next()) {
			libro = new Scrittura(
					rs.getInt("idLibro"),
					rs.getString("titolo"),
					rs.getString("nome"),
					rs.getString("cognome"),
					rs.getInt("numCopie"));
			elencoLibriTrovati.add(libro);
		}
		rs.close();
		ps.close();
		conn.close();

		return (ArrayList<Scrittura>) elencoLibriTrovati;
	}

	//Metodo che inserisce una prenotazione
	public void prenotaLibro(Tessera tessera, Libro libro){

		String sql = "INSERT INTO PRESTITO " +
				"(idT, idL) VALUES ("+tessera.getIdTessera()+","+libro.getIdLibro()+")";
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(connectionUtility.getUrl(), connectionUtility.getUsername(), connectionUtility.getPassword());
			if(libro.getNumCopie()>0) {
				PreparedStatement ps = conn.prepareStatement(sql);
				int temp = libro.getNumCopie();
				temp--;
				System.out.println("Libro prenotato");
				ps.executeUpdate();
				ps.close();
			}
			else {
				System.out.println("Numero copie terminato");
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}


}