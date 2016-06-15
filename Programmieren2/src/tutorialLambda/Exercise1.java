package tutorialLambda;
import java.util.Arrays;


public class Exercise1 {
	public static void main(String[] args) {
		String[] words = { "Ich", "Du", "Er", "Sie", "Es" };
		System.out.println("Original Array: " + Arrays.asList(words));

		// Sortiere nach der Länge aufsteigend
		Arrays.sort(words, (s1, s2) -> s1.length() - s2.length());
		System.out.println("Sorted by length ascending: " + Arrays.asList(words));

		// Sortiere nach der Länge absteigend
		Arrays.sort(words, (s1, s2) -> s2.length() - s1.length());
		System.out.println("Sorted by length descending : " + Arrays.asList(words));

		// Sortiere alphabetisch aufsteigend
		Arrays.sort(words, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.println("Sorted by first letter : " + Arrays.asList(words));

		// Sortiere alle Wörter die den Buchstaben 'e' beinhalten
		Arrays.sort(words, (s1, s2) -> {
			int compareFlag = 0;
			if(s1.contains("e") && !s2.contains("e")) {
				compareFlag = -1;
			} else if(s2.contains("e") && !s1.contains("e")) {
				compareFlag = 1;
			}
			return(compareFlag);
		});

		System.out.println("Sorted by whether it contains 'e' : " + Arrays.asList(words));
	}
}
