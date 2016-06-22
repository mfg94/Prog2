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
			op = ' ';
			break;

		}

		setText(Character.toString(op));

		ActionListener aL = e -> {
			tr.setOpcode(opc);
			iO.setText(tr.toString());

		};
		setFocusable(false);

		addActionListener(aL);

	}

}
