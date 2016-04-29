package kapitel6.aufgabe1;

// Grid.java
// This program draws an 8 x 8 grid
import javax.swing.*;

import java.awt.*;

@SuppressWarnings("serial")
public class Grid extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int y = 30, x1 = 30;

		for (int r = 1; r <= 8; r++, y += 10)
			g.drawLine(30, y, 100, y);

		for (int c = 1; c <= 8; c++, x1 += 10)
			g.drawLine(x1, 30, x1, 100);
	}

	
}
