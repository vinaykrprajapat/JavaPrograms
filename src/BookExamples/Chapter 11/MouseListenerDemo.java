// Example of using the MouseListener interface
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet CODE=MouseListenerDemo.class WIDTH=300 HEIGHT=200>
</applet>

*/

public class MouseListenerDemo extends Applet implements MouseListener
{
	public String myMessage = "x = ?, y = ?";

	public void init()
	{
		// tell the applet to listen for mouse related events
		addMouseListener(this); 
		repaint();
	}
	public void paint(Graphics g)
	{
		System.out.println("paint called");
		g.drawString(myMessage, 50, 50);
	}

	// Respond to a mouse press on applet
	public void mousePressed(MouseEvent me) 
	{
		// display the x and y coordinate of mouse pointer
		myMessage = "x = " + me.getX() + ", y = " + me.getY();
		System.out.println("mouse button pressed");	
		repaint();
	}
	// you must implement all the methods of MouseListener interface. 
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("mouse button clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		System.out.println("mouse enter in application area");
	}
	public void mouseExited(MouseEvent e)
	{
		System.out.println("mouse exit in application area");
	}
	public void mouseReleased(MouseEvent e)
	{
		System.out.println("mouse button released");
	}
}
