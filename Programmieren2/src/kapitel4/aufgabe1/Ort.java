package kapitel4.aufgabe1;

public class Ort<E> {
	final int ortsId;
	E e;

	public Ort(int ortsId) {
		this.ortsId = ortsId;
		e = null;
	}

	public E entnehmen() {
		E temp = e;
		e = null;
		return temp;
	}

	public void hinzufuegen(E e) {
		if (this.e == null)
			this.e = e;
		else
			System.err.println("Belegt!");
	}

	public E getEingelagertesElement() {
		return e;
	}

	public boolean istBelegt() {
		if (e == null)
			return false;
		else
			return true;
	}

	public int getOrtsId() {
		return ortsId;
	}

	public String toString() {
		return "OrtID: "+ ortsId + " " + e;
	}

}
