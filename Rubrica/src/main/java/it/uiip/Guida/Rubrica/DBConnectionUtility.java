package it.uiip.Guida.Rubrica;

public class DBConnectionUtility {
	String url,username,password,driver;
	
	public DBConnectionUtility() {
		this.url="jdbc:mysql://localhost:3306/rubricaTelefonica";
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
