import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
/*
<applet code="BouncingCircle.class" 
	width=400
	height=400>
</applet>
*/

public class BouncingCircle extends Applet implements Runnable
{
	int x = 150, y = 50, r = 30; // Position and radius of the circle
	int dx = 11, dy = 7; // Trajectory of circle
	Thread animatorTh; // The thread that perform the animation
	volatile boolean stopTh; // A flag to stop thread

	/** This method simply draws the circle at its current position */
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(x - r, y - r, r * 2, r * 2);
	}
	// This method moves circle.
	public void animateCircle()
	{
    	// Bounce if hit an edge.
		Rectangle bounds = getBounds();
		if ((x - r + dx < 0) || (x + r + dx > bounds.width))
		dx = -dx;
		if ((y - r + dy < 0) || (y + r + dy > bounds.height))
		dy = -dy;

		// Move the circle.
		x += dx;
		y += dy;

		repaint(); // to draw the circle in its new position
	}
	//This method is used to perform animation. 
	public void run()
	{
		while (!stopTh)
		{ 
			animateCircle(); // Update and request redraw
			try
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e)
			{	} 
		}
	}
	// Start animating when the browser starts the applet
	public void start()
	{
		animatorTh = new Thread(this); // Create a thread
		stopTh = false; 
		animatorTh.start(); // Start the thread.
	}
	// Stop animating when the browser stops the applet
	public void stop()
	{
		stopTh = true;
	}
}
