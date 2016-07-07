import java.awt.*;

import javax.swing.*;

class JTextDemo extends JFrame
{
	JTextArea t;
	JTextDemo ()
	{ 
		Container c = getContentPane();
		c.setLayout (null);

		t = new JTextArea (2, 20);
		t.setBounds(100, 120, 180, 100);
		c.add (t);

	}

	public static void main (String args [])
	{
		JTextDemo jt = new JTextDemo ();
		jt.setTitle ("Adding Text Area");
		jt.setSize (350,350);
		jt.setVisible (true);
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
