import java.awt.*;
import java.applet.*;
/*
<applet code="DrawTriangle.class" 
 	width=300
 	height=300>
</applet>
*/
public class DrawTriangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10, 0, 10, 100);
		g.drawLine(10, 100, 100, 200);
		g.drawLine(100, 200, 10, 0);
	}
}
