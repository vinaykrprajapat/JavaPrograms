import java.awt.*;

import java.awt.event.*;

class Sbar extends Frame
{
	Scrollbar s1, s2;
	Sbar ()
	{ 
		this.setLayout (null);
		s1 = new Scrollbar (Scrollbar.VERTICAL);
		s1.setBounds(330,0,20,350);
		s2 = new Scrollbar (Scrollbar.HORIZONTAL);
		s2.setBounds(0,330,350,20);
		this.add (s1);
		this.add (s2);
		addWindowListener (new WindowAdapter()
		{
			public void windowClosing (WindowEvent e)
			{
				System.exit (0);
			}
		});
	}
	public static void main (String args [])
	{
		Sbar c = new Sbar();
		c.setTitle ("Adding Scrollbars");
		c.setSize (350,350);
		c.setVisible (true);
	}
} 
