package kapitel8.aufgabe3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import kapitel8.aufgabe3.Calculator.OpCode;

public class ButtonPanel extends JPanel {

	JPanel numbers;
	JPanel operators;

	JTextField iO;

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
	final JButton dot;
	final JButton clear;

	final JButton multiply;
	final JButton divide;
	final JButton minus;
	final JButton plus;
	final JButton equals;

	Calculator tr;

	public ButtonPanel(Calculator tr, JTextField iO) {

		setLayout(new BorderLayout());

		operators = new JPanel();
		operators.setLayout(new GridLayout(5, 0, 0, 0));

		numbers = new JPanel();
		numbers.setLayout(new GridLayout(4, 3, 0, 0));

		numbers.add(seven = new NumberButton(7, tr, iO));
		numbers.add(eight = new NumberButton(8, tr, iO));
		numbers.add(nine = new NumberButton(9, tr, iO));

		numbers.add(four = new NumberButton(4, tr, iO));
		numbers.add(five = new NumberButton(5, tr, iO));
		numbers.add(six = new NumberButton(6, tr, iO));

		numbers.add(one = new NumberButton(1, tr, iO));
		numbers.add(two = new NumberButton(2, tr, iO));
		numbers.add(three = new NumberButton(3, tr, iO));

		numbers.add(zero = new NumberButton(0, tr, iO));
		numbers.add(dot = new JButton("."));

		numbers.add(clear = new JButton("Clear"));
		ActionListener reset = e -> {
			tr.reset();
			iO.setText(tr.toString());
		};
		clear.addActionListener(reset);

		operators.add(plus = new OpButton(OpCode.PLUS, tr, iO));
		operators.add(minus = new OpButton(OpCode.MINUS, tr, iO));
		operators.add(multiply = new OpButton(OpCode.MULT, tr, iO));
		operators.add(divide = new OpButton(OpCode.DIV, tr, iO));

		operators.add(equals = new JButton("="));
		ActionListener calculate = e -> {
			tr.calculate();
			iO.setText(tr.toString());
		};
		equals.addActionListener(calculate);

		add(numbers, BorderLayout.CENTER);
		add(operators, BorderLayout.EAST);

		this.tr = tr;
		this.iO = iO;

	}

}
