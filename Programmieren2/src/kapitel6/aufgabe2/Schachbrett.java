package kapitel6.aufgabe2;
import java.awt.Color;

import java.awt.Font;
import java.awt.Graphics;


import javax.swing.*;


public class Schachbrett extends JPanel {

	Font schrift = new Font("Courier New", Font.BOLD, 20);
	Color f1;
	Color f2;

	public Schachbrett() {

		this.setBackground(Color.YELLOW);
		this.setBounds(100, 100, 440, 440);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int feldNr = 1;
		int x = 20, y = 20;

		for (int row = 1; row <= 8; row++) {

			if (row % 2 == 0) {
				f1 = Color.BLACK;
				f2 = Color.WHITE;
			} else {
				f1 = Color.WHITE;
				f2 = Color.BLACK;
			}

			for (int j = 1; j <= 4; j++) {
				drawAndFillRect(g, f1, x, y, feldNr);
				x += 50;
				feldNr++;
				drawAndFillRect(g, f2, x, y, feldNr);
				x += 50;
				feldNr++;
			}

			x = 20;
			y += 50;

		}

	}

	public void drawAndFillRect(Graphics g, Color c, int x, int y, int feldNr) {
		g.setColor(c);
		g.fillRect(x, y, 50, 50);

		g.setColor(Color.RED);
		g.setFont(schrift);
		g.drawString(Integer.toString(feldNr), x + 14, y + 32);

	}

}
