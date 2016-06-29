package kapitel9.aufgabe2b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class IOTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StreamTokenizer st = new StreamTokenizer(br);

			System.out.println("Bitte Satz eingeben:\n");

			while (st.nextToken() != st.TT_EOL) {

				if (st.ttype == st.TT_WORD) {
					System.out.println("Word: " + st.sval);
				} else if (st.ttype == st.TT_NUMBER) {
					System.out.println("Nummer: " + st.nval);
				} else {
					System.out.println("Zeichen: " + (char) st.ttype);
				}

			}

			System.out.println(st.sval);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Wrong Input");
		}

	}

}
