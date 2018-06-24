package esercizio.Biblioteca;

import java.util.*;

public class LibroAutore {
	
	private List<Libro> l ;
	private List<Autore> a ;
	
	public LibroAutore() {
		l= new ArrayList <Libro>();
		a= new ArrayList <Autore>();
	}

	public List<Libro> getL() {
		return l;
	}

	public void addLibro(Libro l) {
		this.l.add(l);
	}

	public List<Autore> getA() {
		return a;
	}

	public void addAutore (Autore a) {
	 this.a.add(a);
	}
	
	public String toString () {
		String str="";
		for (int i=0; i<this.a.size();i++) {
			str= str+this.a.get(i).toString()+this.l.get(i).toString()+"\n";
		}
		return str;
	}
	
	
	
	

}
