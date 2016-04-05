package kapitel2.aufgabe1;

public class Person {

	public String vorname, nachname, strassenname, ort;
	public int plz, hausnummer;

	public Person(String vorname, String nachname, String strassenname, String ort, int plz, int hausnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.strassenname = strassenname;
		this.ort = ort;
		this.plz = plz;
		this.hausnummer = hausnummer;
	}

	public String toString() {
		return "Vorname: " + vorname + "\nNachname: " + nachname + "\nAnschrift: " + strassenname + " " + hausnummer
				+ ", " + " " + plz + " " + ort;
	}

}
