package kapitel4.aufgabe1;

public class Ort<E> {
	final int ortsId;
	E e;

	public Ort(int ortsId) {
		this.ortsId = ortsId;
		e = null;
	}

	E entnehmen() {
		E temp = e;
		e = null;
		return temp;
	}

	void hinzufuegen(E e) {
		if (this.e == null)
			this.e = e;
		else
			System.err.println("Belegt!");
	}

	E getEingelagertesElement() {
		return e;
	}

	boolean istBelegt() {
		if (e == null)
			return false;
		else
			return true;
	}

	int getOrtsId() {
		return ortsId;
	}

	public String toString() {
		return "OrtID: "+ ortsId + " " + e;
	}

}
