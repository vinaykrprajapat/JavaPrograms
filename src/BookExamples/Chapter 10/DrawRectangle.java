import java.awt.*;
import java.applet.*;
/*
<applet code="DrawRectangle.class" 
	width=200
	height=250>
</applet>
*/
public class DrawRectangle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(20, 40, 90, 90);
	}
}
