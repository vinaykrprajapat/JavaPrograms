import java.awt.*;
import java.applet.*;
/*
<applet code="DrawLine.class" 
	  width=200
	  height=100>
</applet>
*/
public class DrawLine extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0, 0, 100, 100);
	}
}
