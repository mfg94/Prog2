package kapitel2.aufgabe2;

public abstract class Fahrzeug {

	protected double position = 0, geschwindigkeit = 0; // Jedes Fahrzeug STEHT an der Position 0 bei Objekterstellung
	protected final String name;

	// H�chstgeschwindigkeit und Beschleunigung sind Konstanten f�r jede Child-Klasse
	protected final double hoechstGeschwindigkeit;
	protected final double beschleunigung;

	// Konstruktor
	public Fahrzeug(String name, double hoechstGeschwindigkeit, double beschleunigung) {
		this.hoechstGeschwindigkeit = hoechstGeschwindigkeit;
		this.beschleunigung = beschleunigung;
		this.name = name;
	}

	// Diverse Getter-Methoden
	public double hoechstGeschwindigkeit() {
		return hoechstGeschwindigkeit;
	}

	public double getBeschleunigung() {
		return beschleunigung;
	}

	public double getPosition() {
		return position;
	}

	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	// Hilfsmethode: Rechnet �bergebenen km/h-Wert in m/s um
	public final double kmhInMs(double kmh) {
		return kmh * 1000 / 3600;
	}

	// Ein Fahrzeug beschleunigt aus dem Stand
	public final double beschleunigen(double sekunden) {

		assert (geschwindigkeit == 0); // Steht das Fahrzeug?

		// Normale Beschleunigung wenn Endgeschwindigkeit kleiner als H�chstgeschwindigkeit
		if (beschleunigung * sekunden < kmhInMs(hoechstGeschwindigkeit)) {

			position = (0.5 * beschleunigung * sekunden * sekunden) / 1000;
			geschwindigkeit = (beschleunigung * sekunden) / 1000 * 3600;

		} else {
			// Beschleunigung bis H�chstgeschwindigkeit
			// Restliche Zeit: Fahren mit H�chstgeschwindigkeit
			double beschlSekunden = kmhInMs(hoechstGeschwindigkeit)
					/ beschleunigung;
			position = ((0.5 * beschleunigung * Math.pow(beschlSekunden, 2))
					/ 1000);
			geschwindigkeit = hoechstGeschwindigkeit;
			fahren((sekunden - beschlSekunden) / 60);

		}

		return position;

	}

	// Fahrt mit aktueller Geschwindigkeit f�r mitgegebene Zeit
	public final double fahren(double minuten) {
		return position += (geschwindigkeit * minuten / 60);

	}

	// Die Stoppen-Methode muss f�r jede Child-Klasse implementiert werden
	public abstract double stoppen();

	public String toString() {
		return name + ". Hoechstgeschwindigkeit: " + hoechstGeschwindigkeit
				+ " km/h.\nAktuelle Geschwindigkeit: " + geschwindigkeit
				+ " km/h. Aktuelle Position: " + position + " km.\n";
	}

}
