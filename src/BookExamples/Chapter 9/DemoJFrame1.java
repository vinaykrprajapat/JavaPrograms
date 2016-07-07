import javax.swing.*;

class DemoJFrame1 extends JFrame
{
	public static void main (String args [])
	{

		DemoJFrame1 f = new DemoJFrame1();
		f.setTitle("Creating Jframe with close option");
		f.setSize (300,300);
		f.setVisible (true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Implementing close operation 

	}
}
