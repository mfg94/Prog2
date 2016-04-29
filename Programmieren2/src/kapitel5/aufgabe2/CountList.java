package kapitel5.aufgabe2;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountList<E> extends LinkedList<E> {

	public int count(E element) {
		int i = 0;
		Iterator<E> it = super.iterator();
		while (it.hasNext()) {
			if (element.equals(it.next()))
				i++;
		}
		return i;

	}

	public int unique() {
		int i = 0;
		Iterator<E> it = super.iterator();
		LinkedList<E> temp = new LinkedList<E>();

		while (it.hasNext()) {
			E e = it.next();
			if (!(temp.contains(e))) {
				temp.add(e);
				i++;
			}
		}
		return i;

	}

	Map<E, Integer> counts() {
		Map<E, Integer> m = new HashMap<E, Integer>();
		Iterator<E> it = super.iterator();
		while (it.hasNext()) {
			E e = it.next();
			if(!(m.containsKey(e)))
			m.put(e, count(e));
		}

		return m;

	}

}
