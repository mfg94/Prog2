package kapitel2.aufgabe1;

public class Test {
	
	public static void main(String args[]){
		Student aStudent = new Student("Peter","Mueller","Hauptstrasse", "Coburg",96450,4,455555, 1000);
		Dozent aDozent = new Dozent("Hans","Meyer","Jenaerstrasse","Coburg",96450,21,"Betriebssysteme",5000);
		Student bStudent = new Student("Kevin","Schwarzmann","Musterstrasse", "Coburg",96450,4,44444, 400);
		Person aPerson = new Person("Michael","Gutmair","Bambergerstrasse", "Muehlhausen",96172,17);
		Person bPerson = new Person("Arnold","Schwarzenegger","Benchstrasse","Gainzville",87879,1);
		
		Person[] personArray = new Person[] {aStudent, aDozent, bStudent, aPerson, bPerson};
		
		for (Person p : personArray)
			System.out.println("\n"+p);
			
				
				
			
			
		
		
	}

}
