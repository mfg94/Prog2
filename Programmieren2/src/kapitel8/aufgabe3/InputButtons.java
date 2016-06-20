package kapitel8.aufgabe3;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.*;

public class InputButtons extends JPanel {
	final JButton zero = new JButton("0");
	final JButton one = new JButton("1");
	final JButton two = new JButton("2");
	final JButton three = new JButton("3");
	final JButton four = new JButton("4");
	final JButton five = new JButton("5");
	final JButton six = new JButton("6");
	final JButton seven = new JButton("7");
	final JButton eight = new JButton("8");
	final JButton nine = new JButton("9");
	final JButton dot = new JButton(".");
	final JButton equals = new JButton("=");
	final JButton multiply = new JButton("*");
	final JButton divide = new JButton("/");
	final JButton minus = new JButton("-");
	final JButton plus = new JButton("+");

	Taschenrechner tr;

	public InputButtons(Taschenrechner tr) {
		setLayout(new GridLayout(4, 4, 2, 2));

		add(seven);
		add(eight);
		add(nine);
		add(divide);

		add(four);
		add(five);
		add(six);
		add(multiply);

		add(one);
		add(two);
		add(three);
		add(minus);

		add(zero);
		add(dot);
		add(equals);
		add(plus);

		this.tr = tr;

	}

}
