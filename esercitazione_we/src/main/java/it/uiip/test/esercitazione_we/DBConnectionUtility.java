package it.uiip.test.esercitazione_we;

public class DBConnectionUtility {
	
String url,username,password,driver;
	
	public DBConnectionUtility() {
		this.url="jdbc:mysql://localhost:3306/Biblioteca";
			this.username="root";
			this.password="root";
			
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
