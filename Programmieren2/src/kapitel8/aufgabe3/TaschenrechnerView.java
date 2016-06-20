package kapitel8.aufgabe3;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;

public class TaschenrechnerView extends JFrame {
	private TextField iO;
	private InputButtons iP;

	private Taschenrechner tr;

	public static void main(String[] args) {
		TaschenrechnerView gui = new TaschenrechnerView();
		gui.setVisible(true);

	}

	public TaschenrechnerView() {
		setTitle("Taschenrechner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(300, 300);
		setSize(200, 230);
		setResizable(false);
		setLayout(new BorderLayout());

		tr = new Taschenrechner();
		iO = new TextField();
		iP = new InputButtons(tr);

		iO.setEditable(false);

		add(iO, BorderLayout.NORTH);
		add(iP);

		iP.setVisible(true);

	}

}
