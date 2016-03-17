package kapitel0.aufgabe3;

public class ZaehlerTest {

	public static void main(String[] args) {
		Zaehler z = new Zaehler();
		while(true){
		try{
			z.zaehlen();
		}
		catch(Ueberlauf e){
			System.err.println("Fehler aufgetreten: Ueberlauf!");
			break;
		}

	}
}

}
