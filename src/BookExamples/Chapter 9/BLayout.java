import java.awt.*;

import java.awt.event.*;

class BLayout extends Frame
{
	Button b1, b2, b3, b4;
	BLayout()
	{ 
		this.setLayout (new BorderLayout()); // Setting the layout 
		b1 = new Button ("A");
		b2 = new Button ("B");
		b3 = new Button ("C");
		b4 = new Button ("D");
		this.add ("East",b1);
		this.add ("West", b2);
		this.add ("North", b3);
		this.add ("South", b4);

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

		BLayout b = new BLayout();
		b.setTitle ("Border Layout");// setting frame title 
		b.setSize (300,300);// setting frame size 
		b.setVisible (true);

	}

}
