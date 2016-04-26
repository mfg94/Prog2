package kapitel4.aufgabe3;
import java.util.Vector;

public class PairTest {
	
	public static void main (String[] args){
		
		Vector<Pair<String,Integer>> vector = new Vector<Pair<String,Integer>>();
		
		
		
		vector.add(new Pair("I",(Integer) 1));
		vector.add(new Pair("V",(Integer) 5));
		vector.add(new Pair("C",(Integer) 100));
		vector.add(new Pair("II",(Integer) 2));
		vector.add(new Pair("IX",(Integer) 9));
	
		System.out.println(vector);
	
	
	}

}
