package kapitel6.aufgabe3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import javax.swing.JFrame;

public class GUIMain extends JFrame {

	public static void main(String[] args) {

		int delay = 1000;

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = window.getContentPane();
		c.setLayout(null);
		c.setVisible(true);

		window.setSize(400, 200);
		window.setLocation(500, 500);
		window.setResizable(false);

		c.setBounds(100, 100, 400, 200);
		c.setBackground(Color.YELLOW);

		DigitalClock clock = new DigitalClock();

		c.add(clock);
		c.setVisible(true);

		window.setVisible(true);

		Timer t = new Timer(delay, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				c.repaint();

			}
		});

		t.start();

	}

}
