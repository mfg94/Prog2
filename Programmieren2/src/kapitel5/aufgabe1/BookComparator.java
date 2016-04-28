package kapitel5.aufgabe1;
import java.util.Comparator;

public class BookComparator implements Comparator<Buch>{

	int vergleichswert; // 0 vergleicht anhand des Autors
	// 1 vergleicht anhand des Titels
	// 2 vergleicht anhand der ISBN

	public BookComparator(int vergleichswert) {
		this.vergleichswert = vergleichswert;
	}

	public int compare(Buch b1, Buch b2) {
		if (vergleichswert == 0)
			return (b1.getAutor().compareTo(b2.getAutor()));
		else if (vergleichswert == 1)
			return (b1.getTitel().compareTo(b2.getTitel()));
		else
			return (b1.getIsbn().compareTo(b2.getIsbn()));

	}

}
