import java.awt.*;

import java.awt.event.*;

class CloseDemo extends Frame
{
	CloseDemo (String str) 
	{
		super (str);
	}

	public static void main (String args []) 
	{

		CloseDemo cd = new CloseDemo("Closing the Frame window");
		cd.setSize (300,300);
		cd.setVisible (true);
		cd.addWindowListener (new Demo());
	}
}


class Demo extends WindowAdapter 
{
	public void windowClosing (WindowEvent e) 
	{
		System.exit(0);
	}
}
