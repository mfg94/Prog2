package tutorialLambda;

import java.util.Arrays;

public class LamdaSort {

	public static void main(String[] args) {
		String[] words = { "Ich", "Du", "Er", "Sie", "Es" };
		
		System.out.println(Arrays.toString(words));

		Arrays.sort(words, (s1, s2) -> {

			if (s1.length() > s2.length())
				return 1;
			else if (s1.length() < s2.length())
				return -1;
			else
				return 0;

		});
		

		System.out.println(Arrays.toString(words));

	}
}
