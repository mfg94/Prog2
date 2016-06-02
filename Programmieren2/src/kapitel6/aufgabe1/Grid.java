package kapitel6.aufgabe1;
// Grid.java
// This program draws an 8 x 8 grid
import javax.swing.*;

import java.awt.*;


@SuppressWarnings("serial")
public class Grid extends JPanel {
	
	public Grid() {
		setBackground(Color.red);
		
		// Geometrie des Gridpanels
		// Koordinaten beziehen sich auf das Koordinatensystem, in den der Grid hineinplatziert wird.
		setBounds(80, 100, 120, 120);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);	// wichtig: NIEMALS vergessen: bei Überschreibung immer erste Zeile!!
		int y = 10, x1 = 10;
		
		// Koordinaten beziehen sich auf das Grid Koordinatensystem
		for (int r = 1; r <= 8; r++, y += 10)
			g.drawLine(10, y, 80, y);

		for (int c = 1; c <= 8; c++, x1 += 10)
			g.drawLine(x1, 10, x1, 80);
	}

	
}
