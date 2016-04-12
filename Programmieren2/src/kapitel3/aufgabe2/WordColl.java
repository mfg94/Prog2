package kapitel3.aufgabe2;

import java.util.StringTokenizer;
import java.util.Vector;

public class WordColl {

	Vector<String> words;

	WordColl(String[] sentences) {

		words = new Vector<String>();

		append(sentences);

	}

	int size() {
		return words.size();
	}

	int count(String s) {
		if (words.contains(s) == true) {
			int i = 0;

			for (String str : words) {
				if (str.equals(s) == true)
					i++;
			}
			return i;

		} else
			return 0;

	}

	void append(String... sentences) {

		StringTokenizer[] st = new StringTokenizer[sentences.length];

		for (int i = 0; i < sentences.length; i++) {
			st[i] = new StringTokenizer(sentences[i]);

			while (st[i].hasMoreTokens())
				words.addElement(st[i].nextToken());
		}
	}

	String top() {

		int[] w = new int[words.size()];

		for (int i = 0; i < words.size(); i++) {
			w[i] = count(words.elementAt(i));
		}

		int max[] = { 0, 0 };

		for (int i = 0; i < w.length; i++) {
			if (w[i] > max[0]) {
				max[0] = w[i];
				max[1] = i;
			}
		}

		return words.elementAt(max[1]);

	}

	public String toString() {
		Vector<String> temp = words;
		Vector<Integer> anz = new Vector();
		
		String ausgabe = "Word\t\t\t| count\t\t\t";
		ausgabe += "\n-----------------------------------------";
		
		
		
		for (String str : words){
			temp.addElement(str);
			anz.addElement(new Integer(count(str)));
		}
		
		temp.
		
		for(int i){
			
		}
			
			
			
			ausgabe += "\n" + str + "\t\t\t| " + count(str);

		return ausgabe;

	}

}
