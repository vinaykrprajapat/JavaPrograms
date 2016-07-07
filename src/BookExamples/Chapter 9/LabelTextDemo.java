import java.awt.*;

import java.awt.event.*;

class LabelTextDemo extends Frame
{

	Label lab;
	TextField t1;
	LabelTextDemo ()
	{ 
		this.setLayout (null);

		lab = new Label ("Name"); 
		lab.setBounds (60, 60, 50, 50);

		t1 = new TextField (30);
		t1.setBounds (130, 75, 120, 20);

		this.add (lab);
		this.add (t1);

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

		LabelTextDemo c = new LabelTextDemo ();
		c.setTitle ("Adding Label and Text field "); 
		c.setSize (300,300);
		c.setVisible (true); 

	}
}
