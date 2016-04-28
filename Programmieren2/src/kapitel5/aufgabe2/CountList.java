package kapitel5.aufgabe2;
import java.util.LinkedList;
import java.util.Iterator;

public class CountList<E> extends LinkedList<E>{


	public int count (E element){
		int i =0;
		Iterator<E> it = super.iterator();
		while(it.hasNext()){
			if(element.equals(it.next()))
				i++;
		}
		return i;
		
	}
	
	public int unique(){
		
		
	}
	
	
	
	
}
