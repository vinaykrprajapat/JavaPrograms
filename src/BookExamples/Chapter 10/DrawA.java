import java.awt.*;
import java.applet.*;
/*
<applet code="DrawA.class" 
			  width=500
			  height=250>
</applet>
*/
public class DrawA extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.red);
		g.drawLine(48, 25, 24, 100);
		g.drawLine(48, 25, 69, 100);
		g.drawLine(33, 69, 59, 69);
	}
}
