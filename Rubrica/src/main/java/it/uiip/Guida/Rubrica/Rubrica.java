package it.uiip.Guida.Rubrica;

import java.sql.*;




public class Rubrica {

	DBConnectionUtility dbUtil;

	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}



	public void insert(Utente utente){

		String sql = "INSERT INTO UTENTE " +
				"(NUMERO, NOME, COGNOME,SMARTPHONE) VALUES (?, ?, ?,?)";
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
			ps.setString(1, utente.getNumero());
			ps.setString(2, utente.getCognome());
			ps.setString(3, utente.getNome());
			ps.setInt(4, utente.getSmartphone());

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

	public void visualizzaAnagrafica(Utente u) {


		String sql = "Select nome,cognome from Utente "
				+ "where numero = "+u.getNumero();
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

	public void insertSmartphone(Smartphone smartphone){

		String sql = "INSERT INTO SMARTPHIONE " +
				"(id, nome, ram, cpu, displayPpi, displaySize,\r\n" + 
				"			displayResolution, size, weight, notes, brand, opSys) VALUES (?, ?, ?,?,?, ?, ?,?,?, ?, ?,?)";
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
			ps.setInt(1, smartphone.getId());
			ps.setString(2, smartphone.getNome());
			ps.setString(3, smartphone.getRam());
			ps.setString(4, smartphone.getCpu());
			ps.setInt(5, smartphone.getDisplayPpi());
			ps.setString(6, smartphone.getDisplaySize());
			ps.setString(7, smartphone.getDisplayResolution());
			ps.setString(8, smartphone.getSize());
			ps.setInt(9, smartphone.getWeight());
			ps.setString(10, smartphone.getNotes());
			ps.setInt(11, smartphone.getBrand());
			ps.setInt(12, smartphone.getOpSys());

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



	public void visualizzaTelefono(Utente u) {


		String sql = "select smartphone.name, utente.name, utente.cognome from utente\r\n" + 
				"inner join smartphone on utente.smartphone=smartphone.id" +
				"where utente.numero=" + u.getNumero();

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
					ps.executeQuery(sql);
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
