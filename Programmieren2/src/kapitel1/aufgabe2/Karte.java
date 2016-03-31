package kapitel1.aufgabe2;

public class Karte {

	static enum Farbe {
		KREUZ, PIK, HERZ, KARO
	};

	static enum Wert {
		SIEBEN, ACHT, NEUN, ZEHN, BAUER, DAME, KOENIG, ASS
	};

	Farbe f;
	Wert w;

	public Karte(Farbe f, Wert w) {

		this.f = f;
		this.w = w;
		

	}
	
	public String toString(){
		return f.toString()+w.toString();
	}

}






