/*
 * Übung "Liste mit unterschiedlichen Datentypen"
 * 
 * Aufgabe:
 * 
 * a) - Legen Sie eine ArrayList die Daten vom Typ "Integer" speichern kann an und füllen Sie sie mit mindestens 5 Werten.
 * 		Anschließend geben Sie die Liste erst unsortiert aus, dann sortieren Sie sie und geben sie nochmal in sortierter Reihenfolge aus.
 * 		Benutzen sie zum sortieren die Funktion list.sort() und schreiben Sie ihren eigenen Comparator als Landa-Ausdruck.
 * 
 * b) - Erweitern Sie die Funktion jetzt insofern das die Liste auch Daten vom Typ "Float" und "Double" aufnehmen kann.
 * 		(Lösungshinweis 1: Die Klassen "Integer", "Float" und "Double" sind alle von der abstrakten Klasse "Numbers" [java.lang.Numbers] abgeleitet.)
 * 		(Lösungshinweis 2: Beim Sortieren müssen jetzt auch unterschiedliche Datentypen miteinander verglichen werden - Am einfachsten geht dies wenn
 * 		Sie die zu vergleichenden Werte zunächst in Double-Werte umwandeln. Eine geeignete Funktion doubleValue() ist in der Klasse "Number"
 * 		bereits vorhanden.)
 * 
 * Eine Beispielausgabe könnte folgendermaßen aussehen:
 * 
 * 		> Unsortierte Liste:
 * 		> 4
 * 		> 3.2
 * 		> 3.14
 * 		> 4.3
 * 		> 3
 * 		>
 * 		> Sortierte Liste:
 * 		> 3
 * 		> 3.14
 * 		> 3.2
 * 		> 4
 * 		> 4.3
 */


//Musterlösung:
package tutorialCollections;
import java.util.ArrayList;
import java.lang.Number;

public class NumberList {

	public static void main (String []args){
		
		ArrayList<Number> numberList = new ArrayList<Number>();
		
		//Add some Numbers to numberList
		numberList.add(new Integer(4));
		numberList.add(new Float (3.2));
		numberList.add(new Double (3.14));
		numberList.add(4.3);				//wird zu Double geparsed
		numberList.add(3);					//wird zu Integer geparsed
		
		//print numberList
		System.out.println("Unsortierte NumberList:");
		for (Number buf : numberList){
			System.out.println(buf);
		}
		
		//sorting
		numberList.sort(( n1,  n2) -> {
			if (n1.doubleValue() > n2.doubleValue())
				return 1;
			else if (n1.doubleValue() < n2.doubleValue())
				return -1;
			else
				return 0;
			}
		);
		
		//print numberList
		System.out.println("\nSortierte NumberList:");
		for (Number buf : numberList){
			System.out.println(buf);
		}
	}
}