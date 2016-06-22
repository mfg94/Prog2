package kapitel8.aufgabe3;

import javax.swing.JFrame;

public class CalculatorGUI {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		CalculatorView view = new CalculatorView(c);
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setVisible(true);
	}

}
