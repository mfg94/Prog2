package kapitel1.aufgabe2;

public class KartenspielTest {

	public static void main(String[] args) {

		Kartenspiel test = new Kartenspiel(5);

		System.out.println(test);
		test.mischen();
		System.out.println(test);

	}

}
