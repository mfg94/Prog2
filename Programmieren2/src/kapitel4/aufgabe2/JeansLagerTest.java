package kapitel4.aufgabe2;

import kapitel4.aufgabe2.Kleidungsstück.Farbe;

public class JeansLagerTest {
	public static void main (String[] args){
		
		Jeans j1 = new Jeans(36,Farbe.SCHWARZ,"Jeans Levis 501",340);
		Jeans j2 = new Jeans(36,Farbe.SCHWARZ, "Jeans Wrangler 50",380);
		
			
		Artikellager<Jeans> jeansLager = new Artikellager<Jeans>(10);
		
		jeansLager.einlagern(j1);
		jeansLager.einlagern(j2);
		
		System.out.println(jeansLager.bestandSuchen("56740736"));
		System.out.println(jeansLager);
	}

}
