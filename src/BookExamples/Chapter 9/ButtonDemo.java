import java.awt.*;

import java.awt.event.*;

class ButtonDemo extends Frame
{

	Button b1;
	ButtonDemo ()
	{ 
		this.setLayout (null); 
		b1 = new Button ("Save");
		b1.setBounds (100, 200, 70, 40);
		this.add (b1); 

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

		ButtonDemo c = new ButtonDemo();
		c.setTitle ("Adding Button"); // setting frame title 
		c.setSize (300,300); // setting frame size 
		c.setVisible (true);

	}
}
