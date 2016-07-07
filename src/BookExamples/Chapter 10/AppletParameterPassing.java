import java.applet.Applet;
import java.awt.*;
/* <APPLET
	CODE=AppletParameterPassing.class
	WIDTH=200
	HEIGHT=200 >
	<PARAM NAME = company VALUE = "Kogent Learning Solutions">
</APPLET>  */
public class AppletParameterPassing extends Applet
{
	String company;
	public void start()
	{
		company = getParameter("company");
	}
	public void paint(Graphics g)
	{
		g.drawString(company, 10, 100);
	}
}
