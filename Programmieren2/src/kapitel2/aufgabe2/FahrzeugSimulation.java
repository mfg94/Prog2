package kapitel2.aufgabe2;

public class FahrzeugSimulation {

	public static void main(String[] args) {
		
		Lkw laster = new Lkw("MAN");
		Pkw auto1 = new Pkw("VW Golf");
		PkwOAbs auto2 = new PkwOAbs("Trabbi");
		Pkw auto3 = new Pkw("BMW");
		
		auto1.beschleunigen(60);
		auto2.beschleunigen(15);
		auto3.beschleunigen(120);
		laster.beschleunigen(90);
		
		auto1.fahren(20);
		auto2.fahren(20);
		auto3.fahren(20);
		laster.fahren(20);
		
		System.out.println(auto1);
		System.out.println(auto2);
		System.out.println(auto3);
		System.out.println(laster);
		
		

	}

}
