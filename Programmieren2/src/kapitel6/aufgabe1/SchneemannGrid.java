package kapitel6.aufgabe1;

import javax.swing.JFrame;

public class SchneemannGrid {
	
	public static void main(String args[]) {
		JFrame wnd = new JFrame("GraphikBeispiel");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wnd.setSize(500, 800);
		wnd.setLocation(100, 100);
		wnd.setVisible(true);
		
		Grid grid = new Grid();	
		Schneemann schneemann = new Schneemann();
		
		wnd.add(grid);
		wnd.add(schneemann);
	
		
	}

}
