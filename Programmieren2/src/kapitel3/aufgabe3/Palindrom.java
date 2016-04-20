package kapitel3.aufgabe3;
import java.util.Stack;

public class Palindrom {

	public static boolean isPalindrom(String str) {
		str = str.toLowerCase();
		Stack<Character> palindrom = new Stack<Character>();

		char[] chars = str.toCharArray();

		for (char c : chars)
			if (c != ' ')
				palindrom.add(c);

		while (palindrom.size() > 1) {

			if (palindrom.elementAt(0).equals(palindrom.peek())) {
				palindrom.remove(0);
				palindrom.pop();
			} else
				return false;

		}
		return true;

	}

}
