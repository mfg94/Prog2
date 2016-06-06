package kapitel6.aufgabe4;
import java.awt.Container;
import javax.swing.JFrame;


public class GUIMain{

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Schneemann");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = window.getContentPane();
		c.setLayout(null);
		
		Schneemann sm = new Schneemann();
		c.add(sm);
		
		
		
		window.setSize(500, 800);
	
		window.setVisible(true);
		
		

	}

}
