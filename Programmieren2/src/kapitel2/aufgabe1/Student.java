package kapitel2.aufgabe1;

public class Student extends Person {

	final int matrikelnummer;
	int gehalt;

	public Student(String vorname, String nachname, String strassenname, String ort, int plz, int hausnummer,
			int matrikelnummer, int gehalt) {
		super(vorname, nachname, strassenname, ort, plz, hausnummer);
		this.matrikelnummer = matrikelnummer;
		this.gehalt = gehalt;
	}
	
	public String toString(){
		return super.toString() + "\nMatrikelnummer: "+matrikelnummer+"\nGehalt: "+gehalt;
	}
	
	public int gehalt(){
		return gehalt;
	}

}
