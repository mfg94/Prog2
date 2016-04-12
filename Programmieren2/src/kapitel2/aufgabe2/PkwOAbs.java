package kapitel2.aufgabe2;

public class PkwOAbs extends Pkw {

	public PkwOAbs(String name) {
		super(name);
		this.hoechstGeschwindigkeit = 140;
	}

	public double stoppen() {
		double anhalteweg = (Math.pow((kmhInMs(this.geschwindigkeit) / 10), 2))
				+ ((kmhInMs(this.geschwindigkeit) / 10) * 3);

		this.position += (anhalteweg / 1000);
		this.geschwindigkeit = 0;
		return anhalteweg;

	}

}
