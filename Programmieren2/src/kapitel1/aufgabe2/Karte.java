package kapitel1.aufgabe2;

public class Karte implements Comparable<Karte> {

	public static enum Farbe {
		KARO, HERZ, PIK, KREUZ
	};

	public static enum Wert {
		SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS
	};

	Farbe f;
	Wert w;

	public Karte(Farbe f, Wert w) {

		this.f = f;
		this.w = w;

	}

	public String toString() {
		return f.toString() + " " + w.toString();
	}

	public int compareTo(Karte k) {

		if (this.f.ordinal() == k.f.ordinal())
			return 0;
		else if (this.f.ordinal() > k.f.ordinal())
			return -1;
		else
			return 1;

	}

}
