package kapitel8.aufgabe3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;

public class CalculatorView extends JFrame{
	private JTextField iO;
	private ButtonPanel buttons;

	private Calculator tr;

	public CalculatorView(Calculator c) {
		setTitle("Taschenrechner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		setSize(260, 220);
		setResizable(false);
		setLayout(new BorderLayout());

		tr = c;

		iO = new JTextField();
		iO.setFont(new Font(null, Font.BOLD, 15));
		iO.setText("0");
		iO.setHorizontalAlignment(SwingConstants.RIGHT);

		buttons = new ButtonPanel(tr, iO);

		iO.setEditable(false);

		add(iO, BorderLayout.NORTH);
		add(buttons);

		buttons.setVisible(true);

	}

}
