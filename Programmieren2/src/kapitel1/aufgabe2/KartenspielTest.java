package kapitel1.aufgabe2;

public class KartenspielTest {

	public static void main(String[] args) {

		Kartenspiel test = new Kartenspiel(4);

		System.out.println(test);
		test.mischen();
		System.out.println(test);
		test.sort();
		System.out.println(test);

		Kartenspiel test2 = new Kartenspiel(3);
		System.out.println(test2);

		test.kartenspielHinzufuegen(test2);
		System.out.println(test);

	}

}
