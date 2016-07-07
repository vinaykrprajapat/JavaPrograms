import java.awt.*;
import java.applet.*;
/*
<applet code="FillColorOval.class" 
	  width=200
	  height=200>
</applet>
*/
public class FillColorOval extends Applet
{
	public void paint(Graphics g)
	{
		setForeground(Color.blue);
		g.fillOval(20, 10, 150, 90);
	}
}
