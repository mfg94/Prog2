package kapitell10.aufgabe1;

import java.util.Arrays;
import java.util.List;

public class ArraysIntStreams {
	public static void main(String[] args) {
		Integer[] values = { 2, 9, 5, 0, 3, 7, 1, 4, 8, 6 };
		List<Integer> list = Arrays.asList(values);

		list.forEach(p -> System.out.println(p));
			
		}
		
}