package kapitel2.aufgabe2;

public abstract class Fahrzeug {
	protected double position = 0, geschwindigkeit = 0;
	protected final String name;
	protected double hoechstGeschwindigkeit;
	protected double beschleunigung;

	public Fahrzeug(String name) {
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

	public final double beschleunigen(double sekunden) {

		assert (geschwindigkeit == 0);

		if (beschleunigung * sekunden < kmhInMs(hoechstGeschwindigkeit)) {

			position = (0.5 * beschleunigung * sekunden * sekunden) / 1000;
			geschwindigkeit = (beschleunigung * sekunden) / 1000 * 3600;

		} else {

			double beschlSekunden = kmhInMs(hoechstGeschwindigkeit) / beschleunigung;
			position = ((0.5 * beschleunigung * Math.pow(beschlSekunden, 2)) / 1000);
			geschwindigkeit = hoechstGeschwindigkeit;
			fahren((sekunden - beschlSekunden) / 60);

		}

		return position;

	}

	public final double fahren(double minuten) {
		return position += (geschwindigkeit * minuten / 60);

	}

	public abstract double stoppen();

	public String toString() {
		return name + ". Hoechstgeschwindigkeit: " + hoechstGeschwindigkeit + " km/h.\nAktuelle Geschwindigkeit: "
				+ geschwindigkeit + " km/h. Aktuelle Position: " + position + " km.\n";
	}

}
