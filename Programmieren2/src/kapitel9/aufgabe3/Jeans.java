package kapitel9.aufgabe3;
public class Jeans extends Kleidungsstueck {

	private static String typId = "567407";
	protected int schrittl�nge;

	public static String typNummer() {
		return typId;
	}

	public Jeans(int groesse, Farbe f, String bezeichnung, int schrittl�nge) {
		super(groesse, f, bezeichnung);
		artNr = typId + super.groesse;
		this.schrittl�nge = schrittl�nge;
	}

	public static boolean isJeans(String artikelnummer) {

		String s = new String(artikelnummer.substring(0, 5));
		return s.equals(typId);
	}

	public String artikelNummer() {
		return artNr;
	}

	public String toString() {
		return artNr + " " + super.toString() + " " + schrittl�nge;
	}
}
