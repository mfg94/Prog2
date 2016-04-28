package kapitel5.aufgabe1;

public class BibliothekTest {

	public static void main(String[] args) {
		
		Buch a = new Buch("Reinhard Schiedermeier", "Java Praktikum" ,"9784898645133");
		Buch b = new Buch("Harvey Deitel", "How to program Java" ,"01303451517");
		Buch c = new Buch("Bertrand Meyer", "Object Oriented Software Construction" ,"0136290310");
		Buch d = new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development" ,"9783642018558");
		Buch e = new Buch("Kathy Sierra", "Java von Kopf bis Fuss" ,"9783897214484");
		Buch f = new Buch("Reinhard Schiedermeier", "Java Praktikum" ,"9784898645133");
		Buch g = new Buch("Harvey Deitel", "How to program Java" ,"01303451517");
		Buch h = new Buch("Bertrand Meyer", "Object Oriented Software Construction" ,"0136290310");
		Buch i = new Buch("Bertrand Meyer", "Software Engineering Approaches for Offshore and Outsourced Development" ,"9783642018558");
		Buch j = new Buch("Kathy Sierra", "Java von Kopf bis Fuss" ,"9783897214484");
		Buch k = new Buch ("Mark Utting", "Practical Model based Testing", "9780123725011");
		
		Bibliothek test = new Bibliothek(a,b,c,d,e,f,g,h,i,j,k);
		
		
		System.out.println(test.toString());
		
		
		
		System.out.println(test.bestandSortierenNach(new BookComparator(2)));
		
		System.out.println(test.bestandNachAutor());
		
		
		
		
		
	}

}
