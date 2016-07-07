import java.awt.*;

import java.awt.event.*;

class CheckRadioDemo extends Frame
{
	Label lab1, lab2;
	CheckboxGroup cb;
	Checkbox c1, c2, c3, c4;

	CheckRadioDemo ()
	{ 
		this.setLayout (null);

		lab1 = new Label ("Gender");
		lab1.setBounds (60, 100, 50, 50);
		lab2 = new Label ("Items:");
		lab2.setBounds (60, 140, 50, 50);

		cb = new CheckboxGroup();
		c1 = new Checkbox ("Male", cb, true); /* passing cb object to 
		checkbox class to make it radiobutton */
		c1.setBounds (130, 115, 60, 20);
		c2 = new Checkbox ("Female", cb,false);/* passing cb object to 
		checkbox class to make it radiobutton */
		c2.setBounds (200, 115, 60, 20);
		c3 = new Checkbox ("Pen");
		c3.setBounds (130, 155, 50, 20);
		c4 = new Checkbox ("Book");
		c4.setBounds (200, 155, 50, 20);
		this.add (lab1);
		this.add (lab2);

		this.add (c1);
		this.add (c2);
		this.add (c3);
		this.add (c4);
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
		CheckRadioDemo c = new CheckRadioDemo ();
		c.setTitle ("Adding Radio button and Check box");
		c.setSize (300,300);
		c.setVisible (true);
	}
}
