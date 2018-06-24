package esercizio.Biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;

public class Query {

	//METODO BUONO DO NOT MODIFY
	public static LibroAutore ricercaLibroPerAutore(Connection connessione, String nome,String cognome ) throws SQLException {

		String sql = "select titolo, numeroCopie, A.nome as nomeAutore, A.cognome as cognomeAutore from Libro as L \n" + 
				"	inner join LibroAutore as LA on L.idLibro = LA.idLibro \n" + 
				"    inner join Autore as A on LA.idAutore = A.idAutore \n" + 
				"    where A.cognome like '%"+cognome+"%' and A.nome like '%"+nome+"%';";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		LibroAutore la= new LibroAutore();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Libro l = new Libro(rs.getString("titolo"),
					rs.getInt("numeroCopie")
					);
			Autore a = new Autore(rs.getString("nomeAutore"),
					rs.getString("cognomeAutore"));
			la.addAutore(a);
			la.addLibro(l);
		}
		rs.close();
		return la;
	}
	
	
	public static LibroAutore ricercaLibroPerTitolo(Connection connessione, String titolo) throws SQLException {

		String sql = "select titolo, numeroCopie, A.nome as nomeAutore, A.cognome as cognomeAutore from Libro as L \n" + 
				"	inner join LibroAutore as LA on L.idLibro = LA.idLibro \n" + 
				"    inner join Autore as A on LA.idAutore = A.idAutore \n" + 
				"    where titolo like '%"+titolo+"%' ;";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		LibroAutore la= new LibroAutore();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Libro l = new Libro(rs.getString("titolo"),
					rs.getInt("numeroCopie")
					);
			Autore a = new Autore(rs.getString("nomeAutore"),
					rs.getString("cognomeAutore"));
			la.addAutore(a);
			la.addLibro(l);
		}
		rs.close();
		return la;
	}
	
	public static LibroAutore prenotazioneLibroPerTitolo(Connection connessione, String titolo, String idTessera) throws SQLException {

		String sql = "select titolo, L.idLibro as id, numeroCopie, A.nome as nomeAutore, A.cognome as cognomeAutore from Libro as L \n" + 
				"	inner join LibroAutore as LA on L.idLibro = LA.idLibro \n" + 
				"    inner join Autore as A on LA.idAutore = A.idAutore \n" + 
				"    where titolo like '%"+titolo+"%' ;";

		PreparedStatement ps;
		ps = connessione.prepareStatement(sql);
		LibroAutore la= new LibroAutore();
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Libro l = new Libro(rs.getString("titolo"),
					rs.getInt("numeroCopie")
					);
			Autore a = new Autore(rs.getString("nomeAutore"),
					rs.getString("cognomeAutore"));
			la.addAutore(a);
			la.addLibro(l);
			l.setI(rs.getInt("id"));
		}
		
		rs.close();
		
		
		if (la.getL().get(0).getNumeroCopie()>0) {
			String sql2 = "Update libro \n"+
		                  "set numeroCopie= "+(la.getL().get(0).getNumeroCopie()-1)+"\n"+
					      "where titolo like '%"+la.getL().get(0).getTitolo()+"%' ;" ;
			PreparedStatement ps2;
			ps2 = connessione.prepareStatement(sql2);
			int numeroCopieAggiornato = ps2.executeUpdate();
			la.getL().get(0).setNumeroCopie(numeroCopieAggiornato);
			
			String sql3 = "INSERT INTO LibroTessera (idLibro,idTessera) VALUES \n"+
	                  "("+la.getL().get(0).getI()+","+idTessera+") ;";
			PreparedStatement ps3;
			ps3 = connessione.prepareStatement(sql3);
			ps3.executeUpdate();
			ps3.close();
			
			System.out.println("Il libro è stato prenotato");
			
		}else {System.out.println("La disponibilità è esaurita");}
		
		return la;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
