package kapitel6.aufgabe2;

import java.awt.Container;

import javax.swing.JFrame;

public class GUIMain {
	
	public static void main(String[] args){
		// Fenster erzeugen
				JFrame wnd = new JFrame("Schneemann");
				wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				// ContentPane holen
				Container c = wnd.getContentPane();
				c.setLayout(null);		// bedeutet: die Lage der Panels richtet sich ausschließlich nach deren Koordinaten/Größe
				
				// Panels erzeugen
				// Geometrie der einzelnen Panels im jeweiligen Konstruktor
				
				c.setVisible(true);
				
				// Hauptfenster Geometrie setzen
				wnd.setSize(700, 900);
				wnd.setLocation(100, 100);
		
				wnd.setVisible(true);
	}

}
