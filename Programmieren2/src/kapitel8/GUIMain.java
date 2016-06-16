package kapitel8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GUIMain {

	public static void main(String[] args) {
		JFrame stopWatch = new JFrame("StopWatch");
		stopWatch.setDefaultCloseOperation(3);
		stopWatch.setSize(600, 300);

		Container c = stopWatch.getContentPane();
		c.setLayout(null);

		Stoppuhr timer = new Stoppuhr(100.00234);
		JButton start = new JButton("Start");
		start.setBounds(50, 50, 150, 80);

		c.add(start);
		c.add(timer);

		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				timer.count();
				start.

			}
		});

		c.setVisible(true);
		stopWatch.setVisible(true);

	}

}
