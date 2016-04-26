package kapitel4.aufgabe4;

import java.util.Arrays;

public class Utils<E> {

	public static <E> void print(E[] e) {
		System.out.println(Arrays.toString(e));
	}
	
	public static <E> void sortiere(E[] e){
		Arrays.sort(e);
	}

	public static <E> E noNull(E... e){
		
		for(E temp : e){
			if(temp==null)
			{}
			else
				return temp;
		}
		return null;
		
	}
}
