package kapitel4.aufgabe2;

import kapitel4.aufgabe1.Ort;

public class Artikellager<E> {

	Ort<E>[] orte;

	public Artikellager(int anzahlOrte) {
		Ort<E>[] orte = new Ort[anzahlOrte];

	}
	
	public E auslagern(String artikelnummer){
		for(Ort o : orte){
			if(artikelnummer.equals(o.getEingelagertesElement().toString())){
				
			}
		}
	}

}
