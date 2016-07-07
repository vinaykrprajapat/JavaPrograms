import java.awt.*;

import java.awt.event.*;

class FLayout extends Frame
{

	Button b1, b2, b3, b4;
	FLayout()
	{ 
		this.setLayout (new FlowLayout (FlowLayout.CENTER)); 
		b1 = new Button ("A");
		b2 = new Button ("B");
		b3 = new Button ("C");
		b4 = new Button ("D");
		this.add (b1);
		this.add (b2);
		this.add (b3);
		this.add (b4);

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

		FLayout f = new FLayout();
		f.setTitle ("FlowLayout");// setting frame title 
		f.setSize (300,300);// setting frame size 
		f.setVisible (true);

	}
}
