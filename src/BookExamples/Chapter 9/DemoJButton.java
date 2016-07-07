import java.awt.*;

import javax.swing.*;

class DemoJButton extends JFrame
{
	JButton b1, b2;
	DemoJButton ()
	{ 
		Container c= getContentPane();
		c.setLayout(null);

		b1 = new JButton ("Red");
		b1.setMnemonic('R'); // Setting the mnemonic 
		b1.setBounds (80, 100, 70, 40);
		b2 = new JButton ("Green");
		b2.setMnemonic('G'); // Setting the mnemonic
		b2.setBounds (175, 100, 70, 40);
		c.add (b1);
		c.add (b2);

	}

public static void main (String args [])
	{
		DemoJButton b = new DemoJButton ();
		b.setTitle ("Adding Button"); 
		b.setSize (300,300); 
		b.setVisible (true);
		b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
