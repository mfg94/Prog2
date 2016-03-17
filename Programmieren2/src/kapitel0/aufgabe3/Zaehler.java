package kapitel0.aufgabe3;

public class Zaehler {
	int einer = 0;
	int zehner = 0;

	void erhoeheUmEins() throws EinerUeberlauf {

		if (++einer == 10)
			throw new EinerUeberlauf();
		System.out.println("Einer: " + einer);

	}

	void erhoeheUmZehn() throws Ueberlauf {
		if (++zehner == 10)
			throw new Ueberlauf();
		System.out.println("Zehner: " + zehner);

	}

	public void zaehlen() throws Ueberlauf {
		try {
			this.erhoeheUmEins();
		} catch (EinerUeberlauf e) {
			this.einer = 0;
			this.erhoeheUmZehn();

		}

	}

}
