import java.applet.*;
import java.awt.*;

/* <APPLET
	CODE=FontMetricsDemo.class
	WIDTH=200
	HEIGHT=200 >
</APPLET>  */
public class FontMetricsDemo extends Applet
{
	public void paint(Graphics g)
	{
		FontMetrics fontMatrics = g.getFontMetrics();
		g.setColor(Color.BLACK);

		// first set y to the first line on screen
		int y = fontMatrics.getHeight();

		// draw a line of text
		g.drawString("Java World",10,y);

		// center a line of text
		String str = "Java World Centered";
		int x = (getWidth()/2)-(fontMatrics.stringWidth(str)/2);
		y+=fontMatrics.getHeight(); // move down one line of text
		g.drawString(str,x,y);
	}
}
