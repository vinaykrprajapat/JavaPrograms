import java.awt.*;

import javax.swing.*;

import javax.swing.table.*;

class JTableDemo extends JFrame
{
	JTableDemo ()
	{ 
		Container c = getContentPane();
		c.setLayout (new BorderLayout());
		Object rows[ ][ ] = {
		{ "Deepak", "TW", "B+"},
		{ "Pardeep", "TW","B+"},
	};

	String col[ ] = {"Name", "Profile", "Blood Group"};
	JTable t= new JTable (rows, col);
	JTableHeader th = t.getTableHeader ();
	c.add("North", th);
	c.add("Center",t);
	}

	public static void main (String args [])
	{
		JTableDemo jt = new JTableDemo ();
		jt.setTitle ("Adding Table");
		jt.setSize (250,250);
		jt.setVisible (true);
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
