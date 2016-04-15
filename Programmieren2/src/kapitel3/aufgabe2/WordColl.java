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
	
	boolean isEmpty(){
		if(size()==count(null))
			return true;
		else
			return false;
		
		
	}

	String top() {
		
		assert((isEmpty()));
		
		
		int max[]={0,0};

		for (String str : words) {
			if(count(str)>max[0]){
				max[0]=count(str);
				max[1]=words.indexOf(str);
			}
		}
		
		return words.elementAt(max[1]);

	}

	public String toString() {
		
		assert(words.size()>0);
		
		Vector<String> temp= new Vector<String>();
		
		
		for(String str: words){
			if(count(str)>1 && temp.contains(str)){}
			else
			{
				temp.add(str);
			}
		}
		
		
		String ausgabe = "Word\t\t\t| count\t\t\t";
		ausgabe += "\n-----------------------------------------";
		
		
		
			
		for(String str : temp)
			ausgabe += "\n" + str + "\t\t\t| " + count(str);
		
		ausgabe += "\n-----------------------------------------";
		ausgabe += "\nTotal: "+words.size();

		return ausgabe;

		}

}
