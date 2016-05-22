package kapitell10.aufgabe5;
import java.util.Arrays;
import java.util.Comparator;



public interface Something {

    int calc(double d, int f);

}

public class PersonTest {
	public static void main(String... args) {
		Person[] people = new Person[] { new Person("Ted", "Neward", 41), new Person("Charlotte", "Neward", 41),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Adam", "Pfeiffer", 43) };
		
		
		Arrays.sort(people, Comparator.comparing(keyExtractor));
		
		System.out.println(people);
		

		
	}
	
	
	

}

