import java.awt.*;

import java.awt.event.*;

class CloseDemo1 extends Frame
{
	CloseDemo1 (String str)
	{
		super (str);
	}
	public static void main (String args [])
	{
		CloseDemo1 cd = new CloseDemo1("Closing the Frame window");
		cd.setSize (300,300);
		cd.setVisible (true);
		cd.addWindowListener(new WindowAdapter()
							{
								public void windowClosing(WindowEvent e)
								{
									System.exit (0);
								}
							});
	}
}
