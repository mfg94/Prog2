package kapitel8.aufgabe2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class TestFrame extends JFrame implements Observer {
	
	JLabel string;
	JPanel timerPanel;
	final TitledBorder border = new TitledBorder(new LineBorder(Color.BLUE, 1), "Display");
	StopWatch stopwatch;

	public TestFrame(StopWatch stopwatch, int x, int y) {
		setTitle("Stoppuhr 2");
		setLayout(new BorderLayout(10, 10));
		setLocation(x, y);
		setSize(300, 150);
		
		this.stopwatch = stopwatch;
		
		stopwatch.addObserver(this);
		
		string = new JLabel(stopwatch.toString());
		
		createTimerPanel();
		add(timerPanel);
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

	@Override
	public void update(Observable arg0, Object arg1) {
		string.setText(stopwatch.toString());
		string.repaint();		
	}

}
