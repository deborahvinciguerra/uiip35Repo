package it.uiip.pagliaro.Rubrica;

import java.sql.*;

import com.mysql.jdbc.Driver;


public class Rubrica {

	DBConnectionUtility dbUtil;
	
	public void setConnectionData(DBConnectionUtility dbUtil) {
		this.dbUtil=dbUtil;
	}
	
	
	
public void insert(Utente utente){

		String sql = "INSERT INTO UTNTE " +
				"(NOME, COGNOME,NUMERO,PHONE) VALUES (?, ?, ?,?)";
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
			ps.setString(1, utente.getNome());
			ps.setString(2, utente.getCognome());
			ps.setString(3, utente.getNumero());
			ps.setInt(4, utente.getPhone());

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
//
//public void visualizzaAnagrafica(Utente u) {
//	
//
//	String sql = "Select nome,cognome from Utente "
//			+ "where numero="+u.getNumero();
//	Connection conn = null;
//	
//	try {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
//			PreparedStatement ps = conn.prepareStatement(sql);
//			
//			ResultSet rs = ps.executeQuery(sql);
//
//		      //STEP 5: Extract data from result set
//		      while(rs.next()){
//		    //Retrieve by column name
//	         String nome = rs.getString("nome");
//	         String cognome = rs.getString("cognome");
//	        
//
//	         //Display values
//	         System.out.print("Nome: " + nome);
//	         System.out.print(", Cognome: " + cognome);
//	      }
//	      //STEP 6: Clean-up environment
//	      rs.close();
//	      ps.close();
//	      conn.close();
//			
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//}
//	finally {
//		if (conn != null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {}
//		}
//	}
//	
//}
//
//
//
//
//public void visualizzaTelefono(Utente u) {
//	
//
//	String sql = "Select name from smartphone as s "
//			+ "	inner join Utente as u on u.phone=s.name"
//			+ "where u.numero="+u.getNumero();
//	
//	Connection conn = null;
//	
//	try {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			conn = DriverManager.getConnection(dbUtil.getUrl(),dbUtil.getUsername(),dbUtil.getPassword());
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.executeQuery(sql);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//}
//	finally {
//		if (conn != null) {
//			try {
//				conn.close();
//			} catch (SQLException e) {}
//		}
//	}
//	
//}
//

	
}
