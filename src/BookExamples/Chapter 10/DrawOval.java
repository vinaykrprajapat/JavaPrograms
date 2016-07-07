import java.awt.*;
import java.applet.*;
/*
<applet code="DrawOval.class" 
	width=200
	height=200>
</applet>
*/
public class DrawOval extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(15, 25, 60, 150);
	}
}
