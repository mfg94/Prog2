/*
 * Übung "HashMap anwenden"
 * 
 * Aufgabe: Es soll ein Programm geschrieben werden das Telefonnummern "vorliest" - in unserem Fall soll einfach jede Ziffer einzeln als Zahlwort ausgegeben werden.
 * Eine Beipielausgabe könnte wie folgt aussehen:
 * 
 * 	> Bitte Telefonnummer eingeben:
 * 	> 0151/3456
 * 	>
 * 	> Null
 * 	> Eins
 * 	> Fünf
 * 	> Eins
 * 	> /
 * 	> Drei
 * 	> Vier
 * 	> Fünf
 * 	> Sechs
 * 
 * Verwenden Sie dazu die Collection HashMap um die Integer-Ziffern den String-Wörtern zuzuordnen. (Hierzu keine Switch-Case oder If-Else Anweisungen verwenden!)
 * Überlegen Sie sich wie sie die Telefonnummer am besten in einzelne Ziffern zerlegen können. Bedenken Sie dabei das die Eingabe durchaus auch
 * andere Zeichen wie Schrägstriche oder Leerzeichen enthalten kann. Diese sollen einfach direkt ausgegeben werden sodass nur die Zeichen 0-9
 * mit einer String-Repräsentation ersetzt werden.
 */


//Musterlösung (Eine von vielen Möglichkeiten)
package tutorialCollections;
import java.util.HashMap;
import java.util.Scanner;

public class NumberMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
		String nummer;
		Scanner input = new Scanner(System.in);
		
		//Paare in der Map speichern
		numberMap.put(1, "Eins");
		numberMap.put(2, "Zwei");
		numberMap.put(3, "Drei");
		numberMap.put(4, "Vier");
		numberMap.put(5, "Fünf");
		numberMap.put(6, "Sechs");
		numberMap.put(7, "Sieben");
		numberMap.put(8, "Acht");
		numberMap.put(9, "Neun");
		numberMap.put(0, "Null");
		
		//Eingabe
		System.out.println("Bitte geben Sie die Telefonnumer ein:");
		nummer = input.nextLine();
		
		//Ausgabe
		System.out.println();
		for (int i = 0; i<nummer.length(); i++){
			
			Integer buf = new Integer (nummer.charAt(i)-'0');	//Erzeuge Integer-Wert aus Zeichen an Position i
			
			if (buf >= 0 && buf <= 9)							//Nur Zeichen 0-9 als String-Repräsentation ausgeben
				System.out.println(numberMap.get(buf));			//Hole String der der Nummer "buf" zugeordnet ist
			else
				System.out.println (nummer.charAt(i));			//Alle anderen Zeichen direkt ausgeben
		}
		
		//Scanner schließen
		input.close();
	}
}	