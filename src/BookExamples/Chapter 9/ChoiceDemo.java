import java.awt.*;

import java.awt.event.*;

class ChoiceDemo extends Frame
{
	Label lab; 
	Choice ch;
	ChoiceDemo()
	{ 
		this.setLayout (null);

		lab = new Label ("Country");
		lab.setBounds (60, 130, 50, 50);

		ch = new Choice ();
		ch.add ("INDIA");
		ch.add ("PAKISTAN");
		ch.setBounds (130,145, 100, 20);

		this.add (lab);
		this.add (ch);
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
		ChoiceDemo c = new ChoiceDemo();
		c.setTitle ("Creating Pop-up choice menu");
		c.setSize (350,350);
		c.setVisible (true);
	}
}
