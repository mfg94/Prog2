package kapitel8.aufgabe3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

import javax.swing.*;

public class CalculatorView extends JFrame implements KeyListener {
	private JTextField iO;
	private ButtonPanel buttons;

	private JMenuBar menuBar;
	private JMenu ansicht, reset;
	private JMenuItem science, normal, resetB;

	private Calculator tr;

	public CalculatorView(Calculator c) {
		setTitle("Taschenrechner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		setSize(260, 220);
		setResizable(false);
		setLayout(new BorderLayout());
		setFocusable(true);
		addKeyListener(this);

		tr = c;

		iO = new JTextField();
		iO.setFont(new Font(null, Font.BOLD, 15));
		iO.setHorizontalAlignment(SwingConstants.RIGHT);

		buttons = new ButtonPanel(tr, iO);

		iO.setEditable(false);

		add(iO, BorderLayout.NORTH);
		add(buttons);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		ansicht = new JMenu("Ansicht");
		reset = new JMenu("Reset");

		resetB = new JMenuItem("Reset");
		science = new JMenuItem("Wissenschaftlich");
		normal = new JMenuItem("Standard");

		reset.add(resetB);

		ansicht.add(science);
		ansicht.add(normal);

		resetB.addActionListener(buttons.clear.getActionListeners()[0]);
		

		menuBar.add(ansicht);
		menuBar.add(reset);

		buttons.setVisible(true);

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == 10) {
			buttons.equals.doClick();
		} else if (e.getKeyChar() == 32) {
			buttons.equals.doClick();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		char key = e.getKeyChar();

		switch (key) {
		case '.':
			buttons.dot.doClick();
		case '1':
			buttons.one.doClick();
			break;
		case '2':
			buttons.two.doClick();
			break;
		case '3':
			buttons.three.doClick();
			break;
		case '4':
			buttons.four.doClick();
			break;
		case '5':
			buttons.five.doClick();
			break;
		case '6':
			buttons.six.doClick();
			break;
		case '7':
			buttons.seven.doClick();
			break;
		case '8':
			buttons.eight.doClick();
			break;
		case '9':
			buttons.nine.doClick();
			break;
		case '0':
			buttons.zero.doClick();
			break;
		case '+':
			buttons.plus.doClick();
			break;
		case '-':
			buttons.minus.doClick();
			break;
		case '*':
			buttons.multiply.doClick();
			break;
		case '/':
			buttons.divide.doClick();
			break;

		}

	}
	
	
}
