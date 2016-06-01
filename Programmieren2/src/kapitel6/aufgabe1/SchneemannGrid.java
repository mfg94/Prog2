package kapitel6.aufgabe1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SchneemannGrid {

	public static void main(String args[]) {
		JFrame wnd = new JFrame("GraphikBeispiel");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		wnd.setSize(500, 800);
		wnd.setLocation(100, 100);
		
		Container c = wnd.getContentPane();
		
		
		
		Schneemann schneemann = new Schneemann();
		Grid grid = new Grid ();

		
		c.add(grid);
		c.add(schneemann);
		
		wnd.setVisible(true);
		
		
		
	}

}
