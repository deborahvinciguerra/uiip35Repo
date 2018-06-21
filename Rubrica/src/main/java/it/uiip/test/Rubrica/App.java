package it.uiip.test.Rubrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

public class App {

		private DataSource dataSource;
		
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
		// Metodo per l'inserimento di un nuovo contatto
		public void insert(Contatto contatto) throws ClassNotFoundException{
			
			String sql = "INSERT INTO Contatto " +
					"(numCell, nome, cognome, smartphone) VALUES (?, ?, ?, ?)";
			Connection conn = null;
			
			try {
				Utility u = new Utility();
				String driver = u.driverClassName;
				Class.forName(driver);
				conn = DriverManager.getConnection(u.url, u.username, u.password);
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, contatto.getNumCell());
				ps.setString(2, contatto.getNome());
				ps.setString(3, contatto.getCognome());
				ps.setInt(4, contatto.getSmartphone());
				ps.executeUpdate();
				ps.close();
				
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
		
		// Metodo per la visualizzazione delle info anagrafiche e del modello di telefono
		public Contatto findByCell(int numCell){
			
			String sql = "select nome, cognome, smartphone.name from Contatto\n" + 
					     "inner join smartphone on contatto.smartphone = smartphone.id\n"+
					     "where numCell = ?";
			
			Connection conn = null;
			
			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, numCell);
				Contatto contatto = null;
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					contatto = new Contatto(
						rs.getString("numCell"),
						rs.getString("nome"), 
						rs.getString("cognome"),
						rs.getInt("smartphone")
					);
				}
				rs.close();
				ps.close();
				return contatto;
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
		
	    public static void main( String[] args ) throws ClassNotFoundException
	    {	

	        Contatto c1 = new Contatto("3279499319","Giacomo","Esposito",1);
	        App a = new App();
	        a.insert(c1);
	        System.out.println(c1);
	        
	    }
}
