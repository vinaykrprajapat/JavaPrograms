import java.awt.*;

import javax.swing.*;

class DemoLabText extends JFrame
{

	JLabel lab;
	JTextField t1;
	 DemoLabText ()
	{ 
		Container c = getContentPane();
		c.setLayout(null);

		lab = new JLabel ("Name");
		lab.setBounds (60, 60, 50, 50);

		t1 = new JTextField (30);
		t1.setBounds (130, 75, 120, 20);

		c.add (lab);
		c.add (t1);

	}

	public static void main (String args[])
	{

		DemoLabText lt = new DemoLabText ();
		lt.setTitle ("Adding Label and Text field "); 
		lt.setSize (300,300);
		lt.setVisible (true); 
		lt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
