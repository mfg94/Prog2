package kapitel8.aufgabe1;

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

public class GUIMain extends JFrame {

	JPanel buttonPanel;
	JButton start;
	JButton stop;
	JButton reset;
	Container c;

	StopWatch timer;

	public GUIMain() {
		this.setTitle("Stoppuhr");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(10, 10));
		this.setSize(300, 150);

		buttonPanel = new JPanel();
		timer = new StopWatch();

		start = new JButton("Start");
		start.addActionListener(new CommandStart());

		stop = new JButton("Stop");
		stop.addActionListener(new CommandStop());
		stop.setEnabled(false);

		reset = new JButton("Reset");
		reset.addActionListener(new CommandReset());
		reset.setEnabled(false);

		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);

		this.add(timer, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);

		buttonPanel.setVisible(true);

	}

	public static void main(String[] args) {

		GUIMain main = new GUIMain();
		main.setVisible(true);

	}

	public class CommandStart implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.count();
			start.setEnabled(false);
			reset.setEnabled(true);
			stop.setEnabled(true);
		}
	}

	public class CommandStop implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.stop();
			start.setEnabled(true);
			stop.setEnabled(false);
		}
	}

	public class CommandReset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.reset();
			reset.setEnabled(false);
			stop.setEnabled(false);
			start.setEnabled(true);
		}
	}

}
