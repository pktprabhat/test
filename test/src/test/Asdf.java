package test;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Asdf extends Applet implements KeyListener{
	
	String msg="";
	int mx=10,my=10;
	int ke;
	public void init() {

		addKeyListener(this);
	}
	public void start() {
	}
	public void paint(Graphics g) {
		
		g.drawString(msg, mx, my);
		g.drawString(String.valueOf(KeyEvent.VK_ENTER), 50, 50);
}
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	 ke=arg0.getKeyCode();
	 showStatus(String.valueOf(ke));
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		showStatus("key up");
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		msg +=arg0.getKeyChar();
		repaint();
	}
}