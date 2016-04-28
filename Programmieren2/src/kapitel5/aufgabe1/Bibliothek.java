package kapitel5.aufgabe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Bibliothek implements Comparator<Buch> {

	private ArrayList<Buch> buecher;

	public Bibliothek(Buch[] b) {
		buecher = new ArrayList<Buch>((Arrays.asList(b)));
	}

	public boolean einfuegen(Buch b) {
		buecher.add(b);
		return true;
	}

	public Collection<Buch> sucheNachAutor(String autor) {
		ArrayList<Buch> searchedBooks = new ArrayList<Buch>();

		for (Buch b : buecher) {
			if (b.getAutor().equals(autor))
				searchedBooks.add(b);
		}

		return searchedBooks;
	}

	public Buch sucheNachISBN(String isbn) {
		for (Buch b : buecher) {
			if (b.getIsbn().equals(isbn))
				return b;
		}

		return null;

	}
	
	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp){
		buecher.sort();
	}

}
