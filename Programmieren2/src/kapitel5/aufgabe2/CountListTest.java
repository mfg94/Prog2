package kapitel5.aufgabe2;

public class CountListTest {

	public static void main(String[] args){
		final CountList<Integer> cl = new CountList<Integer>();
		
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.add(5);
		cl.add(6);
		cl.add(7);
		cl.add(8);
		cl.add(9);
		cl.add(10);
		cl.add(1);
		

	
		System.out.println(cl.count(2));
		System.out.println(cl.unique());
		System.out.println(cl.counts());
		
	}
	
}
