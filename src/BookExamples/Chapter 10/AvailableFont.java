import java.applet.*;
import java.awt.*;
/*
<applet code="AvailableFont.class" width=550 height=600>
</applet>
*/
public class AvailableFont extends Applet
{
	public void paint(Graphics g)
	{
		int j=25;
		GraphicsEnvironment env = 
		GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontNames = env.getAvailableFontFamilyNames();
		g.drawString("Fonts available on this platform:", 4, 15);
		for (int i = 0; i < fontNames.length; i++)
		{
			g.drawString(fontNames[i], 4, j);
			j+=15;
		}
	}
}
