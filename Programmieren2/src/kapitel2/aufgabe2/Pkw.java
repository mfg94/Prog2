package kapitel2.aufgabe2;

public class Pkw extends Fahrzeug {
	
	public Pkw(String name, int n) {
		super(name, 140.0, 2.0);
		}
	
	public Pkw(String name){
		super(name,160.0,2.0);
		
	}

	public double stoppen() {
		double anhalteweg = (0.5
				* Math.pow((kmhInMs(this.geschwindigkeit) / 10), 2))
				+ ((kmhInMs(this.geschwindigkeit) / 10) * 3);
		this.position += (anhalteweg / 1000);
		this.geschwindigkeit = 0;
		return anhalteweg;

	}

	public String toString() {
		return "Auto: " + super.toString();
	}

}
