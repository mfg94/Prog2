package kapitel4.aufgabe3;

public class Pair<E, T> {

	private T t;
	private E e;

	public Pair(T t, E e) {
		this.t = t;
		this.e = e;
	}

	public String toString() {
		return "(" + t.toString() + ", " + e.toString() + ")";
	}

	public boolean equals(Object x) {
		if (x == null)
			return false;

		if (getClass() != x.getClass())
			return false;

		Pair<E, T> other = (Pair<E, T>) x;

		if (this.t.equals(other.t) && this.e.equals(other.e))
			return true;
		else
			return false;

	}

}
