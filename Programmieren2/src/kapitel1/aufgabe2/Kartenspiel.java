package kapitel1.aufgabe2;

import java.util.Arrays;

public class Kartenspiel {

	Karte[] deck;

	public Karte[] getDeck() {
		return deck;
	}

	public Kartenspiel(int n) {
		deck = new Karte[n];
		Karte.Farbe[] farben = Karte.Farbe.values();
		Karte.Wert[] werte = Karte.Wert.values();

		for (int i = 0; i < n; i++) {

			int rndF = (int) (Math.random() * (farben.length));
			int rndW = (int) (Math.random() * (werte.length));
			deck[i] = new Karte(farben[rndF], werte[rndW]);

		}

	}

	public String toString() {
		String ausgabe = deck.length + " Karten im Deck.\n";
		for (int i = 0; i < deck.length; i++) {
			ausgabe += deck[i].toString() + "\n";
		}
		return ausgabe;

	}

	public void mischen() {
		Karte tmp;
		int rand;

		for (int i = 0; i < deck.length; i++) {
			rand = (int) (Math.random() * deck.length);

			tmp = deck[rand];
			deck[rand] = deck[i];
			deck[i] = tmp;

		}

	}

	public void sort() {
		Arrays.sort(deck);
	}

	public void kartenspielHinzufuegen(Kartenspiel neu) {
		Karte[] tmp = this.deck;
		this.deck = new Karte[(tmp.length + neu.getDeck().length)];

		System.arraycopy(tmp, 0, this.deck, 0, tmp.length);
		System.arraycopy(neu.getDeck(), 0, this.deck, tmp.length, neu.deck.length);

	}

}
