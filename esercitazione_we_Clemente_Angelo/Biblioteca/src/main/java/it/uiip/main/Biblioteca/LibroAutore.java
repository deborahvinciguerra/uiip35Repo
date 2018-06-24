package it.uiip.main.Biblioteca;

public class LibroAutore {

	//	idAutore int(11) not null ,
	//	idLibro int(11) not null ,

	private int idAutore, idLibro;

	public LibroAutore(int idAutore, int idLibro) {

		this.idAutore = idAutore;
		this.idLibro = idLibro;
	}

	//get and set
	public int getIdAutore() {
		return idAutore;
	}
	public void setIdAutore(int idAutore) {
		this.idAutore = idAutore;
	}
	public int getdLibro() {
		return idLibro;
	}
	public void setIntLibro(int intLibro) {
		this.idLibro = idLibro;
	}


}
