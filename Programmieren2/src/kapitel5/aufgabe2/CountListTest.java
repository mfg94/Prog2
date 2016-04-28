package kapitel5.aufgabe2;

public class CountListTest {

	public static void main(String[] args){
		final CountList<Integer> cl = new CountList<Integer>();
		
		cl.add(2);
		cl.add(5);
		cl.add(2);
		cl.add(5);
		cl.add(3);
		cl.add(2);

	
		System.out.println(cl.count(2));
	}
	
}
