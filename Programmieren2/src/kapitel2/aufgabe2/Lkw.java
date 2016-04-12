package kapitel2.aufgabe2;

public class Lkw extends Fahrzeug {

	protected double ladung;
	protected double maxLadung;

	public Lkw(String name, double maxLadung) {
		super(name);
		this.hoechstGeschwindigkeit = 105; // kmh
		this.beschleunigung = 0.5; // m/s^2
		this.maxLadung = maxLadung;
		this.ladung = 0;
	}

	// Beladen des LKWs
	public void beladen(double ladungInTonnen) {
		if (this.istVollBeladen())
			System.out.println("Wagen ist voll beladen");
		else if (ladungInTonnen + this.ladung > maxLadung)
			System.out.println("Kapazitaeten reichen nicht.");
		else
			this.ladung += ladungInTonnen;
	}

	// Entladen des LKWs
	public void entladen(double ladungInTonnen) {
		if (ladungInTonnen > this.ladung)
			System.out.println("Kann nicht mehr entladen als aufgeladen ist.");
		else
			this.ladung -= ladungInTonnen;

	}

	// Prüfen ob der LKW voll ist
	private boolean istVollBeladen() {
		if (this.ladung == this.maxLadung)
			return true;
		else
			return false;
	}

	// Anhalten des LKWs
	public double stoppen() {
		double a;
		double anhalteweg;

		// Unterscheidung des Bremsweges wenn der LKW vollgeladen ist bzw. wenn er nicht ganz voll ist
		if (istVollBeladen())
			a = 3.0;
		else
			a = 5;

		anhalteweg = (0.5 * Math.pow(kmhInMs(this.geschwindigkeit), 2) / a)
				+ (kmhInMs(this.geschwindigkeit) / 10 * 3);

		this.position += (anhalteweg / 1000);
		this.geschwindigkeit = 0;

		return anhalteweg;

	}

	public String toString() {
		return "LKW: " + super.toString() + " Beladung: " + this.ladung
				+ " Tonnen.  Max.Ladung: " + this.maxLadung + " Tonnen.\n";
	}

}
