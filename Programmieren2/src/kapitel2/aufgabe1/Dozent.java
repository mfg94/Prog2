package kapitel2.aufgabe1;

public class Dozent extends Person {

	int gehalt;
	String lehrgebiet;

	public Dozent(String vorname, String nachname, String strassenname, String ort, int plz, int hausnummer,
			String lehrgebiet, int gehalt) {
		super(vorname, nachname, strassenname, ort, plz, hausnummer);
		this.gehalt = gehalt;
		this.lehrgebiet = lehrgebiet;
	}

	public String toString() {
		return super.toString() + "\nLehrgebiet: " + lehrgebiet + "\n Gehalt: " + gehalt + " Euro";
	}
	
	public int gehalt(){
		return gehalt;
	}
	

}
