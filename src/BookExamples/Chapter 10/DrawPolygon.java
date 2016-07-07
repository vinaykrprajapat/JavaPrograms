import java.awt.*;
import java.applet.*;
/*
<applet code="DrawPolygon.class" 
	width=250
	height=250>
</applet>
*/
public class DrawPolygon extends Applet
{
	public void paint(Graphics g)
	{
		int xpoints[] = {25, 75, 125, 85, 125, 75, 25, 65};
		int ypoints[] = {50, 90, 50, 100, 150, 110, 150, 100};
		int num = 8;
		g.drawPolygon(xpoints, ypoints, num);
	}
}
