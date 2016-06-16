package kapitel8;

import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.Timer;

public class Stoppuhr extends JPanel {

	final int delay = 100;
	double seconds = 0.0;
	final DecimalFormat df = new DecimalFormat("#0.0");
	final TitledBorder border = new TitledBorder(new LineBorder(Color.BLUE, 1), "Display");

	public Stoppuhr(double seconds) {
		this.setOpaque(false);
		this.setBorder(border);
		this.setBounds(0, 0, 200, 50);
		border.setTitleColor(Color.BLUE);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("Courier New", Font.BOLD, 24));
		g.setColor(Color.BLUE);
		g.drawString("Seconds:\t\t" + df.format(seconds), 10, 40);

	}

	public void count() {
		this.seconds += 0.1;
		this.repaint();
	}



}
