package kapitel4.aufgabe2;

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
		

	}

	E getEingelagertesElement() {
		return e;
	}

	boolean istBelegt() {
		if (e != null)
			return true;
		else
			return false;
	}

	int getOrtsId() {
		return ortsId;
	}

	public String toString() {
		return "OrtID: "+ ortsId + " " + e;
	}

}
