package kapitel4.aufgabe2;

public class Artikellager<E> {
	
	Ort<E>[] orte;
	
	public Artikellager(int anzahlOrte){
		this.orte = new Ort[anzahlOrte];
		
	}
	
	E auslagern(String artikelnummer){
		for(Ort o : orte){
			if(artikelnummer.equals(o.getEingelagertesElement());
			return o.getEingelagertesElement();
			else
			return null;
	}
	}

}
