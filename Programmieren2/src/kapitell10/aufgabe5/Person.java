package kapitell10.aufgabe5;
import java.util.Comparator;
import java.util.*;

class Person {
	private final String firstName;
	private String lastName;
	private final int age;

	public Person(String f, String l, int a) {
		firstName = f;
		lastName = l;
		age = a;
	}

	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	public String getFirstName(){
		return firstName;
	}

	
}