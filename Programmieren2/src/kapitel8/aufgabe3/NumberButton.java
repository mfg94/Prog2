package kapitel8.aufgabe3;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;

public class NumberButton extends JButton {

	double number;
	static final DecimalFormat df = new DecimalFormat("#0");

	public NumberButton(double number) {
		super(df.format(number));
		this.number = number;

	}
	
	public double getValue(){
		return number;
	}

}
