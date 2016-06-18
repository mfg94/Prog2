package kapitel8.aufgabe3;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.*;

public class TaschenrechnerView extends JFrame {
	private TextField iO;
	private InputButtons iP;
	

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

		iO = new TextField();
		iP = new InputButtons();
		
		iO.setEditable(false);
		
		JButton test = new JButton("TEst");
		JButton test2 = new JButton("TEst2");

		add(iO, BorderLayout.NORTH);
		add(iP);
		
		iP.setVisible(true);

	}

}
