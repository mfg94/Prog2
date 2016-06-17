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

public class StopWatch extends JPanel implements ActionListener {

	final int delay = 100;
	double seconds = 0.0;
	final DecimalFormat df = new DecimalFormat("#0.0");
	final TitledBorder border = new TitledBorder(new LineBorder(Color.BLUE, 1), "Display");
	Timer t;

	public StopWatch() {
		this.setOpaque(false);
		this.setBorder(border);
		// this.setBounds(0, 0, 200, 80);
		border.setTitleColor(Color.BLUE);
		t = new Timer(delay, this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setFont(new Font("Courier New", Font.BOLD, 24));
		g.setColor(Color.BLUE);
		g.drawString("Seconds:\t\t" + df.format(seconds), 50, 40);

	}

	public void count() {
		this.t.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.seconds += 0.1;
		this.repaint();
	}

	public void stop() {
		this.t.stop();
	}

	public void reset() {
		this.seconds = 0;
		this.stop();
		this.repaint();
	}

}
