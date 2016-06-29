package kapitel8.aufgabe3;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class OpButton extends JButton {

	Calculator tr;
	Calculator.OpCode opc;
	JTextField iO;
	char op;

	public OpButton(Calculator.OpCode opc, Calculator tr, JTextField iO) {
		this.opc = opc;
		this.tr = tr;
		this.iO = iO;

		switch (opc) {
		case PLUS:
			op = '+';
			break;
		case MINUS:
			op = '-';
			break;
		case DIV:
			op = '/';
			break;
		case MULT:
			op = '*';
			break;
		case NO_OPERATOR:
			op = '=';
			break;

		}

		setText(Character.toString(op));

		ActionListener aL = e -> {
			if (iO.getText().contains("+") || iO.getText().contains("-") || iO.getText().contains("*")
					|| iO.getText().contains("/")) {

				tr.setOperand(Double.parseDouble(iO.getText().substring(iO.getText().indexOf(" ") + 2)));
				tr.calculate();
				tr.setOpcode(opc);

				if (op == '=') {
					iO.setText(Double.toString(tr.getResult()));
				} else {
					iO.setText(Double.toString(tr.getResult()) + " " + op + " ");
				}

			} else {
				tr.setOperand(Double.parseDouble(iO.getText()));
				tr.setOpcode(opc);
				iO.setText(iO.getText() + " " + op + " ");
			}

		};
		setFocusable(false);

		addActionListener(aL);

	}

}
