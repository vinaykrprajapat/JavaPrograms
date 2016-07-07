import java.awt.*;

import javax.swing.*;

class Jtab extends JFrame
{
	Jtab ()
	{ 
		Container c = getContentPane();
		JTabbedPane jt=new JTabbedPane(); 
		jt.addTab("Beverage", new beverage()); 

		// adding tab to JTabbedPane 
		jt.addTab("Pizza", new pizza()); // adding tab to JTabbedPane
		c.add (jt); // adding JTabbedPane object to container 
	}
	public static void main (String args [])
	{
		Jtab j = new Jtab();
		j.setTitle ("JTabbed Pane");
		j.setSize (250,250);
		j.setVisible (true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class beverage extends JPanel 
{
	beverage ( )
	{
		JRadioButton rb = new JRadioButton ("Coke");
		JRadioButton rb1 = new JRadioButton ("Pepsi");
		add(rb);
		add(rb1);
	}
}
class pizza extends JPanel 
{
	pizza( )
	{
		JCheckBox cb = new JCheckBox ("Classic");
		JCheckBox cb1 = new JCheckBox ("Capsicum-Mix");
		add(cb);
		add(cb1);
	}
}
