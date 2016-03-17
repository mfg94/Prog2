package kapitel0.aufgabe1;

import java.util.Scanner;

public class BirthdayTest {

	public static void main(String[] args) {
		String birthday;

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Bitte Geburtsdatum eingeben: ");

			try {
				Birthday ab = new Birthday(sc.nextLine());
			} catch (InvalidBirthdayException e) {
				System.err.println("Ungültiges Datum!");
			}

		}

	}
}
