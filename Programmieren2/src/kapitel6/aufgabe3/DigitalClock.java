package kapitel6.aufgabe3;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DigitalClock extends JPanel {
	
	public DigitalClock(){
		this.setBounds(0,0,400,100);
		this.setOpaque(false);
		
		
	}

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Date now = new Date();
		
		
		g.setFont(new Font("Coruier New",Font.BOLD,24));
		g.setColor(Color.RED);
		g.drawString(now.toString() , 20,80);

	}

}
