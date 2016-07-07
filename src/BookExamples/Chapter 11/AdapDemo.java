import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet CODE=AdapDemo.class WIDTH=300 HEIGHT=200>
</applet>

*/
public class AdapDemo extends Applet 
{
	public String myMessage = "x = ?, y = ?";

	public void init()
	{
		// tell the applet to listen for mouse related events
		addMouseListener(new MAdapter (this)); 
		
	}
	public void paint(Graphics g)
	{
		System.out.println("paint called");
		g.drawString(myMessage, 50, 50);
	}
}

class MAdapter extends MouseAdapter
{
	AdapDemo ad;
	MAdapter(AdapDemo ad)
	{
		this.ad=ad;
	}
	// Respond to a mouse press on applet
	public void mousePressed(MouseEvent me) 
	{
		// display the x and y coordinate of mouse pointer
		ad.myMessage = "x = " + me.getX() + ", y = " + me.getY();
		ad.repaint();
	}
}
