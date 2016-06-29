package kapitel9.aufgabe2a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EingabeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int zahlen[] = new int[5];
		int sum = 0;

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Bitte " + (i + 1) + ". Zahl eingeben: ");
				zahlen[i] = Integer.parseInt(in.readLine());
			}
			for (int i : zahlen) {
				System.out.print(i + " + ");
				sum += i;

			}

			System.out.println(" = " + sum);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Wrong Input");
		}

		System.out.println();

	}

}
