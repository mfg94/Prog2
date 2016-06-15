package tutorialExceptions1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionUebung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte String eingeben: ");
		String input = sc.nextLine();
		int intPut = 0;

		while (true) {
			System.out.print("\nBitte Integer eingeben: ");
			try {
				intPut = sc.nextInt();
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Bitte Integer eingeben!");
				continue;
			}
			break;
		}

		while (true) {
			try {
				System.out.println(input.charAt(intPut));
			} catch (IndexOutOfBoundsException e) {
				System.err.println("Keine gültige Position");
				continue;

			}
			break;
		}
	}

}
