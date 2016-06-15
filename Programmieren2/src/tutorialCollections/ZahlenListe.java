package tutorialCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ZahlenListe {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 5; i > 0; i--)
			intList.add((int)(Math.random()*10));

		intList.forEach(i -> System.out.println(i.toString()));
		
		System.out.println();
		
		intList.sort(( i1, i2) -> i1 - i2);
		intList.forEach(i -> System.out.println(i.toString()));
		
		System.out.println();
		
		intList.sort((i1, i2)-> i2 - i1);
		intList.forEach(i -> System.out.println(i.toString()));
		
		
		
		ArrayList<Number> list = new ArrayList<Number>();
		
		System.out.println();
		
		for(int i = 5; i>0; i--)
			list.add(Math.random()*10.0);
		
		list.forEach(i -> System.out.println(i.toString()));
		
		System.out.println();
		
		list.sort((i1, i2)->{
			if(i1.doubleValue()>i2.doubleValue())
				return 1;
			else if (i1.doubleValue()<i2.doubleValue())
				return -1;
			else
				return 0;
		});
		
		list.forEach(i -> System.out.println(i.toString()));
		
		

	}

}
