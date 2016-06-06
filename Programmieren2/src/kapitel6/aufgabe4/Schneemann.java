package kapitel6.aufgabe4;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Schneemann extends JPanel {
	


	public Schneemann(){
		this.setBounds(20, 20, 440, 720);
				
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillOval(150, 80, 120, 120); //Kopf
		g.fillOval(58, 180, 300, 300); //Body
		g.fillRect(0, 250, 430, 40); // Arme
		g.setColor(Color.BLACK);
		g.fillRect(180, 0, 60, 60); //Hut oben
		g.fillRect(120, 60, 180, 30); //Hut unten
		g.fillOval(175, 115, 20, 10); // linkes Auge
		g.fillOval(225, 115, 20, 10); // rechtes Auge
		
		
		
	}
	
	

}
