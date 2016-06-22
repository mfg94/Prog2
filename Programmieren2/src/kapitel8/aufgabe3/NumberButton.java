package kapitel8.aufgabe3;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class NumberButton extends JButton {

	double number;
	Calculator tr;
	static final DecimalFormat df = new DecimalFormat("#0");

	public NumberButton(double number, Calculator tr, JTextField iO) {
		super(df.format(number));
		this.number = number;
		setFocusPainted(false);
		setFocusable(false);

		ActionListener aL = e -> {
			tr.setOperand(number);
			iO.setText(tr.toString());

		};
		addActionListener(aL);

	}

}
