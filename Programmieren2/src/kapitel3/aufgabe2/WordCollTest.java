package kapitel3.aufgabe2;

public class WordCollTest {

	public static void main (String[] args){
		
		String[] sentences = {"asdlk�fj, asdpifipo ads�fipeij ad�lkf poiadsf �klasdf"};
		
		WordColl wColl = new WordColl(sentences);
		System.out.println(wColl.count("Mann"));
		System.out.println(wColl.size());
		System.out.println(wColl.top());
		System.out.println(wColl);
		
	}

}
