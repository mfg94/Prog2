package kapitel4.aufgabe1;

public class OrtTest {

	public static void main(String[] args) {
		Ort<Integer> einOrt = new Ort<Integer>(1);
		einOrt.hinzufuegen(18);

		Integer s = einOrt.getEingelagertesElement();
		
		System.out.println(s);

		System.out.println(einOrt);

		s = einOrt.entnehmen();
		System.out.println(einOrt);

	}

}
