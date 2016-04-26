package kapitel4.aufgabe4;

public class UtilsTest {

	public static void main(String[] args) {
		Integer[] keys = {2000, 2, 99, 756, 999, 0, 666, 2345, 7492, 22};

		String[] article = {"the", "a ", "one ", "some ", "anton", "ymca"};

		Utils.print(keys);
		Utils.print(article);
		
		Utils.sortiere(keys);
		Utils.sortiere(article);
		
		Utils.print(keys);
		Utils.print(article);
		
		System.out.println(Utils.noNull(null,"HELLO","WOW"));
		

	}

}
