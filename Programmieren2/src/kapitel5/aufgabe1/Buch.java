package kapitel5.aufgabe1;


public class Buch implements Comparable<Buch>{
	private final String autor;
	private final String isbn;
	private final String titel;

	public Buch(String autor, String titel, String isbn) {
		this.autor = autor;
		this.isbn = isbn;
		this.titel = titel;

	}

	public String getTitel() {
		return titel;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}
	
	
	public int compareTo(Buch b){
		return 0;
	}
	
	public String toString(){
		return "Autor: " + autor + ", Titel: " + titel + ", ISBN: " + isbn;
	}
	
	
	
	
	

}
