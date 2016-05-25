package kapitell10.aufgabe6;


public class Buch implements Comparable<Buch>{
	private String autor;
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
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public int compareTo(Buch b){
		return 0;
	}
	
	public String toString(){
		return "Autor: " + autor + ", Titel: " + titel + ", ISBN: " + isbn;
	}
	
	
	
	
	

}
