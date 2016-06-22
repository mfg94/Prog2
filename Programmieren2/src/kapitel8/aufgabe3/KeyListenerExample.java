package codebeispiele;
/* Listing2906.java */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class KeyListenerExample extends JFrame implements KeyListener {
	String msg1 = "";
	String msg2 = "";
	JTextArea area;
	JScrollPane jScrollPane1;
	JLabel jLabel1;

	public KeyListenerExample() {
		super("Tastaturereignisse");
		addKeyListener(this);
		
		
		jScrollPane1 = new JScrollPane(jLabel1);
		jLabel1 = new JLabel();
		jLabel1.setText("No Key Events received");
		
		this.add(jLabel1,BorderLayout.SOUTH);
		
		JButton button = new JButton("Click setzt standardmässig den Focus auf den Button");
		// deshalb focus beim Button ausschalten
		button.setFocusable(false);
		this.add(button, BorderLayout.NORTH);
		
		// Focus für das Hauptfenster setzen
		this.setFocusable(true);
		
		setBackground(Color.lightGray);
		setSize(300, 200);
		setLocation(200, 100);
		setVisible(true);

	}

	public void paint(Graphics g) {
		super.paint(g);
		if (msg1.length() > 0) {
			draw3DRect(g, 20, 50, 250, 30);
			g.setColor(Color.black);
			g.drawString(msg1, 30, 70);
		}
		if (msg2.length() > 0) {
			draw3DRect(g, 20, 100, 250, 30);
			g.setColor(Color.black);
			g.drawString(msg2, 30, 120);
		}
	}

	void draw3DRect(Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.darkGray);
		g.drawLine(x, y, x, y + height);
		g.drawLine(x, y, x + width, y);
		g.setColor(Color.white);
		g.drawLine(x + width, y + height, x, y + height);
		g.drawLine(x + width, y + height, x + width, y);
	}

	public void keyPressed(KeyEvent event) {
		msg1 = "";
		System.out.println("key pressed: " + "key char = " + event.getKeyChar()
				+ "  " + "key code = " + event.getKeyCode());
		// if (event.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
		int key = event.getKeyCode();
		// Funktionstaste abfragen
		if (key == KeyEvent.VK_F1) {
			msg1 = "F1";
		} else if (key == KeyEvent.VK_F2) {
			msg1 = "F2";
		} else if (key == KeyEvent.VK_F3) {
			msg1 = "F3";
		}
		// Modifier abfragen
		if (msg1.length() > 0) {
			if (event.isAltDown()) {
				msg1 = "ALT + " + msg1;
			}
			if (event.isControlDown()) {
				msg1 = "STRG + " + msg1;
			}
			if (event.isShiftDown()) {
				msg1 = "UMSCHALT + " + msg1;
			}
		}
		// }
		jLabel1.setText(event.toString());
		repaint();
	}

	public void keyReleased(KeyEvent event) {
		System.out.println("key released");
		msg1 = "";
		repaint();
	}

	public void keyTyped(KeyEvent event) {
		char key = event.getKeyChar();
		System.out.println("key typed: " + key);
		if (key == KeyEvent.VK_BACK_SPACE) {
			if (msg2.length() > 0) {
				msg2 = msg2.substring(0, msg2.length() - 1);
			}
		} else if (key >= KeyEvent.VK_SPACE) {
			if (msg2.length() < 40) {
				msg2 += event.getKeyChar();
			}
		}
		
		// Modifier abfragen
		if (msg2.length() > 0) {
			if (event.isAltDown()) {
				msg2 = "ALT + " + msg2;
			}
			if (event.isControlDown()) {
				msg2 = "STRG + " + msg2;
			}
			if (event.isShiftDown()) {
				msg2 = "UMSCHALT + " + msg2;
			}
		}
		repaint();
	}

	

	
	
	public static void main(String[] args) {
		KeyListenerExample wnd = new KeyListenerExample();
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

