import java.awt.*;
import java.applet.*;
/*
<applet code="DrawArc.class" 
	width=500
	height=250>
</applet>
*/
public class DrawArc extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(200, 80, 80, 80, 0, 180);
	}
}
