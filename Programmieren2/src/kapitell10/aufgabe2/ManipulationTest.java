package kapitell10.aufgabe2;
import java.util.List;
import java.util.Arrays;

import kapitel5.aufgabe1.Buch;


public class ManipulationTest {

	public static void main (String [] args){
		Buch a = new Buch("Nietzshe","test1","123124");
		Buch b = new Buch("Goethe","test2","2346");
		Buch c = new Buch("Schiller","test3","as234");
		Buch d = new Buch("Mpller","test4","asdf344");
		Buch e = new Buch("Mannn","test5","3452h");
		Buch f = new Buch("Tolkien","test6","asdfg4t");
		
		Buch[] buecher = {a,b,c,d,e,f};
		
		List<Buch> buecherListe = Arrays.asList(buecher);
		
		buecherListe.forEach(p -> p.setAutor("Meyer"));
		
		

	}
	
}
