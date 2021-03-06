package kapitell10.aufgabe5;
import java.util.Arrays;
import java.util.Comparator;




public class PersonTest {
	public static void main(String... args) {
		Person[] people = new Person[] { new Person("Ted", "Neward", 41), new Person("Charlotte", "Neward", 41),
				new Person("Michael", "Neward", 19), new Person("Matthew", "Neward", 13),
				new Person("Adam", "Pfeiffer", 43) };
		
		System.out.println(Arrays.toString(people));
		
		//Arrays.sort(people,(s1,s2) -> s1.getFirstName().compareTo(s2.getFirstName()));
		Arrays.sort(people,Comparator.comparing(Person::getFirstName));
		
		
		
		System.out.println(Arrays.toString(people));
		
		
	}
	
	
	

}

