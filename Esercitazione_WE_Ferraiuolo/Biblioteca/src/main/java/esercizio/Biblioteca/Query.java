package esercizio.Biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;

public class Query {

	// Metodo per la ricerca dei libri per titolo
	public static ArrayList<LibroAutore> ricercaLibriByTitolo(Connection connessione, String titolo) throws SQLException {

		String sql = "select libro.idLibro, libro.titolo, autore.nomeAutore, autore.cognomeAutore, libro.numCopie from libroautore as la \n" + 
				"	inner join autore on la.autore = autore.idAutore \n" + 
				"    inner join libro on la.libro = libro.idLibro \n" + 
				"    where libro.titolo like '%"+titolo+"%' ;";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		List<LibroAutore> libriTrovati = null;
		ResultSet rs = ps.executeQuery();
		libriTrovati = new ArrayList<LibroAutore>();
		LibroAutore libroTrovato = null;
		while (rs.next()) {
			libroTrovato = new LibroAutore(
					rs.getInt("idLibro"),
					rs.getString("titolo"), 
					rs.getInt("numCopie"),
					rs.getString("nomeAutore"),
					rs.getString("cognomeAutore")
					);
			libriTrovati.add(libroTrovato);
		}
		rs.close();
		return (ArrayList<LibroAutore>) libriTrovati;
	}

	// Metodo per la ricerca del libro per autore
	public static ArrayList<LibroAutore> ricercaLibroByAutore(Connection connessione, String autore) throws SQLException {

		String sql = "select libro.idLibro, libro.titolo, autore.nomeAutore, autore.cognomeAutore, libro.numCopie from libroautore as la \n" + 
				"	inner join autore on la.autore = autore.idAutore \n" + 
				"    inner join libro on la.libro = libro.idLibro \n" + 
				"    where autore.cognomeAutore like '%"+autore+"%' ;";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		List<LibroAutore> libriTrovati = null;
		ResultSet rs = ps.executeQuery();
		libriTrovati = new ArrayList<LibroAutore>();
		LibroAutore libroTrovato = null;
		while (rs.next()) {
			libroTrovato = new LibroAutore(
					rs.getInt("idLibro"),
					rs.getString("titolo"), 
					rs.getInt("numCopie"),
					rs.getString("nomeAutore"),
					rs.getString("cognomeAutore")
					);
			libriTrovati.add(libroTrovato);
		}
		rs.close();
		return (ArrayList<LibroAutore>) libriTrovati;
	}

	// Metodo per la ricerca di un libro per titolo
	public static ArrayList<LibroAutore> ricercaLibroByTitolo(Connection connessione, String titolo) throws SQLException {

		String sql = "select libro.idLibro, libro.titolo, autore.nomeAutore, autore.cognomeAutore, libro.numCopie from libroautore as la \n" + 
				"	inner join autore on la.autore = autore.idAutore \n" + 
				"    inner join libro on la.libro = libro.idLibro \n" + 
				"    where libro.titolo like '"+titolo+"' ;";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		List<LibroAutore> libriTrovati = null;
		ResultSet rs = ps.executeQuery();
		libriTrovati = new ArrayList<LibroAutore>();
		LibroAutore libroTrovato = null;
		while (rs.next()) {
			libroTrovato = new LibroAutore(
					rs.getInt("idLibro"),
					rs.getString("titolo"), 
					rs.getInt("numCopie"),
					rs.getString("nomeAutore"),
					rs.getString("cognomeAutore")
					);
			libriTrovati.add(libroTrovato);
		}
		rs.close();
		return (ArrayList<LibroAutore>) libriTrovati;
	}
	
	// Metodo per la prenotazione del libro
	public static boolean prenotaLibro(Connection connessione, String idTessera, String titolo) throws SQLException {
		ArrayList<LibroAutore> ricerca = ricercaLibroByTitolo(connessione, titolo);
		if (ricerca != null) {
			if (ricerca.get(0).numCopie == 0) {
				return false;
			}
			else {
				String sql = "update libro \n"+
						"	set numCopie = numCopie - 1 \n"+
						"	where libro.idLibro = "+ricerca.get(0).idLibro+";";

				PreparedStatement ps;
				ps = connessione.prepareStatement(sql);
				ps.executeUpdate();
				
				String sql2 = "insert into Prenotazione (Tessera, Libro) values"+
							"("+Integer.parseInt(idTessera)+","+ricerca.get(0).idLibro+")";
				
				PreparedStatement ps2;
				ps2 = connessione.prepareStatement(sql2);
				ps2.executeUpdate();
				
				return true;
			}
		}
		else {
			return false;
		}

	}
	
	// Metodo per la visualizzazione delle prenotazioni
	public static ArrayList<Prenotazione> viewPrestiti(Connection connessione) throws SQLException {
		
		String sql = "select p.idPrenotazione, t.nome, t.cognome, l.titolo from Prenotazione as p \n" + 
				"	inner join tessera as t on p.tessera = t.idTessera \n" + 
				"    inner join libro as l on p.libro = l.idLibro";
		
		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		List<Prenotazione> libriPrenotati = new ArrayList<Prenotazione>();
		Prenotazione libroPrenotato = null;
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			libroPrenotato = new Prenotazione(
					rs.getInt("idPrenotazione"),
					rs.getString("nome"), 
					rs.getString("cognome"),
					rs.getString("titolo")
					);
			libriPrenotati.add(libroPrenotato);
		}
		return (ArrayList<Prenotazione>) libriPrenotati;
	}


}
