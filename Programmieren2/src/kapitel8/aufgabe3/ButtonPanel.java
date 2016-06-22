package kapitel8.aufgabe3;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonPanel extends JPanel {
	final JButton zero;
	final JButton one;
	final JButton two;
	final JButton three;
	final JButton four;
	final JButton five;
	final JButton six;
	final JButton seven;
	final JButton eight;
	final JButton nine;
	final JButton dot = new JButton(".");
	final JButton equals = new JButton("=");
	final JButton multiply = new JButton("*");
	final JButton divide = new JButton("/");
	final JButton minus = new JButton("-");
	final JButton plus = new JButton("+");

	Taschenrechner tr;

	public ButtonPanel(Taschenrechner tr) {
		setLayout(new GridLayout(4, 4, 2, 2));

		add(seven = new NumberButton(7));
		add(eight = new NumberButton(8));
		add(nine = new NumberButton(9));

		add(divide);

		add(four = new NumberButton(4));
		add(five = new NumberButton(5));
		add(six = new NumberButton(6));

		add(multiply);

		add(one = new NumberButton(1));
		add(two = new NumberButton(2));
		add(three = new NumberButton(3));

		add(minus);

		add(zero = new NumberButton(0));

		add(dot);
		add(equals);
		add(plus);

		this.tr = tr;

	}

}
