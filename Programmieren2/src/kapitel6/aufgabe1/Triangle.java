package kapitel6.aufgabe1;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Triangle extends JPanel {

	public Triangle() {
		
		setBounds(80, 500, 100, 200);
		setBackground(Color.YELLOW);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawLine(10, 10, 80, 10); //Grundlinie
		g.drawLine(10, 10, 45, 80);
		g.drawLine(80, 10, 45, 80);
		
		
	}

}
