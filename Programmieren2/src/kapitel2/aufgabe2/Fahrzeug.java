package kapitel2.aufgabe2;

public abstract class Fahrzeug {
	protected double position = 0, geschwindigkeit = 0; // Position in km und
														// Geschwindigkeit in
														// km/h
	protected final String name; // Name des Fahrzeugs
	protected double hoechstGeschwindigkeit; // Hoechstgeschwindigkeit muss fuer
												// jedes Child initialisiert
												// werden in km/h
	protected double beschleunigung; // Beschleunigung fuer jedes Child
										// initialisiert werden in m/s^2

	public Fahrzeug(String name) { // Konstruktor
		this.name = name;
	}

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

	public final double kmhInMs(double kmh) {
		return kmh * 1000 / 3600;
	}

	public final double beschleunigen(double sekunden) { // Beschleunigung eines
		// Fahrzeugs aus dem
		// Ruhezustand
		assert (geschwindigkeit == 0); // Pruefung ob das Fahrzeug noch "steht"

		if (beschleunigung * sekunden < kmhInMs(hoechstGeschwindigkeit)) { // Geschwindigkeit
																			// nach
																			// Beschleunigung
																			// <
																			// Hoechstgeschwindigkeit?
			position = (0.5 * beschleunigung * sekunden * sekunden) / 1000; // Position
																			// nach
																			// der
																			// Beschleunigungsphase
																			// +
																			// Umrechnung
																			// in
																			// km
			geschwindigkeit = (beschleunigung * sekunden) / 1000 * 3600; // Geschwindigkeit
																			// nach
																			// der
																			// Beschleunigungsphase
																			// +
																			// Umrechnung
																			// in
																			// km/h
		} else { // Geschwindigkeit nach Beschleunigung > Hoechstgeschwindigkeit
			double beschlSekunden = kmhInMs(hoechstGeschwindigkeit) / beschleunigung; // Sekunden
																						// bis
																						// zur
																						// Hoechstgeschwindigkeit
			position = ((0.5 * beschleunigung * beschlSekunden) / 1000) // Zurueckgelegte
																		// Strecke
																		// bis
																		// zur
																		// Hoechstgeschwindigkeit
					+ ((kmhInMs(hoechstGeschwindigkeit) * (sekunden - beschlSekunden)) / 1000); // Gefahrene
																								// Strecke
																								// mit
																								// Hoechstgeschwindigkeit
			geschwindigkeit = hoechstGeschwindigkeit;
		}

		return position;

	}

	public final double fahren(double minuten) {
		return position += (geschwindigkeit * minuten / 60);

	}
	
	public abstract double stoppen();
	
	

	public String toString() {
		return name + ". Hoechstgeschwindigkeit: " + hoechstGeschwindigkeit + " km/h. Aktuelle Geschwindigkeit: "
				+ geschwindigkeit + " km/h. Aktuelle Position: " + position + " km.";
	}

}
