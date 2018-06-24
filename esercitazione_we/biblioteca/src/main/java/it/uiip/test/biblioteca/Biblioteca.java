package it.uiip.test.biblioteca;

import java.sql.*;

public class Biblioteca {

	DBConnectionUtility dbUtil;

	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}

	//Inserisci Libro MySQL
	public void insertLib(Libro libro){

		String sql = "INSERT INTO LIBRO " +
				"(id, titolo, disponibilità,nCopie) VALUES (?, ?, ?, ?)";
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
			ps.setInt(1, libro.getId());
			ps.setString(2, libro.getTitolo());
			ps.setBoolean(3, libro.isDisponibilità());
			ps.setInt(4, libro.getnCopie());

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

	//Inserisci Autore MySQL
	public void insertAut(Autore autore){

		String sql = "INSERT INTO AUTORE " +
				"(nome, cognome) VALUES (?, ?)";
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
			ps.setString(1, autore.getNome());
			ps.setString(2, autore.getCognome());

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

	
	//Inserisci Tessera MySQL
		public void insertTess(Tessera tessera){

			String sql = "INSERT INTO TESSERA " +
					"(nome, cognome, indirizzo) VALUES (?, ?, ?)";
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
				ps.setString(1, tessera.getNome());
				ps.setString(2, tessera.getCognome());
				ps.setString(3, tessera.getIndirizzo());

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

		
	//Inserisci Scritto MySQL
	public void inserScritto(Autore autore, Libro libro){

		String sql = "INSERT INTO Scritto " +
				"(idAutore, idLibro) VALUES (?, ?)";
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
			ps.setInt(1, autore.getId());
			ps.setInt(2, libro.getId());

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

	// Ricerca libri disponibili
	public void ricercaDisponibili() {

		String sql = "select distinct libro.id, titolo, autore.nome, autore.cognome, disponibilità, nCopie from libro " +
				"Inner join scritto on libro.id = scritto.idLibro " + 
				"Inner join autore on scritto.idAutore = Autore.id " + 
				"where disponibilità = true";
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
					int id = rs.getInt("id");
					String titolo = rs.getString("titolo");
					String autoreNome = rs.getString("autore.nome");
					String autoreCognome = rs.getString("autore.cognome");
					boolean disponibilità =rs.getBoolean("disponibilità");
					int nCopie =rs.getInt("nCopie");

					//Display values
					System.out.print("id: " + id);
					System.out.print(", titolo: " + titolo);
					System.out.print(", autore: " + autoreNome + " " + autoreCognome);
					System.out.print(", nCopie: " + nCopie);
					System.out.print(", disponibilità: " + disponibilità + "\n");

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

	}


	// Ricerca per titolo
	public String ricercaTitolo(String str) {
		
		String a = null;

		String sql = "select distinct libro.id, titolo, autore.nome, autore.cognome, disponibilità, nCopie from libro " +
				"Inner join scritto on libro.id = scritto.idLibro " + 
				"Inner join autore on scritto.idAutore = Autore.id " + 
				"where titolo = "+ "'" + str + "'";
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
					int id = rs.getInt("id");
					String titolo = rs.getString("titolo");
					String autoreNome = rs.getString("autore.nome");
					String autoreCognome = rs.getString("autore.cognome");
					boolean disponibilità =rs.getBoolean("disponibilità");
					int nCopie =rs.getInt("nCopie");
					
					a = titolo;

					//Display values
					System.out.print("id: " + id);
					System.out.print(", titolo: " + titolo);
					System.out.print(", autore: " + autoreNome + " " + autoreCognome);
					System.out.print(", nCopie: " + nCopie);
					System.out.print(", disponibilità: " + disponibilità + "\n");

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
		return a;
	}


	// Ricerca per Autore
	public void ricercaAutore(String nome, String cognome) {

		String sql = "select distinct libro.id, titolo, disponibilità, nCopie from libro " +
				"Inner join scritto on libro.id = scritto.idLibro " + 
				"Inner join autore on scritto.idAutore = Autore.id " + 
				"where autore.nome = "+ "'" + nome + "'" + " and autore.cognome = "+ "'" + cognome + "'";
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
					int id = rs.getInt("id");
					String titolo = rs.getString("titolo");
					boolean disponibilità =rs.getBoolean("disponibilità");
					int nCopie =rs.getInt("nCopie");

					//Display values
					System.out.print("id: " + id);
					System.out.print(", titolo: " + titolo);
					System.out.print(", nCopie: " + nCopie);
					System.out.print(", disponibilità: " + disponibilità + "\n");

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

	}
	
	
	// Prestito Libro
		public void insertPrestito(Libro libro, Tessera tessera){
			
			String sql = "";
  
			if(ricercaTitolo(libro.getTitolo())!=null && libro.isDisponibilità()==true) {
			sql = "INSERT INTO prestito " +
					"(Libro, Tessera) VALUES (?, ?)";
			System.out.println("Il libro " + libro.getTitolo() + " è stato preso in prestito da: "+ tessera.getNome() + " " + tessera.getCognome()+"\n");
			} else {
				System.out.println("Libro non presente o non disponibile");
			}
			
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
				ps.setInt(1, libro.getId());
				ps.setInt(2, tessera.getId());

				ps.executeUpdate();
				ps.close();

			} catch (SQLException e) {
//				throw new RuntimeException(e);

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
