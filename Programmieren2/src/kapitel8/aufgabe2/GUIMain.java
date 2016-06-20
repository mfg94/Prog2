package kapitel8.aufgabe2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GUIMain extends JFrame implements Observer {

	JPanel buttonPanel;
	JPanel timerPanel;
	JButton start;
	JButton stop;
	JButton reset;
	JButton newWindow;
	JLabel string;

	int x = 0;
	int y = 0;

	final TitledBorder border = new TitledBorder(new LineBorder(Color.BLUE, 1), "Display");

	StopWatch stopWatch;

	public GUIMain() {
		setTitle("Stoppuhr");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));
		setSize(300, 150);

		buttonPanel = new JPanel();
		stopWatch = new StopWatch();
		string = new JLabel(stopWatch.toString());

		createTimerPanel();

		start = new JButton("Start");
		start.addActionListener(new CommandStart());

		stop = new JButton("Stop");
		stop.addActionListener(new CommandStop());
		stop.setEnabled(false);

		reset = new JButton("Reset");
		reset.addActionListener(new CommandReset());
		reset.setEnabled(false);

		newWindow = new JButton("New");
		newWindow.addActionListener(new NewWindow());

		buttonPanel.add(start);
		buttonPanel.add(stop);
		buttonPanel.add(reset);
		buttonPanel.add(newWindow);

		add(timerPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		stopWatch.addObserver(this);

	}

	public void createTimerPanel() {
		timerPanel = new JPanel();
		timerPanel.setOpaque(false);
		timerPanel.setBorder(border);
		border.setTitleColor(Color.BLUE);

		string.setFont(new Font("Courier New", Font.BOLD, 24));
		string.setForeground(Color.BLUE);

		timerPanel.add(string);

	}

	public static void main(String[] args) {

		GUIMain main = new GUIMain();
		main.setVisible(true);

	}

	public class CommandStart implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stopWatch.start();
			start.setEnabled(false);
			reset.setEnabled(true);
			stop.setEnabled(true);
		}
	}

	public class CommandStop implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stopWatch.stop();
			start.setEnabled(true);
			stop.setEnabled(false);
		}
	}

	public class CommandReset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			stopWatch.reset();
			stopWatch.stop();
			reset.setEnabled(false);
			stop.setEnabled(false);
			start.setEnabled(true);
		}
	}

	public class NewWindow implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			TestFrame tf = new TestFrame(stopWatch, x, y);
			tf.setVisible(true);
			if (x >= 1200) {
				x = 0;
				y += 150;
			}
			x += 300;

		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		string.setText(stopWatch.toString());
		string.repaint();
	}

}
