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

public class GUIMain extends JFrame implements ActionListener {

	JPanel panel;
	JButton start;
	JButton stop;
	JButton reset;
	

	Stoppuhr timer;

	public GUIMain() {
		this.setTitle("Stoppuhr");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 200);

		panel = new JPanel();
		panel.setLayout(null);

		timer = new Stoppuhr();

		start = new JButton("Start");
		start.setBounds(0, 50, 100, 50);
		start.addActionListener(this);

		stop = new JButton("Stop");
		stop.setBounds(100, 50, 100, 50);
		stop.addActionListener(this);
		stop.setEnabled(false);
		
		reset = new JButton("Reset");
		reset.setBounds(200,50,100,50);
		reset.addActionListener(this);
		reset.setEnabled(false);

		panel.add(timer);
		panel.add(start);
		panel.add(stop);
		panel.add(reset);

		this.add(panel);
		panel.setVisible(true);

	}

	public static void main(String[] args) {

		GUIMain main = new GUIMain();
		main.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			timer.count();
			start.setEnabled(false);
			reset.setEnabled(true);
			stop.setEnabled(true);
		} else if (e.getSource() == stop) {
			timer.stop();
			start.setEnabled(true);
			stop.setEnabled(false);
		} else if(e.getSource()==reset){
			timer.reset();
			reset.setEnabled(false);
			stop.setEnabled(false);
			start.setEnabled(true);
			
		}
		
	}

}
