package kapitel9.aufgabe3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.Timer;

public class Artikelverwaltung {

	enum Hosenmarken {
		Levis, Denim, Wrangler, Dickies, Esprit, Boss, MrLady
	};

	LinkedList<Artikel> artikel;

	public Artikelverwaltung(Artikel... artikel) {

		this.artikel = new LinkedList<Artikel>();

		for (Artikel a : artikel)
			this.artikel.add(a);

	}

	public void write(String filename) {

		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(filename, true);
			pw = new PrintWriter(fw);

			for (Artikel a : artikel) {
				pw.write(a.toString() + ",");
				pw.println();

			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (fw != null)
				pw.close();

		}

	}

	public static Artikel[] createList(int anz) {
		Artikel[] artikel = new Artikel[anz];
		int groesse;
		Kleidungsstueck.Farbe farbe;
		String bezeichnung;
		int schrittlaenge;

		for (int i = 0; i < anz; i++) {
			groesse = (int) (30 + (Math.random() * 11));
			farbe = Kleidungsstueck.Farbe.values()[(int) (Math.random() * (Kleidungsstueck.Farbe.values().length - 1))];
			bezeichnung = Hosenmarken.values()[(int) (Math.random() * (Hosenmarken.values().length - 1))].toString();
			schrittlaenge = (int) (380 + Math.random() * (41));

			artikel[i] = new Jeans(groesse, farbe, bezeichnung, schrittlaenge);

		}

		return artikel;
	}

	public static void main(String[] args) {
		Artikelverwaltung av = new Artikelverwaltung(Artikelverwaltung.createList(10));
		av.write("Artikel.txt");
		System.out.println(av);
	}

	public String toString() {
		return artikel.toString();
	}

}