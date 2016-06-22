package kapitel8.aufgabe3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Number;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Taschenrechner {

	double first, second, result;
	static final char[] operations = { '+', '-', '*', '/' };
	char currentOperation;

	public Taschenrechner() {
		first = 0;
		second = 0;
		currentOperation = ' ';

	}

	public void addFirst(double i) {

	}

	public void addSecond(double i) {

	}

	public double doCalc(char c) {
		switch (c) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second;
			break;
		}
		return first = result;

	}

	// public double

}