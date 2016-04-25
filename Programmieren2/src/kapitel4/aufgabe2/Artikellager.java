package kapitel4.aufgabe2;

import kapitel4.aufgabe1.Ort;

public class Artikellager<E> {

	Ort<E>[] orte;

	public Artikellager(int anzahlOrte) {
		orte = new Ort[anzahlOrte];
		for(int i=0;i<anzahlOrte;i++)
			orte[i]=new Ort<E>(i);
		

	}

	E auslagern(String artikelnummer) {
		for (Ort<E> o : orte) {
			if (o.getEingelagertesElement().toString()
					.contains(artikelnummer)) {
				return o.getEingelagertesElement();

			}

		}
		return null;
	}

	boolean einlagern(E e) {
		for (Ort<E> o : orte) {
			if (o.istBelegt() == false) {
				o.hinzufuegen(e);
				return true;
			}
		}
		return false;
	}

	int bestandSuchen(String artikelnummer) {
		int i = 0;

		for (Ort<E> o : orte) {
			if (o.istBelegt()&&o.getEingelagertesElement().toString().contains(artikelnummer))
				i++;
		}
		return i;
	}

	public String toString() {
		String ausgabe = new String();
		for (Ort<E> o : orte)
			ausgabe += o.toString() + "\n";
		return ausgabe;
	}

}
