package kapitell10.aufgabe6;

import java.util.*;
import java.util.stream.Collectors;

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

		return buecher.stream().filter(b -> b.getAutor().equals(autor))
				.collect(Collectors.toList());

	}

	public Buch sucheNachISBN(String isbn) {

		return buecher.stream().filter(p -> p.getIsbn().equals(isbn))
				.findFirst().orElse(null);

	}

	public Map<String, List<Buch>> bestandNachAutorAuflisten() {

		return buecher.stream()
				.collect(Collectors.groupingBy((Buch b) -> b.getAutor()));

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
