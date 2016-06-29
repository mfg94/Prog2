package kapitel8.aufgabe3;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class NumberButton extends JButton {

	String number;
	Calculator tr;
	// static final DecimalFormat df = new DecimalFormat("#0");

	public NumberButton(String number, Calculator tr, JTextField iO) {
		super(number);
		this.number = number;
		setFocusPainted(false);
		setFocusable(false);

		ActionListener aL = e -> {
			iO.setText(iO.getText() + number);
		};
		addActionListener(aL);

	}

}
