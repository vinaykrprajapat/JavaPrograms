import java.applet.*;
import java.awt.*;

/*
<applet code="MyFont.class" width=300 height=300>
</applet>
*/
public class MyFont extends Applet
{
	public void paint(Graphics g)
	{
		Font sans = new Font("SansSerif", Font.BOLD, 30);
		g.setFont(sans);
		g.drawString("Sans Serif", 10, 75);
		Font arial = new Font("Arial", Font.BOLD, 20);
		g.setFont(arial);
		g.drawString("Arial", 10, 150);
		Font times = new Font("Times New Roman", Font.BOLD, 30);
		g.setFont(times);
		g.drawString("Times New Roman", 10, 200);

	}
}
