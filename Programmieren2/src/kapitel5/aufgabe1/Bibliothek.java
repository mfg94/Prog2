package kapitel5.aufgabe1;

import java.util.*;

public class Bibliothek {

	private ArrayList<Buch> buecher;

	public Bibliothek(Buch... b) {
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

	public Collection<Buch> bestandSortierenNach(Comparator<Buch> comp) {
		ArrayList<Buch> buecherSortiert = buecher;
		buecherSortiert.sort(comp);
		return buecherSortiert;
	}

	public Map<String, List<String>> bestandNachAutor() {

		TreeMap<String, List<String>> bestandNachAutor = new TreeMap<String, List<String>>();

		for (Buch b1 : buecher) {
			if (!(bestandNachAutor.containsKey(b1.getAutor()))) {
				List<String> l = new Vector<String>();
				for (Buch b2 : buecher) {
					if (!(l.contains(b2.getTitel()))
							&& b2.getAutor().equals(b1.getAutor()))
						l.add(b2.getTitel());

				}
				bestandNachAutor.put(b1.getAutor(), l);

			}
		}

		return bestandNachAutor;

	}

	public String toString() {
		String ausgabe = new String();
		for (Buch b : buecher)
			ausgabe += b.toString() + "\n";
		return ausgabe;
	}

}
