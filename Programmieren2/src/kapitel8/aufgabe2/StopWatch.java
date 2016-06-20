package kapitel8.aufgabe2;

import java.util.Observable;

import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class StopWatch extends Observable implements ActionListener {

	double seconds;
	int delay;
	DecimalFormat df = new DecimalFormat("#0.0");
	Timer t;

	public StopWatch() {
		seconds = 0.0;
		delay = 100;
		t = new Timer(delay, this);
	}

	public void count() {
		seconds += 0.1;
	}

	public void reset() {
		seconds = 0.0;
	}

	public void stop() {
		t.stop();
	}

	public void start() {
		t.start();
	}

	public String toString() {
		return "Seconds: " + df.format(seconds);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setChanged();
		count();
		notifyObservers();
	}

}
