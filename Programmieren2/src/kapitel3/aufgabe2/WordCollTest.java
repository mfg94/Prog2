package kapitel3.aufgabe2;

public class WordCollTest {

	public static void main (String[] args){
		
		String[] sentences = {"asdlköfj, asdpifipo adsöfipeij adölkf poiadsf öklasdf"};
		
		WordColl wColl = new WordColl(sentences);
		System.out.println(wColl.count("Mann"));
		System.out.println(wColl.size());
		System.out.println(wColl.top());
		System.out.println(wColl);
		
	}

}
